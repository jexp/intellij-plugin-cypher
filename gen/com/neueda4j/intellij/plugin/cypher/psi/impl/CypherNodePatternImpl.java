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

public class CypherNodePatternImpl extends ASTWrapperPsiElement implements CypherNodePattern {

  public CypherNodePatternImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CypherVisitor) ((CypherVisitor)visitor).visitNodePattern(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public CypherMaybeIdentifier getMaybeIdentifier() {
    return findNotNullChildByClass(CypherMaybeIdentifier.class);
  }

  @Override
  @NotNull
  public CypherMaybeNodeLabels getMaybeNodeLabels() {
    return findNotNullChildByClass(CypherMaybeNodeLabels.class);
  }

  @Override
  @NotNull
  public CypherMaybeProperties getMaybeProperties() {
    return findNotNullChildByClass(CypherMaybeProperties.class);
  }

}
