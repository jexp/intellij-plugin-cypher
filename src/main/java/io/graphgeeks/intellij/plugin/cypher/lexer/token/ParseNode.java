package io.graphgeeks.intellij.plugin.cypher.lexer.token;

import org.parboiled.Node;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;

/**
 * Map all parse nodes.
 *
 * @author dmitry.vrublevsky@graphgeeks.io
 */
public class ParseNode {

    private static Map<String, ParseNode> parseNodes = new ConcurrentHashMap<>();

    static {
        // meta
        addEscaped("(");
        addEscaped("|");
        addEscaped(")");

        // base
        add("an operator char");
        add("'0'-'9'");
        add("'0'-'7'");
        add("'0'-'9', 'a'-'f'");
        add("'-'");
        add("'<'");
        add("'>'");
        add("','");
        add("comment");
        add("an identifier");

        // clauses
        add("LOAD CSV", true);
        add("WITH HEADERS");
        add("FROM");
        add("AS");
        add("FIELDTERMINATOR");
        add("START", true);
        add("OPTIONAL MATCH");
        add("MATCH", true);
        add("MERGE", true);
        add("CREATE", true);
        add("CREATE UNIQUE");
        add("SET", true);
        add("DELETE", true);
        add("DETACH DELETE");
        add("REMOVE", true);
        add("FOREACH", true);
        add("IN");
        add("WITH", true);
        add("WITH DISTINCT");
        add("UNWIND", true);
        add("RETURN", true);
        add("RETURN DISTINCT");
        add("_PRAGMA");
        add("WITH NONE");
        add("WITHOUT");
        add("WHERE", true);
        add("USING PERIODIC COMMIT", true);
        add("USING INDEX");
        add("USING JOIN ON");
        add("USING SCAN");
        add("ON MATCH");
        add("ON CREATE");
        addEscaped("=");
        addEscaped("+=");
        addEscaped("*");
        add("ORDER BY");
        add("DESCENDING");
        add("DESC");
        add("ASCENDING");
        add("ASC");
        add("SKIP", true);
        add("LIMIT", true);

        // command
        add("CREATE INDEX ON");
        add("DROP INDEX ON");
        add("CREATE");
        add("DROP");
        add("CONSTRAINT ON");
        add("ASSERT");
        add("IS UNIQUE");
        add("ASSERT EXISTS");
        add("()-[");
        add("]-()");
        add("]->()");
        add("()<-[");

        // expressions
        add("OR");
        add("XOR");
        add("AND");
        add("NOT");
        addEscaped("=");
        addEscaped("<>");
        addEscaped("!=");
        addEscaped("<");
        addEscaped(">");
        addEscaped("<=");
        addEscaped(">=");
        addEscaped("+");
        addEscaped("-");
        addEscaped("*");
        addEscaped("/");
        addEscaped("%");
        addEscaped("^");
        addEscaped("[");
        addEscaped("]");
        addEscaped("..");
        addEscaped("=~");
        add("IN");
        add("STARTS WITH");
        add("ENDS WITH");
        add("CONTAINS");
        add("IS NULL");
        add("IS NOT NULL");
        add("TRUE");
        add("FALSE");
        add("NULL");
        add("COUNT");
        add("FILTER");
        add("EXTRACT");
        add("REDUCE");
        add("ALL");
        add("ANY");
        add("NONE");
        add("SINGLE");
        addEscaped(".");
        addEscaped("?");
        addEscaped("!");
        add("DISTINCT");
        add("CASE", true);
        add("ELSE");
        add("END");
        add("WHEN", true);
        add("THEN");

        // literals
        add("an identifier");
        add("a function name");
        add("a property key name");
        add("a label name");
        add("a rel type name");
        addEscaped("{");
        addEscaped(":");
        addEscaped("}");
        add("a parameter");
        add("a number");
        add("a floating point number");
        add("an integer");
        add("an unsigned integer");
        add("\"...string...\"");

        // patterns
        add("shortestPath");
        add("allShortestPaths");
        add("a length specification");

        // query
        add("UNION ALL");
        add("UNION");

        // start points
        add("NODE");
        add("RELATIONSHIP");
        add("REL");
    }

    public static boolean shouldStop(Node<?> node) {
        if (has(node.getLabel())) {
            ParseNode parseNode = get(node.getLabel());
            return parseNode.shouldStopOnNode(node);
        } else {
            return false;
        }
    }

    public static boolean has(String label) {
        return parseNodes.containsKey(label);
    }

    public static ParseNode get(String label) {
        return parseNodes.get(label);
    }

    private static void add(String label, boolean skipIfValueExists) {
        parseNodes.put(label, new ParseNode(label, skipIfValueExists));
    }

    private static void add(String label) {
        parseNodes.put(label, new ParseNode(label));
    }

    private static void addEscaped(String label) {
        String escaped = "'" + label + "'";
        parseNodes.put(label, new ParseNode(label));
        parseNodes.put(escaped, new ParseNode(escaped));
    }

    private final String label;
    private final boolean skipIfValueExists;

    private ParseNode(String label, boolean skipIfValueExists) {
        this.label = label;
        this.skipIfValueExists = skipIfValueExists;
    }

    public ParseNode(String label) {
        this(label, false);
    }

    public String getLabel() {
        return label;
    }

    public boolean isSkipIfValueExists() {
        return skipIfValueExists;
    }

    public boolean shouldStopOnNode(Node<?> node) {
        if (node.getLabel().equals(label)) {
            if (!node.getChildren().isEmpty()) {
                char labelFirstChar = node.getLabel().charAt(0);
                String expectedLabel = String.format("'%s/%s'", toLowerCase(labelFirstChar), toUpperCase(labelFirstChar));


                Node<?> firstChild = node.getChildren().get(0);
                if (firstChild.getLabel().equals(expectedLabel)) {
                    return true;
                }
            }
            if (skipIfValueExists && node.getValue() != null) {
                return false;
            }
            return true;

        } else {
            return false;
        }
    }
}
