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

public class CypherShortestPathPatternImpl extends ASTWrapperPsiElement implements CypherShortestPathPattern {

  public CypherShortestPathPatternImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CypherVisitor) ((CypherVisitor)visitor).visitShortestPathPattern(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public CypherPatternElement getPatternElement() {
    return findNotNullChildByClass(CypherPatternElement.class);
  }

  @Override
  @Nullable
  public PsiElement getKAllshortestpaths() {
    return findChildByType(K_ALLSHORTESTPATHS);
  }

  @Override
  @Nullable
  public PsiElement getKShortestpath() {
    return findChildByType(K_SHORTESTPATH);
  }

}
