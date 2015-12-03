// This is a generated file. Not intended for manual editing.
package io.graphgeeks.intellij.plugin.cypher.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CypherNodePattern extends PsiElement {

  @NotNull
  CypherMaybeIdentifier getMaybeIdentifier();

  @NotNull
  CypherMaybeNodeLabels getMaybeNodeLabels();

  @NotNull
  CypherMaybeProperties getMaybeProperties();

}
