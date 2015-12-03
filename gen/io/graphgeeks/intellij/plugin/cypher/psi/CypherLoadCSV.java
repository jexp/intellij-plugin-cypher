// This is a generated file. Not intended for manual editing.
package io.graphgeeks.intellij.plugin.cypher.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CypherLoadCSV extends PsiElement {

  @NotNull
  CypherExpression getExpression();

  @NotNull
  CypherIdentifier getIdentifier();

  @Nullable
  CypherStringLiteral getStringLiteral();

  @NotNull
  PsiElement getKAs();

  @Nullable
  PsiElement getKFieldterminator();

  @NotNull
  PsiElement getKFrom();

  @NotNull
  PsiElement getKLoadCsv();

  @Nullable
  PsiElement getKWithHeaders();

  @Nullable
  PsiElement getLSpace();

}
