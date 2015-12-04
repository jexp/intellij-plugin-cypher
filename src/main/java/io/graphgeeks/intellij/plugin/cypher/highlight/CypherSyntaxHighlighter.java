package io.graphgeeks.intellij.plugin.cypher.highlight;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import io.graphgeeks.intellij.plugin.cypher.lexer.CypherLexerAdapter;
import io.graphgeeks.intellij.plugin.cypher.psi.CypherTypes;
import org.jetbrains.annotations.NotNull;

import static io.graphgeeks.intellij.plugin.cypher.highlight.CypherTextAttributeKey.*;


/**
 * Syntax highlight.
 *
 * @author dmitry.vrublevsky@graphgeeks.io
 */
public class CypherSyntaxHighlighter extends SyntaxHighlighterBase {

    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];
    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};

    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{LINE_COMMENT, BLOCK_COMMENT};

    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] VARIABLE_KEYS = new TextAttributesKey[]{VARIABLE};
    private static final TextAttributesKey[] FUNCTION_NAME_KEYS = new TextAttributesKey[]{FUNCTION_NAME};

    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{NUMBER};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};

    private static final TextAttributesKey[] SEMICOLON_KEYS = new TextAttributesKey[]{SEMICOLON};

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(CypherTypes.LINECOMMENT) || tokenType.equals(CypherTypes.BLOCKCOMMENT)) {
            return COMMENT_KEYS;
        }
        if (tokenType.toString().startsWith("Token.K_")) {
            return KEYWORD_KEYS;
        }
        if (tokenType.equals(CypherTypes.IDENTIFIER)) {
            return VARIABLE_KEYS;
        }
        if (tokenType.equals(CypherTypes.FUNCTION_NAME)) {
            return FUNCTION_NAME_KEYS;
        }
        if (tokenType.equals(CypherTypes.L_DECIMAL) || tokenType.equals(CypherTypes.L_INTEGER)) {
            return NUMBER_KEYS;
        }
        if (tokenType.equals(CypherTypes.L_STRING)) {
            return STRING_KEYS;
        }
        if (tokenType.equals(CypherTypes.SEMICOLON)) {
            return SEMICOLON_KEYS;
        }
        if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        }
        return EMPTY_KEYS;
    }

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new CypherLexerAdapter();
    }
}
