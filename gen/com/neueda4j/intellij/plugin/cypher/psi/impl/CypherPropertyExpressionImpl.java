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

public class CypherPropertyExpressionImpl extends ASTWrapperPsiElement implements CypherPropertyExpression {

  public CypherPropertyExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CypherVisitor) ((CypherVisitor)visitor).visitPropertyExpression(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CypherCaseExpression getCaseExpression() {
    return findChildByClass(CypherCaseExpression.class);
  }

  @Override
  @NotNull
  public List<CypherExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CypherExpression.class);
  }

  @Override
  @Nullable
  public CypherFilterExpression getFilterExpression() {
    return findChildByClass(CypherFilterExpression.class);
  }

  @Override
  @Nullable
  public CypherFunctionInvocation getFunctionInvocation() {
    return findChildByClass(CypherFunctionInvocation.class);
  }

  @Override
  @Nullable
  public CypherIdInColl getIdInColl() {
    return findChildByClass(CypherIdInColl.class);
  }

  @Override
  @Nullable
  public CypherIdentifier getIdentifier() {
    return findChildByClass(CypherIdentifier.class);
  }

  @Override
  @Nullable
  public CypherListComprehension getListComprehension() {
    return findChildByClass(CypherListComprehension.class);
  }

  @Override
  @Nullable
  public CypherMapLiteral getMapLiteral() {
    return findChildByClass(CypherMapLiteral.class);
  }

  @Override
  @Nullable
  public CypherNumberLiteral getNumberLiteral() {
    return findChildByClass(CypherNumberLiteral.class);
  }

  @Override
  @Nullable
  public CypherParameter getParameter() {
    return findChildByClass(CypherParameter.class);
  }

  @Override
  @NotNull
  public List<CypherPropertyLookup> getPropertyLookupList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CypherPropertyLookup.class);
  }

  @Override
  @Nullable
  public CypherRelationshipsPattern getRelationshipsPattern() {
    return findChildByClass(CypherRelationshipsPattern.class);
  }

  @Override
  @Nullable
  public CypherShortestPathPattern getShortestPathPattern() {
    return findChildByClass(CypherShortestPathPattern.class);
  }

  @Override
  @Nullable
  public CypherStringLiteral getStringLiteral() {
    return findChildByClass(CypherStringLiteral.class);
  }

  @Override
  @Nullable
  public CypherParenthesizedExpression getParenthesizedExpression() {
    return findChildByClass(CypherParenthesizedExpression.class);
  }

  @Override
  @Nullable
  public PsiElement getKAll() {
    return findChildByType(K_ALL);
  }

  @Override
  @Nullable
  public PsiElement getKAny() {
    return findChildByType(K_ANY);
  }

  @Override
  @Nullable
  public PsiElement getKCount() {
    return findChildByType(K_COUNT);
  }

  @Override
  @Nullable
  public PsiElement getKExtract() {
    return findChildByType(K_EXTRACT);
  }

  @Override
  @Nullable
  public PsiElement getKFalse() {
    return findChildByType(K_FALSE);
  }

  @Override
  @Nullable
  public PsiElement getKFilter() {
    return findChildByType(K_FILTER);
  }

  @Override
  @Nullable
  public PsiElement getKNone() {
    return findChildByType(K_NONE);
  }

  @Override
  @Nullable
  public PsiElement getKNull() {
    return findChildByType(K_NULL);
  }

  @Override
  @Nullable
  public PsiElement getKReduce() {
    return findChildByType(K_REDUCE);
  }

  @Override
  @Nullable
  public PsiElement getKSingle() {
    return findChildByType(K_SINGLE);
  }

  @Override
  @Nullable
  public PsiElement getKTrue() {
    return findChildByType(K_TRUE);
  }

}
