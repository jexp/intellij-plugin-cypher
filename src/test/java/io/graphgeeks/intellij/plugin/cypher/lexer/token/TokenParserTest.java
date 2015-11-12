package io.graphgeeks.intellij.plugin.cypher.lexer.token;

import org.junit.Before;
import org.junit.Test;

/**
 * TODO: Description
 *
 * @author dmitry.vrublevsky@graphgeeks.io
 */
public class TokenParserTest {

    private TokenParser parser;

    @Before
    public void setUp() throws Exception {
        parser = new TokenParser();
    }

    @Test
    public void testParseSimpleQuery() throws Exception {
        TokenList tokenList = parser.parse("MATCH (n) RETURN n;MATCH (n) RETURN n;");

        while (tokenList.hasNext()) {
            System.out.println(tokenList.next());
        }
    }
}
