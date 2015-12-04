// This is a generated file. Not intended for manual editing.
package com.neueda4j.intellij.plugin.cypher.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CypherUniqueConstraintSyntax extends PsiElement {

  @NotNull
  CypherIdentifier getIdentifier();

  @NotNull
  CypherNodeLabel getNodeLabel();

  @NotNull
  CypherPropertyExpression getPropertyExpression();

  @NotNull
  PsiElement getKAssert();

  @NotNull
  PsiElement getKConstraint();

  @NotNull
  PsiElement getKIs();

  @NotNull
  PsiElement getKOn();

  @NotNull
  PsiElement getKUnique();

}
