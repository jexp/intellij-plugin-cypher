package io.graphgeeks.intellij.plugin.cypher;

import org.junit.Test;
import org.neo4j.cypher.internal.compiler.v2_3.prettifier.GroupToken;
import org.neo4j.cypher.internal.compiler.v2_3.prettifier.PrettifierParser;
import org.neo4j.cypher.internal.compiler.v2_3.prettifier.SyntaxToken;
import org.neo4j.cypher.internal.frontend.v2_3.ast.ASTNode;
import org.neo4j.cypher.internal.frontend.v2_3.ast.Statement;
import org.neo4j.cypher.internal.frontend.v2_3.parser.CypherParser;
import org.parboiled.scala.parserunners.ReportingParseRunner;
import org.parboiled.support.ParsingResult;
import scala.collection.Iterator;
import scala.collection.Seq;

import java.util.Collection;

import static scala.collection.JavaConversions.asJavaCollection;
import static scala.collection.JavaConversions.asJavaIterator;

/**
 * @author dmitry.vrublevsky@graphgeeks.io
 */
public class CypherLanguageTest {

    @Test
    public void testParser() throws Exception {
        PrettifierParser parser = new PrettifierParser();
        Seq<SyntaxToken> result = parser.parse("MATCH (n:Label {props})-[r:RELATIONSHIP]->(o) WHERE set.prop RETURN n UNION MATCH (n) RETURN count(n) as something");

        Collection<SyntaxToken> tokens = asJavaCollection(result);
        tokens.forEach(this::deepToken);
    }

    public void deepToken(SyntaxToken token) {
        if (token instanceof GroupToken) {
            GroupToken groupToken = (GroupToken) token;
            Seq<SyntaxToken> scalaSeq = groupToken.innerTokens();
            Collection<SyntaxToken> innerTokens = asJavaCollection(scalaSeq);
            innerTokens.forEach(this::deepToken);
        } else {
            System.out.printf("%s: [%s]\n", token.getClass(), token);
        }
    }

    @Test
    public void testCypherParser() throws Exception {
        CypherParser parser = new CypherParser();
//        parser.buildParseTree()
//        Statement statement = parser.parse("MATCH (n) WHERE n.prop = 'value' RETURN n;", Option.empty());

        ParsingResult<Seq<Statement>> parsingResult = ReportingParseRunner
                .apply(CypherParser.Statements())
                .inner().run("MATCH (n) WHERE n.prop = 'value' RETURN n;MATCH (n) WHERE n.prop = 'value' RETURN n;");

//        Collection<Node<Seq<Statement>>> nodes = new ArrayList<>();
        Collection<Statement> statements = asJavaCollection(parsingResult.resultValue);

        for (Statement statement : statements) {
            System.out.println(statement);
        }

//        ParseTreeUtils.collectNodes(
//                parsingResult.parseTreeRoot,
//                input -> true,
//                nodes);

//        System.out.println(nodes);

//        org.parboiled.support.ParseTreeUtils.printNodeTree(parsingResult);
//        Iterator<Object> iterator = statement.productIterator();
//        java.util.Iterator<Object> objectIterator = JavaConversions.asJavaIterator(iterator);

//        SingleQuery query = (SingleQuery) statement.productElement(1);
//
//        Collection<Clause> clauses = asJavaCollection(query.clauses());
//        clauses.forEach(this::deepClause);
//
    }

    public void deepClause(ASTNode astNode) {
        System.out.printf("%s: [%s], [%s]\n",
                astNode.getClass().getSimpleName(), astNode, astNode.position());

        Iterator<Object> productIterator = astNode.productIterator();
        asJavaIterator(productIterator).forEachRemaining(this::deepProduct);
    }

    public void deepProduct(Object o) {
        if (o instanceof ASTNode) {
            ASTNode astNode = (ASTNode) o;
            deepClause(astNode);
        } else {
            System.out.printf("%s: [%s]\n",
                    o.getClass().getSimpleName(), o);
        }
    }

    public void deepProduct(Object o, int level) {

    }

    @Test
    public void testCypherParboiled() throws Exception {
        String input = "MATCH (n) RETURN n";
        CypherParser parser = new CypherParser();

//        new ReportingParseRunner(CypherParser.Statements());
//        ReportingParseRunner(parser.Expression).run(input);

    }
}
