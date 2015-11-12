package io.graphgeeks.intellij.plugin.cypher.lexer.token;

import org.neo4j.cypher.internal.frontend.v2_3.ast.Statement;
import org.neo4j.cypher.internal.frontend.v2_3.parser.CypherParser;
import org.parboiled.parserunners.RecoveringParseRunner;
import org.parboiled.support.ParsingResult;
import scala.collection.Seq;

import java.util.ArrayList;
import java.util.List;

import static io.graphgeeks.intellij.plugin.cypher.util.ListUtils.getNext;
import static scala.collection.JavaConversions.seqAsJavaList;

/**
 * Glue between Neo4j Cypher parser and expected result.
 *
 * @author dmitry.vrublevsky@graphgeeks.io
 */
public class TokenParser {

    private final ThreadLocal<RecoveringParseRunner<Seq<Statement>>> runnerHolder = new ThreadLocal<>();

    public TokenParser() {
    }

    public List<Token> parse(CharSequence buffer) {
        // Convert buffer to sting
        String input = String.valueOf(buffer);

        // Get parser output from Neo4j Cypher parser
        ParsingResult<Seq<Statement>> parsingResult = runner().run(input);
        List<Statement> statements = seqAsJavaList(parsingResult.resultValue);

        // Wrap parser output into tokenizer
        return transformIntoTokens(input, statements);
    }

    private List<Token> transformIntoTokens(String source, List<Statement> statements) {
        final List<Token> tokens = new ArrayList<>();

        RootToken rootToken = new RootToken(source);
        Token prevToken = null;

        for (int i = 0; i < statements.size(); i++) {
            Token currentToken = Tokens.tokenFor(statements.get(i));
            currentToken.navigate(tokens::add, rootToken, prevToken, getNext(statements, i));
            prevToken = currentToken;
        }

        return tokens;
    }

    private RecoveringParseRunner<Seq<Statement>> runner() {
        RecoveringParseRunner<Seq<Statement>> runner = runnerHolder.get();
        if (runner == null) {
            runner = org.parboiled.scala.parserunners.RecoveringParseRunner
                    .apply(CypherParser.Statements())
                    .inner();
            runnerHolder.set(runner);
        }

        return runner;
    }
}
