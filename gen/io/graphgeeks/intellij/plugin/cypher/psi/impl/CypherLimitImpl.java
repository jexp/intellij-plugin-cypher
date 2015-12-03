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

public class CypherLimitImpl extends ASTWrapperPsiElement implements CypherLimit {

  public CypherLimitImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CypherVisitor) ((CypherVisitor)visitor).visitLimit(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public CypherExpression getExpression() {
    return findNotNullChildByClass(CypherExpression.class);
  }

  @Override
  @NotNull
  public PsiElement getKLimit() {
    return findNotNullChildByType(K_LIMIT);
  }

  @Override
  @Nullable
  public PsiElement getLSpace() {
    return findChildByType(L_SPACE);
  }

}
