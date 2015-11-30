package io.graphgeeks.intellij.plugin.cypher.lexer;

import com.intellij.lexer.FlexAdapter;

/**
 * TODO: Description
 *
 * @author dmitry.vrublevsky@graphgeeks.io
 */
public class CypherLexerAdapter extends FlexAdapter {

    public CypherLexerAdapter() {
        super(new _CypherLexer(null));
    }
}
