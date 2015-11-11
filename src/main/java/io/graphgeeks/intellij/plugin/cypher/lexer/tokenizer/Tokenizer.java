package io.graphgeeks.intellij.plugin.cypher.lexer.tokenizer;

import org.neo4j.cypher.internal.frontend.v2_3.ast.Statement;

import java.util.Collection;

/**
 * Convert Cypher AST build by parboiled into tokens.
 *
 * @author dmitry.vrublevsky@graphgeeks.io
 */
public class Tokenizer {

    public static Tokenizer from(Collection<Statement> statements) {
        return new Tokenizer(statements);
    }

    public Tokenizer(Collection<Statement> statements) {
    }
}
