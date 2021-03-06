// This is a generated file. Not intended for manual editing.
package com.neueda4j.intellij.plugin.cypher.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CypherNodeLookup extends PsiElement {

  @Nullable
  CypherNodeIdLookup getNodeIdLookup();

  @Nullable
  CypherNodeIndexLookup getNodeIndexLookup();

  @Nullable
  CypherNodeIndexQuery getNodeIndexQuery();

  @NotNull
  PsiElement getKNode();

}
