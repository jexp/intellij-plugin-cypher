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

public class CypherMatchImpl extends ASTWrapperPsiElement implements CypherMatch {

  public CypherMatchImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CypherVisitor) ((CypherVisitor)visitor).visitMatch(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CypherHint> getHintList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CypherHint.class);
  }

  @Override
  @NotNull
  public CypherPattern getPattern() {
    return findNotNullChildByClass(CypherPattern.class);
  }

  @Override
  @Nullable
  public CypherWhere getWhere() {
    return findChildByClass(CypherWhere.class);
  }

  @Override
  @NotNull
  public PsiElement getKMatch() {
    return findNotNullChildByType(K_MATCH);
  }

  @Override
  @Nullable
  public PsiElement getKOptional() {
    return findChildByType(K_OPTIONAL);
  }

}
