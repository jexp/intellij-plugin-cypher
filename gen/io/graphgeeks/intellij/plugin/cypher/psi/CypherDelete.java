// This is a generated file. Not intended for manual editing.
package io.graphgeeks.intellij.plugin.cypher.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CypherDelete extends PsiElement {

  @NotNull
  List<CypherExpression> getExpressionList();

  @NotNull
  PsiElement getKDelete();

  @Nullable
  PsiElement getKDetach();

}
