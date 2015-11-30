// This is a generated file. Not intended for manual editing.
package io.graphgeeks.intellij.plugin.cypher.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import io.graphgeeks.intellij.plugin.cypher.psi.CypherProperty;
import io.graphgeeks.intellij.plugin.cypher.psi.CypherVisitor;
import org.jetbrains.annotations.NotNull;

public class CypherPropertyImpl extends ASTWrapperPsiElement implements CypherProperty {

  public CypherPropertyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CypherVisitor) ((CypherVisitor)visitor).visitProperty(this);
    else super.accept(visitor);
  }

}
