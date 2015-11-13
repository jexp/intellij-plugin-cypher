package io.graphgeeks.intellij.plugin.cypher.highlight;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import io.graphgeeks.intellij.plugin.cypher.lexer.CypherLexer;
import io.graphgeeks.intellij.plugin.cypher.psi.CypherTokenType;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

/**
 * Define syntax highlighting's.
 *
 * @author dmitry.vrublevsky@graphgeeks.io
 */
public class CypherSyntaxHightlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey MATCH =
            createTextAttributesKey("CYPHER_MATCH", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("CYPHER_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);

    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];
    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{MATCH};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new CypherLexer();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(CypherTokenType.get("Match"))) {
            return KEYWORD_KEYS;
        }
        return EMPTY_KEYS;
    }
}
