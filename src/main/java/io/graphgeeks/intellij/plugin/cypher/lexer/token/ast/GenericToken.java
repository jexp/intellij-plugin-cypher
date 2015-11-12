package io.graphgeeks.intellij.plugin.cypher.lexer.token.ast;

import io.graphgeeks.intellij.plugin.cypher.lexer.token.Token;
import org.neo4j.cypher.internal.frontend.v2_3.ast.ASTNode;
import scala.collection.Iterator;

import java.util.ArrayList;
import java.util.List;

import static io.graphgeeks.intellij.plugin.cypher.lexer.token.Tokens.tokenFor;
import static io.graphgeeks.intellij.plugin.cypher.util.ListUtils.getNext;

/**
 * Generic Token implementation.
 * Optimistically assumes generic token case.
 *
 * @author dmitry.vrublevsky@graphgeeks.io
 */
public class GenericToken extends Token {

    private final ASTNode node;

    public GenericToken(ASTNode node) {
        this.node = node;
    }

    @Override
    public void navigate(NodeVisitor nodeVisitor, Token parent, Token prev, ASTNode next) {
        nodeVisitor.visit(this);

        int startOffset = node.position().offset();
        int endOffset;
        if (next == null) {
            endOffset = parent.getSize().getEndOffset();
        } else {
            endOffset = next.position().offset() - 1;
        }

        initSize(startOffset, endOffset);


        List<ASTNode> astNodes = new ArrayList<>();

        Iterator<Object> iterator = node.productIterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            if (object instanceof ASTNode) {
                astNodes.add((ASTNode) object);
            }
        }

        Token prevToken = null;
        for (int i = 0; i < astNodes.size(); i++) {
            Token currentToken = tokenFor(astNodes.get(i));
            currentToken.navigate(nodeVisitor, this, prevToken, getNext(astNodes, i));
            prevToken = currentToken;
        }
    }

    @Override
    public ASTNode getUnderlyingAstNode() {
        return node;
    }
}
