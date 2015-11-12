package io.graphgeeks.intellij.plugin.cypher.lexer.token.ast;

import io.graphgeeks.intellij.plugin.cypher.lexer.token.Token;
import org.neo4j.cypher.internal.frontend.v2_3.ast.ASTNode;
import org.neo4j.cypher.internal.frontend.v2_3.ast.Query;

import static io.graphgeeks.intellij.plugin.cypher.lexer.token.Tokens.tokenFor;

/**
 * Token for {@link Query} ast node.
 *
 * @author dmitry.vrublevsky@graphgeeks.io
 */
public class QueryToken extends Token {

    private final Query query;

    public QueryToken(Query query) {
        this.query = query;
    }

    @Override
    public void navigate(NodeVisitor nodeVisitor, Token parent,
                         Token prev, ASTNode next) {
        nodeVisitor.visit(this);

        int startOffset;
        if (prev == null) {
            startOffset = parent.getSize().getStartOffset();
        } else {
            startOffset = prev.getSize().getEndOffset() + 1;
        }
        int endOffset = query.position().offset();

        initSize(startOffset, endOffset);

        tokenFor(query.part()).navigate(nodeVisitor, this, null, null);
    }

    @Override
    public ASTNode getUnderlyingAstNode() {
        return query;
    }
}
