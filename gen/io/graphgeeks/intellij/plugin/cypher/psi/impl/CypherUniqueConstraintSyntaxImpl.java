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

public class CypherUniqueConstraintSyntaxImpl extends ASTWrapperPsiElement implements CypherUniqueConstraintSyntax {

  public CypherUniqueConstraintSyntaxImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CypherVisitor) ((CypherVisitor)visitor).visitUniqueConstraintSyntax(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public CypherIdentifier getIdentifier() {
    return findNotNullChildByClass(CypherIdentifier.class);
  }

  @Override
  @NotNull
  public CypherNodeLabel getNodeLabel() {
    return findNotNullChildByClass(CypherNodeLabel.class);
  }

  @Override
  @NotNull
  public CypherPropertyExpression getPropertyExpression() {
    return findNotNullChildByClass(CypherPropertyExpression.class);
  }

  @Override
  @NotNull
  public PsiElement getKAssert() {
    return findNotNullChildByType(K_ASSERT);
  }

  @Override
  @NotNull
  public PsiElement getKConstraint() {
    return findNotNullChildByType(K_CONSTRAINT);
  }

  @Override
  @NotNull
  public PsiElement getKIs() {
    return findNotNullChildByType(K_IS);
  }

  @Override
  @NotNull
  public PsiElement getKOn() {
    return findNotNullChildByType(K_ON);
  }

  @Override
  @NotNull
  public PsiElement getKUnique() {
    return findNotNullChildByType(K_UNIQUE);
  }

}
