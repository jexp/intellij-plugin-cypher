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

public class CypherUnionImpl extends ASTWrapperPsiElement implements CypherUnion {

  public CypherUnionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CypherVisitor) ((CypherVisitor)visitor).visitUnion(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public CypherSingleQuery getSingleQuery() {
    return findNotNullChildByClass(CypherSingleQuery.class);
  }

  @Override
  @Nullable
  public PsiElement getKUnion() {
    return findChildByType(K_UNION);
  }

  @Override
  @Nullable
  public PsiElement getKUnionAll() {
    return findChildByType(K_UNION_ALL);
  }

  @Override
  @Nullable
  public PsiElement getLSpace() {
    return findChildByType(L_SPACE);
  }

}
