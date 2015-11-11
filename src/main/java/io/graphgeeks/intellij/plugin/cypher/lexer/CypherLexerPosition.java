package io.graphgeeks.intellij.plugin.cypher.lexer;

import com.intellij.lexer.LexerPosition;

public class CypherLexerPosition implements LexerPosition {

    private final int offset;
    private final int state;

    public CypherLexerPosition(int offset, int state) {
        this.offset = offset;
        this.state = state;
    }

    @Override
    public int getOffset() {
        return offset;
    }

    @Override
    public int getState() {
        return state;
    }
}
