// This is a generated file. Not intended for manual editing.
package io.graphgeeks.intellij.plugin.cypher.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CypherPropertyExpression extends PsiElement {

  @Nullable
  CypherCaseExpression getCaseExpression();

  @NotNull
  List<CypherExpression> getExpressionList();

  @Nullable
  CypherFilterExpression getFilterExpression();

  @Nullable
  CypherFunctionInvocation getFunctionInvocation();

  @Nullable
  CypherIdInColl getIdInColl();

  @Nullable
  CypherIdentifier getIdentifier();

  @Nullable
  CypherListComprehension getListComprehension();

  @Nullable
  CypherMapLiteral getMapLiteral();

  @Nullable
  CypherNumberLiteral getNumberLiteral();

  @Nullable
  CypherParameter getParameter();

  @NotNull
  List<CypherPropertyLookup> getPropertyLookupList();

  @Nullable
  CypherRelationshipsPattern getRelationshipsPattern();

  @Nullable
  CypherShortestPathPattern getShortestPathPattern();

  @Nullable
  CypherStringLiteral getStringLiteral();

  @Nullable
  CypherParenthesizedExpression getParenthesizedExpression();

  @Nullable
  PsiElement getKAll();

  @Nullable
  PsiElement getKAny();

  @Nullable
  PsiElement getKCount();

  @Nullable
  PsiElement getKExtract();

  @Nullable
  PsiElement getKFalse();

  @Nullable
  PsiElement getKFilter();

  @Nullable
  PsiElement getKNone();

  @Nullable
  PsiElement getKNull();

  @Nullable
  PsiElement getKReduce();

  @Nullable
  PsiElement getKSingle();

  @Nullable
  PsiElement getKTrue();

}
