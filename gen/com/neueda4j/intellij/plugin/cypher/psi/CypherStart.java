// This is a generated file. Not intended for manual editing.
package com.neueda4j.intellij.plugin.cypher.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CypherStart extends PsiElement {

  @NotNull
  List<CypherStartPoint> getStartPointList();

  @Nullable
  CypherWhere getWhere();

  @NotNull
  PsiElement getKStart();

}
