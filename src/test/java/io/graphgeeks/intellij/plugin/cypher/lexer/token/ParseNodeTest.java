package io.graphgeeks.intellij.plugin.cypher.lexer.token;

import org.junit.Test;

import java.util.List;

/**
 * @author dmitry.vrublevsky@graphgeeks.io
 */
public class ParseNodeTest {

    @Test
    public void testSimple() throws Exception {
        String input = "MATCH nodes RETURN n";

        List<Token> result = new TokenParser().parse(input);

        result.forEach(System.out::println);
    }
}
