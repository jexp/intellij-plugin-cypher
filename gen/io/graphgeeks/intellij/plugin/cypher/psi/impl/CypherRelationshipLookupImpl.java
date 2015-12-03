// This is a generated file. Not intended for manual editing.
package io.graphgeeks.intellij.plugin.cypher.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.graphgeeks.intellij.plugin.cypher.psi.CypherTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import io.graphgeeks.intellij.plugin.cypher.psi.*;

public class CypherRelationshipLookupImpl extends ASTWrapperPsiElement implements CypherRelationshipLookup {

  public CypherRelationshipLookupImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CypherVisitor) ((CypherVisitor)visitor).visitRelationshipLookup(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CypherRelationshipIdLookup getRelationshipIdLookup() {
    return findChildByClass(CypherRelationshipIdLookup.class);
  }

  @Override
  @Nullable
  public CypherRelationshipIndexLookup getRelationshipIndexLookup() {
    return findChildByClass(CypherRelationshipIndexLookup.class);
  }

  @Override
  @Nullable
  public CypherRelationshipIndexQuery getRelationshipIndexQuery() {
    return findChildByClass(CypherRelationshipIndexQuery.class);
  }

  @Override
  @Nullable
  public PsiElement getKRel() {
    return findChildByType(K_REL);
  }

  @Override
  @Nullable
  public PsiElement getKRelationship() {
    return findChildByType(K_RELATIONSHIP);
  }

  @Override
  @Nullable
  public PsiElement getLSpace() {
    return findChildByType(L_SPACE);
  }

}
