// This is a generated file. Not intended for manual editing.
package io.graphgeeks.intellij.plugin.cypher.psi;

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
  PsiElement getKUsingIndex();

  @Nullable
  PsiElement getKUsingJoinOn();

  @Nullable
  PsiElement getKUsingScan();

}
