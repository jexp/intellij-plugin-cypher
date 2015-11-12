package io.graphgeeks.intellij.plugin.cypher.lexer.token;

import org.neo4j.cypher.internal.frontend.v2_3.ast.ASTNode;

/**
 * Parent class for all tokens.
 * Provides all necessary methods for lexer.
 *
 * @author dmitry.vrublevsky@graphgeeks.io
 */
public abstract class Token {

    protected TokenSize tokenSize;

    public abstract void navigate(NodeVisitor nodeVisitor, Token parent,
                                  Token prev, ASTNode next);

    public abstract ASTNode getUnderlyingAstNode();

    public TokenSize getSize() {
        if (tokenSize == null) {
            throw new RuntimeException("Token size not initialized");
        }
        return tokenSize;
    }

    @Override
    public String toString() {
        ASTNode node = getUnderlyingAstNode();
        return node.productPrefix() + " [" + getSize() + "]";
    }

    protected void initSize(int startOffset, int endOffset) {
        tokenSize = TokenSize.from(startOffset, endOffset);
    }

    public interface NodeVisitor {
        void visit(Token token);
    }

    public static class TokenSize {
        private final int startOffset;
        private final int endOffset;

        public TokenSize(int startOffset, int endOffset) {
            if (startOffset >= endOffset) {
                throw new RuntimeException(
                        String.format("Start offset is greater or equal to end offset - [%s:%s]", startOffset, endOffset));
            }
            this.startOffset = startOffset;
            this.endOffset = endOffset;
        }

        public int getStartOffset() {
            return startOffset;
        }

        public int getEndOffset() {
            return endOffset;
        }

        @Override
        public String toString() {
            return String.format("%s:%s", startOffset, endOffset);
        }

        public static TokenSize from(int start, int end) {
            return new TokenSize(start, end);
        }
    }
}
