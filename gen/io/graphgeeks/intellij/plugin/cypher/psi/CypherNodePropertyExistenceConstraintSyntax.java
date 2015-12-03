// This is a generated file. Not intended for manual editing.
package io.graphgeeks.intellij.plugin.cypher.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CypherNodePropertyExistenceConstraintSyntax extends PsiElement {

  @NotNull
  CypherIdentifier getIdentifier();

  @NotNull
  CypherNodeLabel getNodeLabel();

  @NotNull
  CypherPropertyExpression getPropertyExpression();

  @NotNull
  PsiElement getKAssertExists();

  @NotNull
  PsiElement getKConstraintOn();

}
