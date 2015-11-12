package io.graphgeeks.intellij.plugin.cypher.lexer.token;

import org.neo4j.cypher.internal.frontend.v2_3.ast.ASTNode;

/**
 * Represent root token
 *
 * @author dmitry.vrublevsky@graphgeeks.io
 */
public class RootToken extends Token {

    private final TokenSize tokenSize;

    public RootToken(String source) {
        tokenSize = TokenSize.from(0, source.length() - 1);
    }

    @Override
    public void navigate(NodeVisitor nodeVisitor, Token parent,
                         Token prev, ASTNode next) {
        throw new UnsupportedOperationException("Can't navigate from root token");
    }

    @Override
    public ASTNode getUnderlyingAstNode() {
        throw new UnsupportedOperationException("Can't get ast node from root token");
    }

    @Override
    public TokenSize getSize() {
        return tokenSize;
    }
}
