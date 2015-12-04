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

public class CypherIndexQueryImpl extends ASTWrapperPsiElement implements CypherIndexQuery {

  public CypherIndexQueryImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CypherVisitor) ((CypherVisitor)visitor).visitIndexQuery(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CypherParameter getParameter() {
    return findChildByClass(CypherParameter.class);
  }

  @Override
  @Nullable
  public CypherStringLiteral getStringLiteral() {
    return findChildByClass(CypherStringLiteral.class);
  }

  @Override
  @Nullable
  public PsiElement getLIdentifier() {
    return findChildByType(L_IDENTIFIER);
  }

  @Override
  @Nullable
  public PsiElement getLIdentifierText() {
    return findChildByType(L_IDENTIFIER_TEXT);
  }

}
