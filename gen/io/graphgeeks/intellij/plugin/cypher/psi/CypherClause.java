// This is a generated file. Not intended for manual editing.
package io.graphgeeks.intellij.plugin.cypher.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CypherClause extends PsiElement {

  @Nullable
  CypherCreate getCreate();

  @Nullable
  CypherDelete getDelete();

  @Nullable
  CypherForeach getForeach();

  @Nullable
  CypherLoadCSV getLoadCSV();

  @Nullable
  CypherMatch getMatch();

  @Nullable
  CypherMerge getMerge();

  @Nullable
  CypherRemove getRemove();

  @Nullable
  CypherReturn getReturn();

  @Nullable
  CypherSetClause getSetClause();

  @Nullable
  CypherStart getStart();

  @Nullable
  CypherUnwind getUnwind();

  @Nullable
  CypherWith getWith();

}
