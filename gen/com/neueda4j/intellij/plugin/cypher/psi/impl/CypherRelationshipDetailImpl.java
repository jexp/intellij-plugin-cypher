// This is a generated file. Not intended for manual editing.
package com.neueda4j.intellij.plugin.cypher.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.neueda4j.intellij.plugin.cypher.psi.CypherTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.neueda4j.intellij.plugin.cypher.psi.*;

public class CypherRelationshipDetailImpl extends ASTWrapperPsiElement implements CypherRelationshipDetail {

  public CypherRelationshipDetailImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CypherVisitor) ((CypherVisitor)visitor).visitRelationshipDetail(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public CypherMaybeIdentifier getMaybeIdentifier() {
    return findNotNullChildByClass(CypherMaybeIdentifier.class);
  }

  @Override
  @NotNull
  public CypherMaybeProperties getMaybeProperties() {
    return findNotNullChildByClass(CypherMaybeProperties.class);
  }

  @Override
  @NotNull
  public CypherMaybeVariableLength getMaybeVariableLength() {
    return findNotNullChildByClass(CypherMaybeVariableLength.class);
  }

  @Override
  @NotNull
  public CypherRelationshipTypes getRelationshipTypes() {
    return findNotNullChildByClass(CypherRelationshipTypes.class);
  }

}
