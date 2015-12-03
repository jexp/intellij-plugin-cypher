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

public class CypherCommandImpl extends ASTWrapperPsiElement implements CypherCommand {

  public CypherCommandImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CypherVisitor) ((CypherVisitor)visitor).visitCommand(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CypherCreateIndex getCreateIndex() {
    return findChildByClass(CypherCreateIndex.class);
  }

  @Override
  @Nullable
  public CypherCreateNodePropertyExistenceConstraint getCreateNodePropertyExistenceConstraint() {
    return findChildByClass(CypherCreateNodePropertyExistenceConstraint.class);
  }

  @Override
  @Nullable
  public CypherCreateRelationshipPropertyExistenceConstraint getCreateRelationshipPropertyExistenceConstraint() {
    return findChildByClass(CypherCreateRelationshipPropertyExistenceConstraint.class);
  }

  @Override
  @Nullable
  public CypherCreateUniqueConstraint getCreateUniqueConstraint() {
    return findChildByClass(CypherCreateUniqueConstraint.class);
  }

  @Override
  @Nullable
  public CypherDropIndex getDropIndex() {
    return findChildByClass(CypherDropIndex.class);
  }

  @Override
  @Nullable
  public CypherDropNodePropertyExistenceConstraint getDropNodePropertyExistenceConstraint() {
    return findChildByClass(CypherDropNodePropertyExistenceConstraint.class);
  }

  @Override
  @Nullable
  public CypherDropRelationshipPropertyExistenceConstraint getDropRelationshipPropertyExistenceConstraint() {
    return findChildByClass(CypherDropRelationshipPropertyExistenceConstraint.class);
  }

  @Override
  @Nullable
  public CypherDropUniqueConstraint getDropUniqueConstraint() {
    return findChildByClass(CypherDropUniqueConstraint.class);
  }

}
