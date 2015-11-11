package io.graphgeeks.intellij.plugin.cypher.lexer.tokenizer;

import org.neo4j.cypher.internal.frontend.v2_3.ast.Statement;
import org.neo4j.cypher.internal.frontend.v2_3.parser.CypherParser;
import org.parboiled.parserunners.ReportingParseRunner;
import org.parboiled.support.ParsingResult;
import scala.collection.Seq;

import java.util.Collection;

import static scala.collection.JavaConversions.asJavaCollection;

/**
 * Glue between Neo4j Cypher parser and expected result.
 *
 * @author dmitry.vrublevsky@graphgeeks.io
 */
public class TokenParser {

    private final ReportingParseRunner<Seq<Statement>> runner;

    public TokenParser() {
        runner = org.parboiled.scala.parserunners.ReportingParseRunner
                .apply(CypherParser.Statements())
                .inner();
    }

    public Tokenizer parse(CharSequence buffer) {
        // Convert buffer to sting
        String input = String.valueOf(buffer);

        // Get parser output from Neo4j Cypher parser
        ParsingResult<Seq<Statement>> parsingResult = runner.run(input);
        Collection<Statement> statements = asJavaCollection(parsingResult.resultValue);

        // Wrap parser output into tokenizer
        return Tokenizer.from(statements);
    }
}
