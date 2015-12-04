package io.graphgeeks.intellij.plugin.cypher.highlight;

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

/**
 * TODO: Description
 *
 * @author dmitry.vrublevsky@graphgeeks.io
 */
public class CypherTextAttributeKey {

    public static final TextAttributesKey LINE_COMMENT = createTextAttributesKey("CYPHER_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BLOCK_COMMENT = createTextAttributesKey("CYPHER_BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT);

    public static final TextAttributesKey KEYWORD = createTextAttributesKey("CYPHER_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey VARIABLE = createTextAttributesKey("CYPHER_VARIABLE", DefaultLanguageHighlighterColors.LOCAL_VARIABLE);
    public static final TextAttributesKey FUNCTION_NAME = createTextAttributesKey("CYPHER_FUNCTION_NAME", DefaultLanguageHighlighterColors.FUNCTION_CALL);

    public static final TextAttributesKey SEMICOLON = createTextAttributesKey("CYPHER_SEMICOLON", DefaultLanguageHighlighterColors.SEMICOLON);

    public static final TextAttributesKey STRING = createTextAttributesKey("CYPHER_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey NUMBER = createTextAttributesKey("CYPHER_NUMBER", DefaultLanguageHighlighterColors.NUMBER);

    public static final TextAttributesKey BAD_CHARACTER = createTextAttributesKey("SIMPLE_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);
}
