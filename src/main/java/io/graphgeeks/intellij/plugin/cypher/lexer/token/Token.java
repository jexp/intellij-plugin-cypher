package io.graphgeeks.intellij.plugin.cypher.lexer.token;

import com.intellij.psi.tree.IElementType;
import io.graphgeeks.intellij.plugin.cypher.lexer.token.impl.AnyTextToken;
import io.graphgeeks.intellij.plugin.cypher.lexer.token.impl.CommonToken;
import io.graphgeeks.intellij.plugin.cypher.lexer.token.impl.ErrorToken;
import org.parboiled.Node;
import org.parboiled.errors.ParseError;

/**
 * Parent class for all tokens.
 * Provides all necessary methods for lexer.
 *
 * @author dmitry.vrublevsky@graphgeeks.io
 */
public abstract class Token {

    static Token create(Node<?> node) {
        return new CommonToken(node);
    }

    static Token createAnyText(int startOffset, int endOffset) {
        return new AnyTextToken(startOffset, endOffset);
    }

    static Token createError(ParseError parseError) {
        return new ErrorToken(parseError);
    }

    public abstract String getName();

    public abstract IElementType getTokenType();

    public abstract int getStartOffset();

    public abstract int getEndOffset();

    @Override
    public String toString() {
        return String.format("Token [%s] %s:%s", getName(), getStartOffset(), getEndOffset());
    }
}
