package com.neueda4j.intellij.plugin.cypher.psi;

import com.intellij.psi.tree.IElementType;
import com.neueda4j.intellij.plugin.cypher.CypherLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * TODO: Description
 *
 * @author dmitry@vrublesvky.me
 */
public class CypherTokenType extends IElementType {

    public CypherTokenType(@NotNull @NonNls String debugName) {
        super(debugName, CypherLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "Token." + super.toString();
    }
}
