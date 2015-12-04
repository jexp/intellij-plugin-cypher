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

public class CypherClauseImpl extends ASTWrapperPsiElement implements CypherClause {

  public CypherClauseImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CypherVisitor) ((CypherVisitor)visitor).visitClause(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CypherCreate getCreate() {
    return findChildByClass(CypherCreate.class);
  }

  @Override
  @Nullable
  public CypherDelete getDelete() {
    return findChildByClass(CypherDelete.class);
  }

  @Override
  @Nullable
  public CypherForeach getForeach() {
    return findChildByClass(CypherForeach.class);
  }

  @Override
  @Nullable
  public CypherLoadCSV getLoadCSV() {
    return findChildByClass(CypherLoadCSV.class);
  }

  @Override
  @Nullable
  public CypherMatch getMatch() {
    return findChildByClass(CypherMatch.class);
  }

  @Override
  @Nullable
  public CypherMerge getMerge() {
    return findChildByClass(CypherMerge.class);
  }

  @Override
  @Nullable
  public CypherRemove getRemove() {
    return findChildByClass(CypherRemove.class);
  }

  @Override
  @Nullable
  public CypherReturn getReturn() {
    return findChildByClass(CypherReturn.class);
  }

  @Override
  @Nullable
  public CypherSetClause getSetClause() {
    return findChildByClass(CypherSetClause.class);
  }

  @Override
  @Nullable
  public CypherStart getStart() {
    return findChildByClass(CypherStart.class);
  }

  @Override
  @Nullable
  public CypherUnwind getUnwind() {
    return findChildByClass(CypherUnwind.class);
  }

  @Override
  @Nullable
  public CypherWith getWith() {
    return findChildByClass(CypherWith.class);
  }

}
