// This is a generated file. Not intended for manual editing.
package io.graphgeeks.intellij.plugin.cypher.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CypherRelationshipPropertyExistenceConstraintSyntax extends PsiElement {

  @NotNull
  CypherPropertyExpression getPropertyExpression();

  @NotNull
  CypherRelationshipPatternSyntax getRelationshipPatternSyntax();

  @NotNull
  PsiElement getKAssertExists();

  @NotNull
  PsiElement getKConstraintOn();

}