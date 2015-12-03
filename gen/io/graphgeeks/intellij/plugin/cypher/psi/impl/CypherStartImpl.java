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

public class CypherStartImpl extends ASTWrapperPsiElement implements CypherStart {

  public CypherStartImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CypherVisitor) ((CypherVisitor)visitor).visitStart(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CypherStartPoint> getStartPointList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CypherStartPoint.class);
  }

  @Override
  @Nullable
  public CypherWhere getWhere() {
    return findChildByClass(CypherWhere.class);
  }

  @Override
  @NotNull
  public PsiElement getKStart() {
    return findNotNullChildByType(K_START);
  }

}
