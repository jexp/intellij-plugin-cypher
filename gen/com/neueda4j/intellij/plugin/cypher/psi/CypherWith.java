// This is a generated file. Not intended for manual editing.
package com.neueda4j.intellij.plugin.cypher.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CypherWith extends PsiElement {

  @NotNull
  CypherReturnBody getReturnBody();

  @Nullable
  CypherWhere getWhere();

  @Nullable
  PsiElement getKDistinct();

  @NotNull
  PsiElement getKWith();

}
