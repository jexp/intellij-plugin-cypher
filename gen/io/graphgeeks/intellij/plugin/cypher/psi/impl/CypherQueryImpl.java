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

public class CypherQueryImpl extends ASTWrapperPsiElement implements CypherQuery {

  public CypherQueryImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CypherVisitor) ((CypherVisitor)visitor).visitQuery(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CypherBulkImportQuery getBulkImportQuery() {
    return findChildByClass(CypherBulkImportQuery.class);
  }

  @Override
  @Nullable
  public CypherRegularQuery getRegularQuery() {
    return findChildByClass(CypherRegularQuery.class);
  }

}