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

public class CypherMergeActionImpl extends ASTWrapperPsiElement implements CypherMergeAction {

  public CypherMergeActionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CypherVisitor) ((CypherVisitor)visitor).visitMergeAction(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public CypherSetClause getSetClause() {
    return findNotNullChildByClass(CypherSetClause.class);
  }

  @Override
  @Nullable
  public PsiElement getKOnCreate() {
    return findChildByType(K_ON_CREATE);
  }

  @Override
  @Nullable
  public PsiElement getKOnMatch() {
    return findChildByType(K_ON_MATCH);
  }

}
