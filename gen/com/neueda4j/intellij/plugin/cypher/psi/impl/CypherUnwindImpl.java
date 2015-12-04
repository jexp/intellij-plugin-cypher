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

public class CypherUnwindImpl extends ASTWrapperPsiElement implements CypherUnwind {

  public CypherUnwindImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CypherVisitor) ((CypherVisitor)visitor).visitUnwind(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public CypherExpression getExpression() {
    return findNotNullChildByClass(CypherExpression.class);
  }

  @Override
  @NotNull
  public CypherIdentifier getIdentifier() {
    return findNotNullChildByClass(CypherIdentifier.class);
  }

  @Override
  @NotNull
  public PsiElement getKAs() {
    return findNotNullChildByType(K_AS);
  }

  @Override
  @NotNull
  public PsiElement getKUnwind() {
    return findNotNullChildByType(K_UNWIND);
  }

}
