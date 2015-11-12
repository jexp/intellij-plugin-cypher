package io.graphgeeks.intellij.plugin.cypher.lexer.token;

import org.neo4j.cypher.internal.frontend.v2_3.ast.Statement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static io.graphgeeks.intellij.plugin.cypher.util.ListUtils.getNext;

/**
 * Convert Cypher AST build by parboiled into tokens.
 *
 * @author dmitry.vrublevsky@graphgeeks.io
 */
public class TokenList {

    private final Iterator<Token> tokenIterator;

    public static TokenList from(String source, List<Statement> statements) {
        return new TokenList(source, statements);
    }

    public TokenList(String source, List<Statement> statements) {
        final List<Token> tokens = new ArrayList<>();

        RootToken rootToken = new RootToken(source);
        Token prevToken = null;

        for (int i = 0; i < statements.size(); i++) {
            Token currentToken = Tokens.tokenFor(statements.get(i));
            currentToken.navigate(tokens::add, rootToken, prevToken, getNext(statements, i));
            prevToken = currentToken;
        }

        tokenIterator = tokens.iterator();
    }

    public boolean hasNext() {
        return tokenIterator.hasNext();
    }

    public Token next() {
        return tokenIterator.next();
    }
}
