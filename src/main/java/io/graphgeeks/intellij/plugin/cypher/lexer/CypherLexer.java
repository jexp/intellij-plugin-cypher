package io.graphgeeks.intellij.plugin.cypher.lexer;

import com.intellij.lang.Language;
import com.intellij.lexer.Lexer;
import com.intellij.lexer.LexerPosition;
import com.intellij.psi.tree.IElementType;
import io.graphgeeks.intellij.plugin.cypher.lexer.token.TokenList;
import io.graphgeeks.intellij.plugin.cypher.lexer.token.TokenParser;
import io.graphgeeks.intellij.plugin.cypher.lexer.util.CypherLexerPosition;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static java.lang.String.format;

/**
 * Parse input into tokens.
 *
 * @author dmitry.vrublevsky@graphgeeks.io
 */
public class CypherLexer extends Lexer {

    private static final IElementType EMPTY_TOKEN_TYPE = new IElementType("empty_token", Language.ANY);

    private static final Logger logger = Logger.getLogger(CypherLexer.class);
    private final TokenParser tokenParser;
    private CharSequence buffer;
    private int startOffset;
    private int endOffset;
    private int currentOffset;

    private TokenList currentTokenList;
    private int currentTokenPosition;

    public CypherLexer() {
        super();
        tokenParser = new TokenParser();
    }

    @Override
    public void start(@NotNull CharSequence buffer, int startOffset, int endOffset, int initialState) {
//        String workBuffer = String.valueOf(buffer.subSequence(startOffset, endOffset));

        logger.info(format("Start lexer at %s, %s, %s", startOffset, endOffset, initialState));
        logger.info(format("File content: [%s]", buffer));
        this.buffer = buffer;
        this.startOffset = startOffset;
        this.endOffset = endOffset;
        this.currentOffset = startOffset;

//        currentTokenList = tokenParser.parse(workBuffer);
    }

    @Override
    public int getState() {
        return 0;
    }

    @Nullable
    @Override
    public IElementType getTokenType() {
        return currentOffset < endOffset ? EMPTY_TOKEN_TYPE : null;
    }

    @Override
    public int getTokenStart() {
        return currentOffset;
    }

    @Override
    public int getTokenEnd() {
        int end = currentOffset + 3;
        return end > endOffset ? endOffset : end;
    }

    @Override
    public void advance() {
        currentOffset += 3;
    }

    @NotNull
    @Override
    public LexerPosition getCurrentPosition() {
        return new CypherLexerPosition(currentOffset, getState());
    }

    @Override
    public void restore(@NotNull LexerPosition position) {
        currentOffset = position.getOffset();
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
