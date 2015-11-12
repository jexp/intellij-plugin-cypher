package io.graphgeeks.intellij.plugin.cypher.lexer.token;

import io.graphgeeks.intellij.plugin.cypher.lexer.token.ast.GenericToken;
import io.graphgeeks.intellij.plugin.cypher.lexer.token.ast.QueryToken;
import io.graphgeeks.intellij.plugin.cypher.lexer.token.ast.SingleQueryToken;
import org.neo4j.cypher.internal.frontend.v2_3.ast.ASTNode;
import org.neo4j.cypher.internal.frontend.v2_3.ast.Query;
import org.neo4j.cypher.internal.frontend.v2_3.ast.SingleQuery;

/**
 * All available tokens by Cypher parser.
 * They MUST be registered there.
 *
 * @author dmitry.vrublevsky@graphgeeks.io
 */
public enum Tokens {

    // Generic token wrapper, which optimistically iterates further
    GENERIC(GenericToken.class, GenericToken::new),
    QUERY(Query.class, (astNode) -> new QueryToken((Query) astNode)),
    SINGLE_QUERY(SingleQuery.class, (astNode) -> new SingleQueryToken((SingleQuery) astNode));

    private final Class<?> clazz;
    private final CreateToken createToken;

    Tokens(Class<?> clazz, CreateToken createToken) {
        this.clazz = clazz;
        this.createToken = createToken;
    }

    public Class<?> getClazz() {
        return clazz;
    }

    public CreateToken getCreateToken() {
        return createToken;
    }

    /**
     * Convert ASTNode into known token or generic one.
     */
    public static Token tokenFor(ASTNode astNode) {
        for (Tokens tokens : values()) {
            if (tokens.getClazz().equals(astNode.getClass())) {
                return tokens.getCreateToken().create(astNode);
            }
        }

        return GENERIC.getCreateToken().create(astNode);
    }

    public interface CreateToken {
        Token create(ASTNode astNode);
    }
}
