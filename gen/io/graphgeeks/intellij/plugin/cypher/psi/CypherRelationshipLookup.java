// This is a generated file. Not intended for manual editing.
package io.graphgeeks.intellij.plugin.cypher.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CypherRelationshipLookup extends PsiElement {

  @Nullable
  CypherRelationshipIdLookup getRelationshipIdLookup();

  @Nullable
  CypherRelationshipIndexLookup getRelationshipIndexLookup();

  @Nullable
  CypherRelationshipIndexQuery getRelationshipIndexQuery();

  @Nullable
  PsiElement getKRel();

  @Nullable
  PsiElement getKRelationship();

}
