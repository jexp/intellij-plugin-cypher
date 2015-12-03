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

public class CypherNodeLookupImpl extends ASTWrapperPsiElement implements CypherNodeLookup {

  public CypherNodeLookupImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CypherVisitor) ((CypherVisitor)visitor).visitNodeLookup(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CypherNodeIdLookup getNodeIdLookup() {
    return findChildByClass(CypherNodeIdLookup.class);
  }

  @Override
  @Nullable
  public CypherNodeIndexLookup getNodeIndexLookup() {
    return findChildByClass(CypherNodeIndexLookup.class);
  }

  @Override
  @Nullable
  public CypherNodeIndexQuery getNodeIndexQuery() {
    return findChildByClass(CypherNodeIndexQuery.class);
  }

  @Override
  @NotNull
  public PsiElement getKNode() {
    return findNotNullChildByType(K_NODE);
  }

  @Override
  @Nullable
  public PsiElement getLSpace() {
    return findChildByType(L_SPACE);
  }

}
