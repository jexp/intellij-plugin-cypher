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

public class CypherLoadCSVImpl extends ASTWrapperPsiElement implements CypherLoadCSV {

  public CypherLoadCSVImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CypherVisitor) ((CypherVisitor)visitor).visitLoadCSV(this);
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
  @Nullable
  public CypherStringLiteral getStringLiteral() {
    return findChildByClass(CypherStringLiteral.class);
  }

  @Override
  @NotNull
  public PsiElement getKAs() {
    return findNotNullChildByType(K_AS);
  }

  @Override
  @NotNull
  public PsiElement getKCsv() {
    return findNotNullChildByType(K_CSV);
  }

  @Override
  @Nullable
  public PsiElement getKFieldterminator() {
    return findChildByType(K_FIELDTERMINATOR);
  }

  @Override
  @NotNull
  public PsiElement getKFrom() {
    return findNotNullChildByType(K_FROM);
  }

  @Override
  @Nullable
  public PsiElement getKHeaders() {
    return findChildByType(K_HEADERS);
  }

  @Override
  @NotNull
  public PsiElement getKLoad() {
    return findNotNullChildByType(K_LOAD);
  }

  @Override
  @Nullable
  public PsiElement getKWith() {
    return findChildByType(K_WITH);
  }

}
