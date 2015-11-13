package io.graphgeeks.intellij.plugin.cypher.lexer.token;

import io.grapgeeks.intellij.plugin.cypher.CypherParserWrapper;
import org.neo4j.cypher.internal.frontend.v2_3.ast.Statement;
import org.parboiled.Node;
import org.parboiled.errors.ParseError;
import org.parboiled.scala.ParsingResult;
import scala.collection.JavaConversions;
import scala.collection.Seq;

import java.util.ArrayList;
import java.util.List;

/**
 * Glue between Neo4j Cypher parser and expected result.
 *
 * @author dmitry.vrublevsky@graphgeeks.io
 */
public class TokenParser {

    public TokenParser() {
    }

    public List<Token> parse(String input) {
        // Get parser output from Neo4j Cypher parser
        ParsingResult<Seq<Statement>> parsingResult = CypherParserWrapper.parse(input);

        List<Token> tokens = new ArrayList<>();
        if (parsingResult.parseErrors().isEmpty()) {
            collect(parsingResult.parseTreeRoot(), tokens);
        } else {
            List<ParseError> parseErrors = JavaConversions.seqAsJavaList(parsingResult.parseErrors());
            // Take only first error for now.
            // todo: get multiple
            ParseError parseError = parseErrors.get(0);

            int errorStart = parseError.getStartIndex();
            int errorEnd = parseError.getEndIndex();
            int startOffset = 0;
            int endOffset = input.length() - 1;

            if (errorStart > startOffset) {
                tokens.add(Token.createAnyText(startOffset, errorStart - 1));
            }
            tokens.add(Token.createError(parseError));
            if (errorEnd < endOffset) {
                tokens.add(Token.createAnyText(errorEnd + 1, endOffset));
            }
        }
        return tokens;
    }

    private void collect(Node<?> node, List<Token> tokens) {
        if (ParseNode.shouldStop(node)) {
            tokens.add(Token.create(node));
        } else {
            if (!node.getChildren().isEmpty()) {
                for (Node<?> childNode : node.getChildren()) {
                    collect(childNode, tokens);
                }
            }
        }
    }
}
