package io.graphgeeks.intellij.plugin.cypher.psi;

import com.intellij.psi.tree.IElementType;
import io.graphgeeks.intellij.plugin.cypher.CypherLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * @author dmitry.vrublevsky@graphgeeks.io
 */
public class CypherElementType extends IElementType {

    public CypherElementType(@NotNull @NonNls String debugName) {
        super(debugName, CypherLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "CypherElementType." + super.toString();
    }
}
