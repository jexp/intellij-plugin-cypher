package io.graphgeeks.intellij.plugin.cypher.psi;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;

/**
 * All available Cypher tokens.
 *
 * @author dmitry.vrublevsky@graphgeeks.io
 */
public interface CypherTypes {

    IElementType LINE_COMMENT = new CypherTokenType("LINE_COMMENT");

    class Factory {
        public static PsiElement createElement(ASTNode node) {
            throw new RuntimeException("Unknown element type: " + node);
        }
    }
}
