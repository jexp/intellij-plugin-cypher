package io.graphgeeks.intellij.plugin.cypher.lexer.token.ast;

import io.graphgeeks.intellij.plugin.cypher.lexer.token.Token;
import org.neo4j.cypher.internal.frontend.v2_3.ast.ASTNode;
import org.neo4j.cypher.internal.frontend.v2_3.ast.Clause;
import org.neo4j.cypher.internal.frontend.v2_3.ast.SingleQuery;

import java.util.List;

import static io.graphgeeks.intellij.plugin.cypher.lexer.token.Tokens.tokenFor;
import static io.graphgeeks.intellij.plugin.cypher.util.ListUtils.getNext;
import static scala.collection.JavaConversions.seqAsJavaList;

/**
 * Token for {@link SingleQuery} ast node.
 *
 * @author dmitry.vrublevsky@graphgeeks.io
 */
public class SingleQueryToken extends Token {

    private final SingleQuery singleQuery;

    public SingleQueryToken(SingleQuery singleQuery) {
        this.singleQuery = singleQuery;
    }

    @Override
    public void navigate(NodeVisitor nodeVisitor, Token parent,
                         Token prev, ASTNode next) {
        nodeVisitor.visit(this);

        int startOffset = singleQuery.position().offset();
        int endOffset;
        if (next == null) {
            endOffset = parent.getSize().getEndOffset();
        } else {
            endOffset = next.position().offset() - 1;
        }
        initSize(startOffset, endOffset);

        List<Clause> clauses = seqAsJavaList(singleQuery.clauses());

        Token prevClause = null;
        for (int i = 0; i < clauses.size(); i++) {
            Token currentToken = tokenFor(clauses.get(i));
            currentToken.navigate(nodeVisitor, this, prevClause, getNext(clauses, i));
            prevClause = currentToken;
        }
    }

    @Override
    public ASTNode getUnderlyingAstNode() {
        return singleQuery;
    }
}
