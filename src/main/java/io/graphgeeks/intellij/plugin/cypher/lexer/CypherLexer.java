package io.graphgeeks.intellij.plugin.cypher.lexer;

import com.intellij.lexer.Lexer;
import com.intellij.lexer.LexerPosition;
import com.intellij.psi.tree.IElementType;
import io.graphgeeks.intellij.plugin.cypher.lexer.token.Token;
import io.graphgeeks.intellij.plugin.cypher.lexer.token.TokenParser;
import io.graphgeeks.intellij.plugin.cypher.lexer.util.CypherLexerPosition;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static io.graphgeeks.intellij.plugin.cypher.util.ListUtils.getSafe;
import static java.lang.String.format;

/**
 * Parse input into tokens.
 *
 * @author dmitry.vrublevsky@graphgeeks.io
 */
public class CypherLexer extends Lexer {

    private static final Logger logger = Logger.getLogger(CypherLexer.class);
    private final TokenParser tokenParser;
    private CharSequence buffer;
    private int startOffset;
    private int endOffset;

    private List<Token> currentTokenList;
    private int currentTokenPosition;
    private Token currentToken;
    private int currentOffset;

    public CypherLexer() {
        super();
        tokenParser = new TokenParser();
    }

    @Override
    public void start(@NotNull CharSequence buffer, int startOffset, int endOffset, int initialState) {
        logger.info(format("Start lexer at %s, %s, %s", startOffset, endOffset, initialState));
        logger.info(format("File content: [%s]", buffer));

        this.buffer = buffer;
        this.startOffset = startOffset;
        this.endOffset = endOffset;
        this.currentTokenPosition = initialState;

        currentOffset = startOffset;
        currentToken = null;
        currentTokenList = null;

        if (buffer.length() > 0) {
            currentTokenList = tokenParser.parse(String.valueOf(buffer));
            currentToken = getSafe(currentTokenList, currentTokenPosition);
            if (currentToken != null) {
                currentOffset = currentToken.getStartOffset();
            }
        }
    }

    @Override
    public int getState() {
        return currentTokenPosition;
    }

    @Nullable
    @Override
    public IElementType getTokenType() {
        if (currentToken != null) {
            return currentToken.getTokenType();
        } else {
            return null;
        }
    }

    @Override
    public int getTokenStart() {
        return currentToken.getStartOffset();
    }

    @Override
    public int getTokenEnd() {
        return currentToken.getEndOffset();
    }

    @Override
    public void advance() {
        currentToken = getSafe(currentTokenList, currentTokenPosition + 1);
        if (currentToken != null) {
            currentOffset = currentToken.getStartOffset();
            currentTokenPosition++;
        } else {
            currentOffset = endOffset;
        }
    }

    @NotNull
    @Override
    public LexerPosition getCurrentPosition() {
        return new CypherLexerPosition(currentOffset, getState());
    }

    @Override
    public void restore(@NotNull LexerPosition position) {
        currentTokenPosition = position.getState();
        currentToken = currentTokenList.get(position.getState());
        currentOffset = currentToken.getStartOffset();
    }

    @NotNull
    @Override
    public CharSequence getBufferSequence() {
        return buffer;
    }

    @Override
    public int getBufferEnd() {
        return buffer.length();
    }
}
