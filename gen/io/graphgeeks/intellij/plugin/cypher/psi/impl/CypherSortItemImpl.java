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

public class CypherSortItemImpl extends ASTWrapperPsiElement implements CypherSortItem {

  public CypherSortItemImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CypherVisitor) ((CypherVisitor)visitor).visitSortItem(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public CypherExpression getExpression() {
    return findNotNullChildByClass(CypherExpression.class);
  }

  @Override
  @Nullable
  public PsiElement getKAsc() {
    return findChildByType(K_ASC);
  }

  @Override
  @Nullable
  public PsiElement getKAscending() {
    return findChildByType(K_ASCENDING);
  }

  @Override
  @Nullable
  public PsiElement getKDesc() {
    return findChildByType(K_DESC);
  }

  @Override
  @Nullable
  public PsiElement getKDescending() {
    return findChildByType(K_DESCENDING);
  }

}
