package io.graphgeeks.intellij.plugin.cypher.lexer.token.impl;

import com.intellij.psi.tree.IElementType;
import io.graphgeeks.intellij.plugin.cypher.lexer.token.Token;
import io.graphgeeks.intellij.plugin.cypher.psi.CypherTokenTypes;

/**
 * Represents token with any text
 *
 * @author dmitry.vrublevsky@graphgeeks.io
 */
public class AnyTextToken extends Token {

    private final int startOffset;
    private final int endOffset;

    public AnyTextToken(int startOffset, int endOffset) {
        this.startOffset = startOffset;
        this.endOffset = endOffset;
    }

    @Override
    public String getName() {
        return "ANY TEXT";
    }

    @Override
    public IElementType getTokenType() {
        return CypherTokenTypes.ANY_TEXT;
    }

    @Override
    public int getStartOffset() {
        return startOffset;
    }

    @Override
    public int getEndOffset() {
        return endOffset;
    }
}
