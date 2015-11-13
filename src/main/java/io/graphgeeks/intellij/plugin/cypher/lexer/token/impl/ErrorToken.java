package io.graphgeeks.intellij.plugin.cypher.lexer.token.impl;

import com.intellij.psi.tree.IElementType;
import io.graphgeeks.intellij.plugin.cypher.lexer.token.Token;
import io.graphgeeks.intellij.plugin.cypher.psi.CypherTokenTypes;
import org.parboiled.errors.ParseError;

/**
 * Token that points to error.
 *
 * @author dmitry.vrublevsky@graphgeeks.io
 */
public class ErrorToken extends Token {

    private final ParseError parseError;

    public ErrorToken(ParseError parseError) {
        this.parseError = parseError;
    }

    @Override
    public String getName() {
        return "ERROR";
    }

    @Override
    public IElementType getTokenType() {
        return CypherTokenTypes.ERROR;
    }

    @Override
    public int getStartOffset() {
        return parseError.getStartIndex();
    }

    @Override
    public int getEndOffset() {
        return parseError.getEndIndex();
    }
}
