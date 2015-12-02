// This is a generated file. Not intended for manual editing.
package io.graphgeeks.intellij.plugin.cypher.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import io.graphgeeks.intellij.plugin.cypher.psi.impl.*;

public interface CypherTypes {

  IElementType PROPERTY = new CypherElementType("PROPERTY");

  IElementType COMMENT = new CypherTokenType("COMMENT");
  IElementType CRLF = new CypherTokenType("CRLF");
  IElementType KEY = new CypherTokenType("KEY");
  IElementType SEPARATOR = new CypherTokenType("SEPARATOR");
  IElementType VALUE = new CypherTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == PROPERTY) {
        return new CypherPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
