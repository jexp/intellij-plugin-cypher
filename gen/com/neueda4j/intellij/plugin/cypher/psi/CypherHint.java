// This is a generated file. Not intended for manual editing.
package com.neueda4j.intellij.plugin.cypher.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CypherHint extends PsiElement {

  @NotNull
  List<CypherIdentifier> getIdentifierList();

  @Nullable
  CypherNodeLabel getNodeLabel();

  @Nullable
  CypherPropertyKeyName getPropertyKeyName();

  @Nullable
  PsiElement getKIndex();

  @Nullable
  PsiElement getKJoin();

  @Nullable
  PsiElement getKOn();

  @Nullable
  PsiElement getKScan();

  @NotNull
  PsiElement getKUsing();

}
