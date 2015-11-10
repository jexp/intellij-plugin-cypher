package io.graphgeeks.intellij.plugin.cypher;

import com.intellij.lang.Language;

/**
 * @author dmitry.vrublevsky@graphgeeks.io
 */
public class CypherLanguage extends Language {

    public static final CypherLanguage INSTANCE = new CypherLanguage();

    private CypherLanguage() {
        super("Cypher");
    }
}
