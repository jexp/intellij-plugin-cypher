package io.graphgeeks.intellij.plugin.cypher.lexer.token;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

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
        List<Token> tokenList = parser.parse("MATCH (n) \n" +
                "// some comments \n" +
                "RETURN n;");
        tokenList.forEach(System.out::println);
    }
}
