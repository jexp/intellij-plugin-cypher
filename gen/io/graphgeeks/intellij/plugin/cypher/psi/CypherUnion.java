// This is a generated file. Not intended for manual editing.
package io.graphgeeks.intellij.plugin.cypher.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CypherUnion extends PsiElement {

  @NotNull
  CypherSingleQuery getSingleQuery();

  @Nullable
  PsiElement getKUnion();

  @Nullable
  PsiElement getKUnionAll();

  @Nullable
  PsiElement getLSpace();

}
