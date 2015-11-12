package io.graphgeeks.intellij.plugin.cypher.psi;

import com.intellij.psi.tree.IElementType;
import io.graphgeeks.intellij.plugin.cypher.CypherLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Represent Cypher tokens.
 *
 * @author dmitry.vrublevsky@graphgeeks.io
 */
public class CypherTokenType extends IElementType {

    private static Map<String, CypherTokenType> tokenTypes = new ConcurrentHashMap<>();

    public static CypherTokenType get(String uniqueName) {
        if (tokenTypes.containsKey(uniqueName)) {
            return tokenTypes.get(uniqueName);
        } else {
            return createAndGet(uniqueName);
        }
    }

    private static synchronized CypherTokenType createAndGet(String uniqueName) {
        if (tokenTypes.containsKey(uniqueName)) {
            return tokenTypes.get(uniqueName);
        } else {
            CypherTokenType tokenType = new CypherTokenType(uniqueName);
            tokenTypes.put(uniqueName, tokenType);
            return tokenType;
        }
    }

    public CypherTokenType(@NotNull @NonNls String debugName) {
        super(debugName, CypherLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "CypherTokenType::" + super.toString();
    }
}
