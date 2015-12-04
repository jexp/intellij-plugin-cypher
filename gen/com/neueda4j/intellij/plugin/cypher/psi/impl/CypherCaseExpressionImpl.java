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

public class CypherCaseExpressionImpl extends ASTWrapperPsiElement implements CypherCaseExpression {

  public CypherCaseExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CypherVisitor) ((CypherVisitor)visitor).visitCaseExpression(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CypherCaseAlternatives> getCaseAlternativesList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CypherCaseAlternatives.class);
  }

  @Override
  @NotNull
  public List<CypherExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CypherExpression.class);
  }

  @Override
  @NotNull
  public PsiElement getKCase() {
    return findNotNullChildByType(K_CASE);
  }

  @Override
  @Nullable
  public PsiElement getKElse() {
    return findChildByType(K_ELSE);
  }

  @Override
  @NotNull
  public PsiElement getKEnd() {
    return findNotNullChildByType(K_END);
  }

}
