// This is a generated file. Not intended for manual editing.
package io.graphgeeks.intellij.plugin.cypher.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static io.graphgeeks.intellij.plugin.cypher.psi.CypherTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class CypherParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ANONYMOUS_PATTERN_PART) {
      r = AnonymousPatternPart(b, 0);
    }
    else if (t == BULK_IMPORT_QUERY) {
      r = BulkImportQuery(b, 0);
    }
    else if (t == CLAUSE) {
      r = Clause(b, 0);
    }
    else if (t == COMMAND) {
      r = Command(b, 0);
    }
    else if (t == CREATE) {
      r = Create(b, 0);
    }
    else if (t == CREATE_INDEX) {
      r = CreateIndex(b, 0);
    }
    else if (t == CREATE_NODE_PROPERTY_EXISTENCE_CONSTRAINT) {
      r = CreateNodePropertyExistenceConstraint(b, 0);
    }
    else if (t == CREATE_RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT) {
      r = CreateRelationshipPropertyExistenceConstraint(b, 0);
    }
    else if (t == CREATE_UNIQUE_CONSTRAINT) {
      r = CreateUniqueConstraint(b, 0);
    }
    else if (t == DELETE) {
      r = Delete(b, 0);
    }
    else if (t == DROP_INDEX) {
      r = DropIndex(b, 0);
    }
    else if (t == DROP_NODE_PROPERTY_EXISTENCE_CONSTRAINT) {
      r = DropNodePropertyExistenceConstraint(b, 0);
    }
    else if (t == DROP_RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT) {
      r = DropRelationshipPropertyExistenceConstraint(b, 0);
    }
    else if (t == DROP_UNIQUE_CONSTRAINT) {
      r = DropUniqueConstraint(b, 0);
    }
    else if (t == EXPRESSION) {
      r = Expression(b, 0);
    }
    else if (t == FOREACH) {
      r = Foreach(b, 0);
    }
    else if (t == HINT) {
      r = Hint(b, 0);
    }
    else if (t == IDENTIFIED_INDEX_LOOKUP) {
      r = IdentifiedIndexLookup(b, 0);
    }
    else if (t == IDENTIFIER) {
      r = Identifier(b, 0);
    }
    else if (t == INDEX_QUERY) {
      r = IndexQuery(b, 0);
    }
    else if (t == LABEL_NAME) {
      r = LabelName(b, 0);
    }
    else if (t == LIMIT) {
      r = Limit(b, 0);
    }
    else if (t == LITERAL_IDS) {
      r = LiteralIds(b, 0);
    }
    else if (t == LOAD_CSV) {
      r = LoadCSV(b, 0);
    }
    else if (t == LOAD_CSV_QUERY) {
      r = LoadCSVQuery(b, 0);
    }
    else if (t == LOOKUP) {
      r = Lookup(b, 0);
    }
    else if (t == MAP_LITERAL) {
      r = MapLiteral(b, 0);
    }
    else if (t == MATCH) {
      r = Match(b, 0);
    }
    else if (t == MAYBE_IDENTIFIER) {
      r = MaybeIdentifier(b, 0);
    }
    else if (t == MAYBE_NODE_LABELS) {
      r = MaybeNodeLabels(b, 0);
    }
    else if (t == MAYBE_PROPERTIES) {
      r = MaybeProperties(b, 0);
    }
    else if (t == MAYBE_VARIABLE_LENGTH) {
      r = MaybeVariableLength(b, 0);
    }
    else if (t == MERGE) {
      r = Merge(b, 0);
    }
    else if (t == MERGE_ACTION) {
      r = MergeAction(b, 0);
    }
    else if (t == NODE_ID_LOOKUP) {
      r = NodeIdLookup(b, 0);
    }
    else if (t == NODE_INDEX_LOOKUP) {
      r = NodeIndexLookup(b, 0);
    }
    else if (t == NODE_INDEX_QUERY) {
      r = NodeIndexQuery(b, 0);
    }
    else if (t == NODE_LABEL) {
      r = NodeLabel(b, 0);
    }
    else if (t == NODE_LABELS) {
      r = NodeLabels(b, 0);
    }
    else if (t == NODE_LOOKUP) {
      r = NodeLookup(b, 0);
    }
    else if (t == NODE_PATTERN) {
      r = NodePattern(b, 0);
    }
    else if (t == NODE_PROPERTY_EXISTENCE_CONSTRAINT_SYNTAX) {
      r = NodePropertyExistenceConstraintSyntax(b, 0);
    }
    else if (t == ORDER) {
      r = Order(b, 0);
    }
    else if (t == PARAMETER) {
      r = Parameter(b, 0);
    }
    else if (t == PATTERN) {
      r = Pattern(b, 0);
    }
    else if (t == PATTERN_ELEMENT) {
      r = PatternElement(b, 0);
    }
    else if (t == PATTERN_ELEMENT_CHAIN) {
      r = PatternElementChain(b, 0);
    }
    else if (t == PATTERN_PART) {
      r = PatternPart(b, 0);
    }
    else if (t == PERIODIC_COMMIT_HINT) {
      r = PeriodicCommitHint(b, 0);
    }
    else if (t == PROPERTY_EXPRESSION) {
      r = PropertyExpression(b, 0);
    }
    else if (t == PROPERTY_KEY_NAME) {
      r = PropertyKeyName(b, 0);
    }
    else if (t == QUERY) {
      r = Query(b, 0);
    }
    else if (t == RANGE_LITERAL) {
      r = RangeLiteral(b, 0);
    }
    else if (t == REGULAR_QUERY) {
      r = RegularQuery(b, 0);
    }
    else if (t == REL_TYPE) {
      r = RelType(b, 0);
    }
    else if (t == REL_TYPE_NAME) {
      r = RelTypeName(b, 0);
    }
    else if (t == RELATIONSHIP_DETAIL) {
      r = RelationshipDetail(b, 0);
    }
    else if (t == RELATIONSHIP_ID_LOOKUP) {
      r = RelationshipIdLookup(b, 0);
    }
    else if (t == RELATIONSHIP_INDEX_LOOKUP) {
      r = RelationshipIndexLookup(b, 0);
    }
    else if (t == RELATIONSHIP_INDEX_QUERY) {
      r = RelationshipIndexQuery(b, 0);
    }
    else if (t == RELATIONSHIP_LOOKUP) {
      r = RelationshipLookup(b, 0);
    }
    else if (t == RELATIONSHIP_PATTERN) {
      r = RelationshipPattern(b, 0);
    }
    else if (t == RELATIONSHIP_PATTERN_SYNTAX) {
      r = RelationshipPatternSyntax(b, 0);
    }
    else if (t == RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT_SYNTAX) {
      r = RelationshipPropertyExistenceConstraintSyntax(b, 0);
    }
    else if (t == RELATIONSHIP_TYPES) {
      r = RelationshipTypes(b, 0);
    }
    else if (t == REMOVE) {
      r = Remove(b, 0);
    }
    else if (t == REMOVE_ITEM) {
      r = RemoveItem(b, 0);
    }
    else if (t == RETURN) {
      r = Return(b, 0);
    }
    else if (t == RETURN_BODY) {
      r = ReturnBody(b, 0);
    }
    else if (t == RETURN_ITEM) {
      r = ReturnItem(b, 0);
    }
    else if (t == RETURN_ITEMS) {
      r = ReturnItems(b, 0);
    }
    else if (t == SET_CLAUSE) {
      r = SetClause(b, 0);
    }
    else if (t == SET_ITEM) {
      r = SetItem(b, 0);
    }
    else if (t == SHORTEST_PATH_PATTERN) {
      r = ShortestPathPattern(b, 0);
    }
    else if (t == SIGNED_INTEGER_LITERAL) {
      r = SignedIntegerLiteral(b, 0);
    }
    else if (t == SINGLE_QUERY) {
      r = SingleQuery(b, 0);
    }
    else if (t == SKIP) {
      r = Skip(b, 0);
    }
    else if (t == SORT_ITEM) {
      r = SortItem(b, 0);
    }
    else if (t == START) {
      r = Start(b, 0);
    }
    else if (t == START_POINT) {
      r = StartPoint(b, 0);
    }
    else if (t == STATEMENT) {
      r = Statement(b, 0);
    }
    else if (t == STRING_LITERAL) {
      r = StringLiteral(b, 0);
    }
    else if (t == UNION) {
      r = Union(b, 0);
    }
    else if (t == UNIQUE_CONSTRAINT_SYNTAX) {
      r = UniqueConstraintSyntax(b, 0);
    }
    else if (t == UNSIGNED_INTEGER_LITERAL) {
      r = UnsignedIntegerLiteral(b, 0);
    }
    else if (t == UNWIND) {
      r = Unwind(b, 0);
    }
    else if (t == WHERE) {
      r = Where(b, 0);
    }
    else if (t == WITH) {
      r = With(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return cypher(b, l + 1);
  }

  /* ********************************************************** */
  // ShortestPathPattern | PatternElement
  public static boolean AnonymousPatternPart(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnonymousPatternPart")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<anonymous pattern part>");
    r = ShortestPathPattern(b, l + 1);
    if (!r) r = PatternElement(b, l + 1);
    exit_section_(b, l, m, ANONYMOUS_PATTERN_PART, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PeriodicCommitHint LoadCSVQuery
  public static boolean BulkImportQuery(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BulkImportQuery")) return false;
    if (!nextTokenIs(b, K_USING_PERIODIC_COMMIT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PeriodicCommitHint(b, l + 1);
    r = r && LoadCSVQuery(b, l + 1);
    exit_section_(b, m, BULK_IMPORT_QUERY, r);
    return r;
  }

  /* ********************************************************** */
  // LoadCSV
  //     | Start
  //     | Match
  //     | Unwind
  //     | Merge
  //     | Create
  //     | SetClause
  //     | Delete
  //     | Remove
  //     | Foreach
  //     | With
  //     | Return
  public static boolean Clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Clause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<clause>");
    r = LoadCSV(b, l + 1);
    if (!r) r = Start(b, l + 1);
    if (!r) r = Match(b, l + 1);
    if (!r) r = Unwind(b, l + 1);
    if (!r) r = Merge(b, l + 1);
    if (!r) r = Create(b, l + 1);
    if (!r) r = SetClause(b, l + 1);
    if (!r) r = Delete(b, l + 1);
    if (!r) r = Remove(b, l + 1);
    if (!r) r = Foreach(b, l + 1);
    if (!r) r = With(b, l + 1);
    if (!r) r = Return(b, l + 1);
    exit_section_(b, l, m, CLAUSE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // CreateUniqueConstraint
  //           | CreateNodePropertyExistenceConstraint
  //           | CreateRelationshipPropertyExistenceConstraint
  //           | CreateIndex
  //           | DropUniqueConstraint
  //           | DropNodePropertyExistenceConstraint
  //           | DropRelationshipPropertyExistenceConstraint
  //           | DropIndex
  public static boolean Command(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Command")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<command>");
    r = CreateUniqueConstraint(b, l + 1);
    if (!r) r = CreateNodePropertyExistenceConstraint(b, l + 1);
    if (!r) r = CreateRelationshipPropertyExistenceConstraint(b, l + 1);
    if (!r) r = CreateIndex(b, l + 1);
    if (!r) r = DropUniqueConstraint(b, l + 1);
    if (!r) r = DropNodePropertyExistenceConstraint(b, l + 1);
    if (!r) r = DropRelationshipPropertyExistenceConstraint(b, l + 1);
    if (!r) r = DropIndex(b, l + 1);
    exit_section_(b, l, m, COMMAND, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (K_CREATE_UNIQUE Pattern) | (K_CREATE Pattern)
  public static boolean Create(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Create")) return false;
    if (!nextTokenIs(b, "<create>", K_CREATE, K_CREATE_UNIQUE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<create>");
    r = Create_0(b, l + 1);
    if (!r) r = Create_1(b, l + 1);
    exit_section_(b, l, m, CREATE, r, false, null);
    return r;
  }

  // K_CREATE_UNIQUE Pattern
  private static boolean Create_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Create_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_CREATE_UNIQUE);
    r = r && Pattern(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // K_CREATE Pattern
  private static boolean Create_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Create_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_CREATE);
    r = r && Pattern(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // K_CREATE_INDEX_ON NodeLabel "(" PropertyKeyName ")"
  public static boolean CreateIndex(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CreateIndex")) return false;
    if (!nextTokenIs(b, K_CREATE_INDEX_ON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_CREATE_INDEX_ON);
    r = r && NodeLabel(b, l + 1);
    r = r && consumeToken(b, LEFTBRACE);
    r = r && PropertyKeyName(b, l + 1);
    r = r && consumeToken(b, RIGHTBRACE);
    exit_section_(b, m, CREATE_INDEX, r);
    return r;
  }

  /* ********************************************************** */
  // K_CREATE NodePropertyExistenceConstraintSyntax
  public static boolean CreateNodePropertyExistenceConstraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CreateNodePropertyExistenceConstraint")) return false;
    if (!nextTokenIs(b, K_CREATE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_CREATE);
    r = r && NodePropertyExistenceConstraintSyntax(b, l + 1);
    exit_section_(b, m, CREATE_NODE_PROPERTY_EXISTENCE_CONSTRAINT, r);
    return r;
  }

  /* ********************************************************** */
  // K_CREATE RelationshipPropertyExistenceConstraintSyntax
  public static boolean CreateRelationshipPropertyExistenceConstraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CreateRelationshipPropertyExistenceConstraint")) return false;
    if (!nextTokenIs(b, K_CREATE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_CREATE);
    r = r && RelationshipPropertyExistenceConstraintSyntax(b, l + 1);
    exit_section_(b, m, CREATE_RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT, r);
    return r;
  }

  /* ********************************************************** */
  // K_CREATE UniqueConstraintSyntax
  public static boolean CreateUniqueConstraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CreateUniqueConstraint")) return false;
    if (!nextTokenIs(b, K_CREATE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_CREATE);
    r = r && UniqueConstraintSyntax(b, l + 1);
    exit_section_(b, m, CREATE_UNIQUE_CONSTRAINT, r);
    return r;
  }

  /* ********************************************************** */
  // "-"
  static boolean Dash(PsiBuilder b, int l) {
    return consumeToken(b, MINUS);
  }

  /* ********************************************************** */
  // (K_DELETE Expression ("," Expression)*) | (K_DETACH_DELETE Expression ("," Expression)*)
  public static boolean Delete(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Delete")) return false;
    if (!nextTokenIs(b, "<delete>", K_DELETE, K_DETACH_DELETE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<delete>");
    r = Delete_0(b, l + 1);
    if (!r) r = Delete_1(b, l + 1);
    exit_section_(b, l, m, DELETE, r, false, null);
    return r;
  }

  // K_DELETE Expression ("," Expression)*
  private static boolean Delete_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Delete_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_DELETE);
    r = r && Expression(b, l + 1);
    r = r && Delete_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("," Expression)*
  private static boolean Delete_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Delete_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Delete_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Delete_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // "," Expression
  private static boolean Delete_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Delete_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // K_DETACH_DELETE Expression ("," Expression)*
  private static boolean Delete_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Delete_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_DETACH_DELETE);
    r = r && Expression(b, l + 1);
    r = r && Delete_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("," Expression)*
  private static boolean Delete_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Delete_1_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Delete_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Delete_1_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // "," Expression
  private static boolean Delete_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Delete_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // K_DROP_INDEX_ON NodeLabel "(" PropertyKeyName ")"
  public static boolean DropIndex(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DropIndex")) return false;
    if (!nextTokenIs(b, K_DROP_INDEX_ON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_DROP_INDEX_ON);
    r = r && NodeLabel(b, l + 1);
    r = r && consumeToken(b, LEFTBRACE);
    r = r && PropertyKeyName(b, l + 1);
    r = r && consumeToken(b, RIGHTBRACE);
    exit_section_(b, m, DROP_INDEX, r);
    return r;
  }

  /* ********************************************************** */
  // K_DROP NodePropertyExistenceConstraintSyntax
  public static boolean DropNodePropertyExistenceConstraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DropNodePropertyExistenceConstraint")) return false;
    if (!nextTokenIs(b, K_DROP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_DROP);
    r = r && NodePropertyExistenceConstraintSyntax(b, l + 1);
    exit_section_(b, m, DROP_NODE_PROPERTY_EXISTENCE_CONSTRAINT, r);
    return r;
  }

  /* ********************************************************** */
  // K_DROP RelationshipPropertyExistenceConstraintSyntax
  public static boolean DropRelationshipPropertyExistenceConstraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DropRelationshipPropertyExistenceConstraint")) return false;
    if (!nextTokenIs(b, K_DROP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_DROP);
    r = r && RelationshipPropertyExistenceConstraintSyntax(b, l + 1);
    exit_section_(b, m, DROP_RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT, r);
    return r;
  }

  /* ********************************************************** */
  // K_DROP UniqueConstraintSyntax
  public static boolean DropUniqueConstraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DropUniqueConstraint")) return false;
    if (!nextTokenIs(b, K_DROP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_DROP);
    r = r && UniqueConstraintSyntax(b, l + 1);
    exit_section_(b, m, DROP_UNIQUE_CONSTRAINT, r);
    return r;
  }

  /* ********************************************************** */
  // l_identifier_text
  static boolean EscapedSymbolicNameString(PsiBuilder b, int l) {
    return consumeToken(b, L_IDENTIFIER_TEXT);
  }

  /* ********************************************************** */
  // "expstub"
  public static boolean Expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<expression>");
    r = consumeToken(b, "expstub");
    exit_section_(b, l, m, EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // K_FOREACH "(" Identifier K_IN Expression "|" Clause+ ")"
  public static boolean Foreach(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Foreach")) return false;
    if (!nextTokenIs(b, K_FOREACH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_FOREACH);
    r = r && consumeToken(b, LEFTBRACE);
    r = r && Identifier(b, l + 1);
    r = r && consumeToken(b, K_IN);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, PIPE);
    r = r && Foreach_6(b, l + 1);
    r = r && consumeToken(b, RIGHTBRACE);
    exit_section_(b, m, FOREACH, r);
    return r;
  }

  // Clause+
  private static boolean Foreach_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Foreach_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Clause(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!Clause(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Foreach_6", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (K_USING_INDEX Identifier NodeLabel "(" PropertyKeyName ")")
  //        | (K_USING_JOIN_ON Identifier ("," Identifier)*)
  //        | (K_USING_SCAN Identifier NodeLabel)
  public static boolean Hint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Hint")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<hint>");
    r = Hint_0(b, l + 1);
    if (!r) r = Hint_1(b, l + 1);
    if (!r) r = Hint_2(b, l + 1);
    exit_section_(b, l, m, HINT, r, false, null);
    return r;
  }

  // K_USING_INDEX Identifier NodeLabel "(" PropertyKeyName ")"
  private static boolean Hint_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Hint_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_USING_INDEX);
    r = r && Identifier(b, l + 1);
    r = r && NodeLabel(b, l + 1);
    r = r && consumeToken(b, LEFTBRACE);
    r = r && PropertyKeyName(b, l + 1);
    r = r && consumeToken(b, RIGHTBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // K_USING_JOIN_ON Identifier ("," Identifier)*
  private static boolean Hint_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Hint_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_USING_JOIN_ON);
    r = r && Identifier(b, l + 1);
    r = r && Hint_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("," Identifier)*
  private static boolean Hint_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Hint_1_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Hint_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Hint_1_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // "," Identifier
  private static boolean Hint_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Hint_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // K_USING_SCAN Identifier NodeLabel
  private static boolean Hint_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Hint_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_USING_SCAN);
    r = r && Identifier(b, l + 1);
    r = r && NodeLabel(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ":" SymbolicNameString "(" SymbolicNameString "=" (StringLiteral | Parameter) ")"
  public static boolean IdentifiedIndexLookup(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentifiedIndexLookup")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && SymbolicNameString(b, l + 1);
    r = r && consumeToken(b, LEFTBRACE);
    r = r && SymbolicNameString(b, l + 1);
    r = r && consumeToken(b, EQUAL);
    r = r && IdentifiedIndexLookup_5(b, l + 1);
    r = r && consumeToken(b, RIGHTBRACE);
    exit_section_(b, m, IDENTIFIED_INDEX_LOOKUP, r);
    return r;
  }

  // StringLiteral | Parameter
  private static boolean IdentifiedIndexLookup_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentifiedIndexLookup_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StringLiteral(b, l + 1);
    if (!r) r = Parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SymbolicNameString
  public static boolean Identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Identifier")) return false;
    if (!nextTokenIs(b, "<identifier>", L_IDENTIFIER, L_IDENTIFIER_TEXT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<identifier>");
    r = SymbolicNameString(b, l + 1);
    exit_section_(b, l, m, IDENTIFIER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ":" SymbolicNameString "(" (StringLiteral | Parameter) ")"
  public static boolean IndexQuery(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IndexQuery")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && SymbolicNameString(b, l + 1);
    r = r && consumeToken(b, LEFTBRACE);
    r = r && IndexQuery_3(b, l + 1);
    r = r && consumeToken(b, RIGHTBRACE);
    exit_section_(b, m, INDEX_QUERY, r);
    return r;
  }

  // StringLiteral | Parameter
  private static boolean IndexQuery_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IndexQuery_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StringLiteral(b, l + 1);
    if (!r) r = Parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SymbolicNameString
  public static boolean LabelName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabelName")) return false;
    if (!nextTokenIs(b, "<label name>", L_IDENTIFIER, L_IDENTIFIER_TEXT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<label name>");
    r = SymbolicNameString(b, l + 1);
    exit_section_(b, l, m, LABEL_NAME, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "<"
  static boolean LeftArrowHead(PsiBuilder b, int l) {
    return consumeToken(b, LESSTHEN);
  }

  /* ********************************************************** */
  // K_LIMIT Expression
  public static boolean Limit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Limit")) return false;
    if (!nextTokenIs(b, K_LIMIT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_LIMIT);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, LIMIT, r);
    return r;
  }

  /* ********************************************************** */
  // UnsignedIntegerLiteral ("," UnsignedIntegerLiteral)*
  public static boolean LiteralIds(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LiteralIds")) return false;
    if (!nextTokenIs(b, L_INTEGER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UnsignedIntegerLiteral(b, l + 1);
    r = r && LiteralIds_1(b, l + 1);
    exit_section_(b, m, LITERAL_IDS, r);
    return r;
  }

  // ("," UnsignedIntegerLiteral)*
  private static boolean LiteralIds_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LiteralIds_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!LiteralIds_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LiteralIds_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // "," UnsignedIntegerLiteral
  private static boolean LiteralIds_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LiteralIds_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && UnsignedIntegerLiteral(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // K_LOAD_CSV K_WITH_HEADERS? K_FROM Expression K_AS Identifier (K_FIELDTERMINATOR StringLiteral)?
  public static boolean LoadCSV(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LoadCSV")) return false;
    if (!nextTokenIs(b, K_LOAD_CSV)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_LOAD_CSV);
    r = r && LoadCSV_1(b, l + 1);
    r = r && consumeToken(b, K_FROM);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, K_AS);
    r = r && Identifier(b, l + 1);
    r = r && LoadCSV_6(b, l + 1);
    exit_section_(b, m, LOAD_CSV, r);
    return r;
  }

  // K_WITH_HEADERS?
  private static boolean LoadCSV_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LoadCSV_1")) return false;
    consumeToken(b, K_WITH_HEADERS);
    return true;
  }

  // (K_FIELDTERMINATOR StringLiteral)?
  private static boolean LoadCSV_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LoadCSV_6")) return false;
    LoadCSV_6_0(b, l + 1);
    return true;
  }

  // K_FIELDTERMINATOR StringLiteral
  private static boolean LoadCSV_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LoadCSV_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_FIELDTERMINATOR);
    r = r && StringLiteral(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LoadCSV Clause*
  public static boolean LoadCSVQuery(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LoadCSVQuery")) return false;
    if (!nextTokenIs(b, K_LOAD_CSV)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LoadCSV(b, l + 1);
    r = r && LoadCSVQuery_1(b, l + 1);
    exit_section_(b, m, LOAD_CSV_QUERY, r);
    return r;
  }

  // Clause*
  private static boolean LoadCSVQuery_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LoadCSVQuery_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Clause(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LoadCSVQuery_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // NodeLookup | RelationshipLookup
  public static boolean Lookup(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Lookup")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<lookup>");
    r = NodeLookup(b, l + 1);
    if (!r) r = RelationshipLookup(b, l + 1);
    exit_section_(b, l, m, LOOKUP, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "{" (PropertyKeyName ":" Expression)? ("," (PropertyKeyName ":" Expression))* "}"
  public static boolean MapLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapLiteral")) return false;
    if (!nextTokenIs(b, LEFTCURLYBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFTCURLYBRACE);
    r = r && MapLiteral_1(b, l + 1);
    r = r && MapLiteral_2(b, l + 1);
    r = r && consumeToken(b, RIGHTCURLYBRACE);
    exit_section_(b, m, MAP_LITERAL, r);
    return r;
  }

  // (PropertyKeyName ":" Expression)?
  private static boolean MapLiteral_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapLiteral_1")) return false;
    MapLiteral_1_0(b, l + 1);
    return true;
  }

  // PropertyKeyName ":" Expression
  private static boolean MapLiteral_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapLiteral_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PropertyKeyName(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("," (PropertyKeyName ":" Expression))*
  private static boolean MapLiteral_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapLiteral_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!MapLiteral_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MapLiteral_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // "," (PropertyKeyName ":" Expression)
  private static boolean MapLiteral_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapLiteral_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && MapLiteral_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PropertyKeyName ":" Expression
  private static boolean MapLiteral_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapLiteral_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PropertyKeyName(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (K_OPTIONAL_MATCH | K_MATCH) Pattern Hint* Where?
  public static boolean Match(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Match")) return false;
    if (!nextTokenIs(b, "<match>", K_MATCH, K_OPTIONAL_MATCH)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<match>");
    r = Match_0(b, l + 1);
    r = r && Pattern(b, l + 1);
    r = r && Match_2(b, l + 1);
    r = r && Match_3(b, l + 1);
    exit_section_(b, l, m, MATCH, r, false, null);
    return r;
  }

  // K_OPTIONAL_MATCH | K_MATCH
  private static boolean Match_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Match_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_OPTIONAL_MATCH);
    if (!r) r = consumeToken(b, K_MATCH);
    exit_section_(b, m, null, r);
    return r;
  }

  // Hint*
  private static boolean Match_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Match_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Hint(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Match_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // Where?
  private static boolean Match_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Match_3")) return false;
    Where(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Identifier?
  public static boolean MaybeIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaybeIdentifier")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<maybe identifier>");
    Identifier(b, l + 1);
    exit_section_(b, l, m, MAYBE_IDENTIFIER, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // NodeLabels?
  public static boolean MaybeNodeLabels(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaybeNodeLabels")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<maybe node labels>");
    NodeLabels(b, l + 1);
    exit_section_(b, l, m, MAYBE_NODE_LABELS, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // (MapLiteral | Parameter)?
  public static boolean MaybeProperties(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaybeProperties")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<maybe properties>");
    MaybeProperties_0(b, l + 1);
    exit_section_(b, l, m, MAYBE_PROPERTIES, true, false, null);
    return true;
  }

  // MapLiteral | Parameter
  private static boolean MaybeProperties_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaybeProperties_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MapLiteral(b, l + 1);
    if (!r) r = Parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ("*" RangeLiteral?)?
  public static boolean MaybeVariableLength(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaybeVariableLength")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<maybe variable length>");
    MaybeVariableLength_0(b, l + 1);
    exit_section_(b, l, m, MAYBE_VARIABLE_LENGTH, true, false, null);
    return true;
  }

  // "*" RangeLiteral?
  private static boolean MaybeVariableLength_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaybeVariableLength_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MUL);
    r = r && MaybeVariableLength_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // RangeLiteral?
  private static boolean MaybeVariableLength_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaybeVariableLength_0_1")) return false;
    RangeLiteral(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // K_MERGE PatternPart MergeAction*
  public static boolean Merge(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Merge")) return false;
    if (!nextTokenIs(b, K_MERGE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_MERGE);
    r = r && PatternPart(b, l + 1);
    r = r && Merge_2(b, l + 1);
    exit_section_(b, m, MERGE, r);
    return r;
  }

  // MergeAction*
  private static boolean Merge_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Merge_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!MergeAction(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Merge_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // (K_ON_MATCH SetClause)
  //               | (K_ON_CREATE SetClause)
  public static boolean MergeAction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MergeAction")) return false;
    if (!nextTokenIs(b, "<merge action>", K_ON_CREATE, K_ON_MATCH)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<merge action>");
    r = MergeAction_0(b, l + 1);
    if (!r) r = MergeAction_1(b, l + 1);
    exit_section_(b, l, m, MERGE_ACTION, r, false, null);
    return r;
  }

  // K_ON_MATCH SetClause
  private static boolean MergeAction_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MergeAction_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_ON_MATCH);
    r = r && SetClause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // K_ON_CREATE SetClause
  private static boolean MergeAction_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MergeAction_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_ON_CREATE);
    r = r && SetClause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "(" (LiteralIds | Parameter | "*") ")"
  public static boolean NodeIdLookup(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NodeIdLookup")) return false;
    if (!nextTokenIs(b, LEFTBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFTBRACE);
    r = r && NodeIdLookup_1(b, l + 1);
    r = r && consumeToken(b, RIGHTBRACE);
    exit_section_(b, m, NODE_ID_LOOKUP, r);
    return r;
  }

  // LiteralIds | Parameter | "*"
  private static boolean NodeIdLookup_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NodeIdLookup_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LiteralIds(b, l + 1);
    if (!r) r = Parameter(b, l + 1);
    if (!r) r = consumeToken(b, MUL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IdentifiedIndexLookup
  public static boolean NodeIndexLookup(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NodeIndexLookup")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IdentifiedIndexLookup(b, l + 1);
    exit_section_(b, m, NODE_INDEX_LOOKUP, r);
    return r;
  }

  /* ********************************************************** */
  // IndexQuery
  public static boolean NodeIndexQuery(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NodeIndexQuery")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IndexQuery(b, l + 1);
    exit_section_(b, m, NODE_INDEX_QUERY, r);
    return r;
  }

  /* ********************************************************** */
  // ":" LabelName
  public static boolean NodeLabel(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NodeLabel")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && LabelName(b, l + 1);
    exit_section_(b, m, NODE_LABEL, r);
    return r;
  }

  /* ********************************************************** */
  // NodeLabel+
  public static boolean NodeLabels(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NodeLabels")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NodeLabel(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!NodeLabel(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "NodeLabels", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, NODE_LABELS, r);
    return r;
  }

  /* ********************************************************** */
  // K_NODE (NodeIndexLookup | NodeIndexQuery | NodeIdLookup)
  public static boolean NodeLookup(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NodeLookup")) return false;
    if (!nextTokenIs(b, K_NODE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_NODE);
    r = r && NodeLookup_1(b, l + 1);
    exit_section_(b, m, NODE_LOOKUP, r);
    return r;
  }

  // NodeIndexLookup | NodeIndexQuery | NodeIdLookup
  private static boolean NodeLookup_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NodeLookup_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NodeIndexLookup(b, l + 1);
    if (!r) r = NodeIndexQuery(b, l + 1);
    if (!r) r = NodeIdLookup(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ("(" MaybeIdentifier MaybeNodeLabels MaybeProperties ")")
  //               | (MaybeIdentifier MaybeNodeLabels MaybeProperties)
  public static boolean NodePattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NodePattern")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<node pattern>");
    r = NodePattern_0(b, l + 1);
    if (!r) r = NodePattern_1(b, l + 1);
    exit_section_(b, l, m, NODE_PATTERN, r, false, null);
    return r;
  }

  // "(" MaybeIdentifier MaybeNodeLabels MaybeProperties ")"
  private static boolean NodePattern_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NodePattern_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFTBRACE);
    r = r && MaybeIdentifier(b, l + 1);
    r = r && MaybeNodeLabels(b, l + 1);
    r = r && MaybeProperties(b, l + 1);
    r = r && consumeToken(b, RIGHTBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // MaybeIdentifier MaybeNodeLabels MaybeProperties
  private static boolean NodePattern_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NodePattern_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MaybeIdentifier(b, l + 1);
    r = r && MaybeNodeLabels(b, l + 1);
    r = r && MaybeProperties(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // K_CONSTRAINT_ON "(" Identifier NodeLabel  ")" K_ASSERT_EXISTS "(" PropertyExpression ")"
  public static boolean NodePropertyExistenceConstraintSyntax(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NodePropertyExistenceConstraintSyntax")) return false;
    if (!nextTokenIs(b, K_CONSTRAINT_ON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_CONSTRAINT_ON);
    r = r && consumeToken(b, LEFTBRACE);
    r = r && Identifier(b, l + 1);
    r = r && NodeLabel(b, l + 1);
    r = r && consumeToken(b, RIGHTBRACE);
    r = r && consumeToken(b, K_ASSERT_EXISTS);
    r = r && consumeToken(b, LEFTBRACE);
    r = r && PropertyExpression(b, l + 1);
    r = r && consumeToken(b, RIGHTBRACE);
    exit_section_(b, m, NODE_PROPERTY_EXISTENCE_CONSTRAINT_SYNTAX, r);
    return r;
  }

  /* ********************************************************** */
  // K_ORDER_BY SortItem ("," SortItem)*
  public static boolean Order(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Order")) return false;
    if (!nextTokenIs(b, K_ORDER_BY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_ORDER_BY);
    r = r && SortItem(b, l + 1);
    r = r && Order_2(b, l + 1);
    exit_section_(b, m, ORDER, r);
    return r;
  }

  // ("," SortItem)*
  private static boolean Order_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Order_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Order_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Order_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // "," SortItem
  private static boolean Order_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Order_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && SortItem(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "{" (SymbolicNameString | UnsignedDecimalInteger) "}"
  public static boolean Parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter")) return false;
    if (!nextTokenIs(b, LEFTCURLYBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFTCURLYBRACE);
    r = r && Parameter_1(b, l + 1);
    r = r && consumeToken(b, RIGHTCURLYBRACE);
    exit_section_(b, m, PARAMETER, r);
    return r;
  }

  // SymbolicNameString | UnsignedDecimalInteger
  private static boolean Parameter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SymbolicNameString(b, l + 1);
    if (!r) r = UnsignedDecimalInteger(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PatternPart ("," PatternPart)*
  public static boolean Pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pattern")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<pattern>");
    r = PatternPart(b, l + 1);
    r = r && Pattern_1(b, l + 1);
    exit_section_(b, l, m, PATTERN, r, false, null);
    return r;
  }

  // ("," PatternPart)*
  private static boolean Pattern_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pattern_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Pattern_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Pattern_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // "," PatternPart
  private static boolean Pattern_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pattern_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && PatternPart(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (NodePattern PatternElementChain*) | ("(" PatternElement ")")
  public static boolean PatternElement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternElement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<pattern element>");
    r = PatternElement_0(b, l + 1);
    if (!r) r = PatternElement_1(b, l + 1);
    exit_section_(b, l, m, PATTERN_ELEMENT, r, false, null);
    return r;
  }

  // NodePattern PatternElementChain*
  private static boolean PatternElement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternElement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NodePattern(b, l + 1);
    r = r && PatternElement_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PatternElementChain*
  private static boolean PatternElement_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternElement_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!PatternElementChain(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "PatternElement_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // "(" PatternElement ")"
  private static boolean PatternElement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternElement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFTBRACE);
    r = r && PatternElement(b, l + 1);
    r = r && consumeToken(b, RIGHTBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // RelationshipPattern NodePattern
  public static boolean PatternElementChain(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternElementChain")) return false;
    if (!nextTokenIs(b, "<pattern element chain>", MINUS, LESSTHEN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<pattern element chain>");
    r = RelationshipPattern(b, l + 1);
    r = r && NodePattern(b, l + 1);
    exit_section_(b, l, m, PATTERN_ELEMENT_CHAIN, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (Identifier "=" AnonymousPatternPart) | AnonymousPatternPart
  public static boolean PatternPart(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternPart")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<pattern part>");
    r = PatternPart_0(b, l + 1);
    if (!r) r = AnonymousPatternPart(b, l + 1);
    exit_section_(b, l, m, PATTERN_PART, r, false, null);
    return r;
  }

  // Identifier "=" AnonymousPatternPart
  private static boolean PatternPart_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternPart_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && consumeToken(b, EQUAL);
    r = r && AnonymousPatternPart(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // K_USING_PERIODIC_COMMIT SignedIntegerLiteral?
  public static boolean PeriodicCommitHint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PeriodicCommitHint")) return false;
    if (!nextTokenIs(b, K_USING_PERIODIC_COMMIT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_USING_PERIODIC_COMMIT);
    r = r && PeriodicCommitHint_1(b, l + 1);
    exit_section_(b, m, PERIODIC_COMMIT_HINT, r);
    return r;
  }

  // SignedIntegerLiteral?
  private static boolean PeriodicCommitHint_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PeriodicCommitHint_1")) return false;
    SignedIntegerLiteral(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "propexpstub"
  public static boolean PropertyExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PropertyExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<property expression>");
    r = consumeToken(b, "propexpstub");
    exit_section_(b, l, m, PROPERTY_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SymbolicNameString
  public static boolean PropertyKeyName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PropertyKeyName")) return false;
    if (!nextTokenIs(b, "<property key name>", L_IDENTIFIER, L_IDENTIFIER_TEXT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<property key name>");
    r = SymbolicNameString(b, l + 1);
    exit_section_(b, l, m, PROPERTY_KEY_NAME, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // RegularQuery | BulkImportQuery
  public static boolean Query(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Query")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<query>");
    r = RegularQuery(b, l + 1);
    if (!r) r = BulkImportQuery(b, l + 1);
    exit_section_(b, l, m, QUERY, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (UnsignedIntegerLiteral? ".." UnsignedIntegerLiteral?) | (UnsignedIntegerLiteral)
  public static boolean RangeLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RangeLiteral")) return false;
    if (!nextTokenIs(b, "<range literal>", RANGE, L_INTEGER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<range literal>");
    r = RangeLiteral_0(b, l + 1);
    if (!r) r = RangeLiteral_1(b, l + 1);
    exit_section_(b, l, m, RANGE_LITERAL, r, false, null);
    return r;
  }

  // UnsignedIntegerLiteral? ".." UnsignedIntegerLiteral?
  private static boolean RangeLiteral_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RangeLiteral_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RangeLiteral_0_0(b, l + 1);
    r = r && consumeToken(b, RANGE);
    r = r && RangeLiteral_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // UnsignedIntegerLiteral?
  private static boolean RangeLiteral_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RangeLiteral_0_0")) return false;
    UnsignedIntegerLiteral(b, l + 1);
    return true;
  }

  // UnsignedIntegerLiteral?
  private static boolean RangeLiteral_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RangeLiteral_0_2")) return false;
    UnsignedIntegerLiteral(b, l + 1);
    return true;
  }

  // (UnsignedIntegerLiteral)
  private static boolean RangeLiteral_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RangeLiteral_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UnsignedIntegerLiteral(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SingleQuery Union*
  public static boolean RegularQuery(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RegularQuery")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<regular query>");
    r = SingleQuery(b, l + 1);
    r = r && RegularQuery_1(b, l + 1);
    exit_section_(b, l, m, REGULAR_QUERY, r, false, null);
    return r;
  }

  // Union*
  private static boolean RegularQuery_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RegularQuery_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Union(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RegularQuery_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // ":" RelTypeName
  public static boolean RelType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelType")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && RelTypeName(b, l + 1);
    exit_section_(b, m, REL_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // SymbolicNameString
  public static boolean RelTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelTypeName")) return false;
    if (!nextTokenIs(b, "<rel type name>", L_IDENTIFIER, L_IDENTIFIER_TEXT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<rel type name>");
    r = SymbolicNameString(b, l + 1);
    exit_section_(b, l, m, REL_TYPE_NAME, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "[" MaybeIdentifier "?"? RelationshipTypes MaybeVariableLength MaybeProperties "]"
  public static boolean RelationshipDetail(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipDetail")) return false;
    if (!nextTokenIs(b, LEFTSQUAREBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFTSQUAREBRACE);
    r = r && MaybeIdentifier(b, l + 1);
    r = r && RelationshipDetail_2(b, l + 1);
    r = r && RelationshipTypes(b, l + 1);
    r = r && MaybeVariableLength(b, l + 1);
    r = r && MaybeProperties(b, l + 1);
    r = r && consumeToken(b, RIGHTSQUAREBRACE);
    exit_section_(b, m, RELATIONSHIP_DETAIL, r);
    return r;
  }

  // "?"?
  private static boolean RelationshipDetail_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipDetail_2")) return false;
    consumeToken(b, QUESTIONSIGN);
    return true;
  }

  /* ********************************************************** */
  // "(" (LiteralIds | Parameter | "*") ")"
  public static boolean RelationshipIdLookup(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipIdLookup")) return false;
    if (!nextTokenIs(b, LEFTBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFTBRACE);
    r = r && RelationshipIdLookup_1(b, l + 1);
    r = r && consumeToken(b, RIGHTBRACE);
    exit_section_(b, m, RELATIONSHIP_ID_LOOKUP, r);
    return r;
  }

  // LiteralIds | Parameter | "*"
  private static boolean RelationshipIdLookup_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipIdLookup_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LiteralIds(b, l + 1);
    if (!r) r = Parameter(b, l + 1);
    if (!r) r = consumeToken(b, MUL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IdentifiedIndexLookup
  public static boolean RelationshipIndexLookup(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipIndexLookup")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IdentifiedIndexLookup(b, l + 1);
    exit_section_(b, m, RELATIONSHIP_INDEX_LOOKUP, r);
    return r;
  }

  /* ********************************************************** */
  // IndexQuery
  public static boolean RelationshipIndexQuery(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipIndexQuery")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IndexQuery(b, l + 1);
    exit_section_(b, m, RELATIONSHIP_INDEX_QUERY, r);
    return r;
  }

  /* ********************************************************** */
  // (K_RELATIONSHIP | K_REL) (RelationshipIndexLookup | RelationshipIndexQuery | RelationshipIdLookup)
  public static boolean RelationshipLookup(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipLookup")) return false;
    if (!nextTokenIs(b, "<relationship lookup>", K_REL, K_RELATIONSHIP)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<relationship lookup>");
    r = RelationshipLookup_0(b, l + 1);
    r = r && RelationshipLookup_1(b, l + 1);
    exit_section_(b, l, m, RELATIONSHIP_LOOKUP, r, false, null);
    return r;
  }

  // K_RELATIONSHIP | K_REL
  private static boolean RelationshipLookup_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipLookup_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_RELATIONSHIP);
    if (!r) r = consumeToken(b, K_REL);
    exit_section_(b, m, null, r);
    return r;
  }

  // RelationshipIndexLookup | RelationshipIndexQuery | RelationshipIdLookup
  private static boolean RelationshipLookup_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipLookup_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RelationshipIndexLookup(b, l + 1);
    if (!r) r = RelationshipIndexQuery(b, l + 1);
    if (!r) r = RelationshipIdLookup(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (LeftArrowHead Dash RelationshipDetail? Dash RightArrowHead)
  //                       | (LeftArrowHead Dash RelationshipDetail? Dash)
  //                       | (Dash RelationshipDetail? Dash RightArrowHead)
  //                       | (Dash RelationshipDetail? Dash)
  public static boolean RelationshipPattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipPattern")) return false;
    if (!nextTokenIs(b, "<relationship pattern>", MINUS, LESSTHEN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<relationship pattern>");
    r = RelationshipPattern_0(b, l + 1);
    if (!r) r = RelationshipPattern_1(b, l + 1);
    if (!r) r = RelationshipPattern_2(b, l + 1);
    if (!r) r = RelationshipPattern_3(b, l + 1);
    exit_section_(b, l, m, RELATIONSHIP_PATTERN, r, false, null);
    return r;
  }

  // LeftArrowHead Dash RelationshipDetail? Dash RightArrowHead
  private static boolean RelationshipPattern_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipPattern_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LeftArrowHead(b, l + 1);
    r = r && Dash(b, l + 1);
    r = r && RelationshipPattern_0_2(b, l + 1);
    r = r && Dash(b, l + 1);
    r = r && RightArrowHead(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // RelationshipDetail?
  private static boolean RelationshipPattern_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipPattern_0_2")) return false;
    RelationshipDetail(b, l + 1);
    return true;
  }

  // LeftArrowHead Dash RelationshipDetail? Dash
  private static boolean RelationshipPattern_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipPattern_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LeftArrowHead(b, l + 1);
    r = r && Dash(b, l + 1);
    r = r && RelationshipPattern_1_2(b, l + 1);
    r = r && Dash(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // RelationshipDetail?
  private static boolean RelationshipPattern_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipPattern_1_2")) return false;
    RelationshipDetail(b, l + 1);
    return true;
  }

  // Dash RelationshipDetail? Dash RightArrowHead
  private static boolean RelationshipPattern_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipPattern_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Dash(b, l + 1);
    r = r && RelationshipPattern_2_1(b, l + 1);
    r = r && Dash(b, l + 1);
    r = r && RightArrowHead(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // RelationshipDetail?
  private static boolean RelationshipPattern_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipPattern_2_1")) return false;
    RelationshipDetail(b, l + 1);
    return true;
  }

  // Dash RelationshipDetail? Dash
  private static boolean RelationshipPattern_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipPattern_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Dash(b, l + 1);
    r = r && RelationshipPattern_3_1(b, l + 1);
    r = r && Dash(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // RelationshipDetail?
  private static boolean RelationshipPattern_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipPattern_3_1")) return false;
    RelationshipDetail(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ("()-[" Identifier RelType "]-()") // todo: move this to literals
  //       | ("()-[" Identifier RelType "]->()")
  //       | ("()<-[" Identifier RelType "]-()")
  public static boolean RelationshipPatternSyntax(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipPatternSyntax")) return false;
    if (!nextTokenIs(b, "<relationship pattern syntax>", STARTRELPATTERN, STARTRELPATTERNDIRECTED)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<relationship pattern syntax>");
    r = RelationshipPatternSyntax_0(b, l + 1);
    if (!r) r = RelationshipPatternSyntax_1(b, l + 1);
    if (!r) r = RelationshipPatternSyntax_2(b, l + 1);
    exit_section_(b, l, m, RELATIONSHIP_PATTERN_SYNTAX, r, false, null);
    return r;
  }

  // "()-[" Identifier RelType "]-()"
  private static boolean RelationshipPatternSyntax_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipPatternSyntax_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STARTRELPATTERN);
    r = r && Identifier(b, l + 1);
    r = r && RelType(b, l + 1);
    r = r && consumeToken(b, ENDRELPATTERN);
    exit_section_(b, m, null, r);
    return r;
  }

  // "()-[" Identifier RelType "]->()"
  private static boolean RelationshipPatternSyntax_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipPatternSyntax_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STARTRELPATTERN);
    r = r && Identifier(b, l + 1);
    r = r && RelType(b, l + 1);
    r = r && consumeToken(b, ENDRELPATTERNDIRECTED);
    exit_section_(b, m, null, r);
    return r;
  }

  // "()<-[" Identifier RelType "]-()"
  private static boolean RelationshipPatternSyntax_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipPatternSyntax_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STARTRELPATTERNDIRECTED);
    r = r && Identifier(b, l + 1);
    r = r && RelType(b, l + 1);
    r = r && consumeToken(b, ENDRELPATTERN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // K_CONSTRAINT_ON RelationshipPatternSyntax K_ASSERT_EXISTS "(" PropertyExpression ")"
  public static boolean RelationshipPropertyExistenceConstraintSyntax(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipPropertyExistenceConstraintSyntax")) return false;
    if (!nextTokenIs(b, K_CONSTRAINT_ON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_CONSTRAINT_ON);
    r = r && RelationshipPatternSyntax(b, l + 1);
    r = r && consumeToken(b, K_ASSERT_EXISTS);
    r = r && consumeToken(b, LEFTBRACE);
    r = r && PropertyExpression(b, l + 1);
    r = r && consumeToken(b, RIGHTBRACE);
    exit_section_(b, m, RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT_SYNTAX, r);
    return r;
  }

  /* ********************************************************** */
  // ":" RelTypeName ("|" ":"? RelTypeName)?
  public static boolean RelationshipTypes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipTypes")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && RelTypeName(b, l + 1);
    r = r && RelationshipTypes_2(b, l + 1);
    exit_section_(b, m, RELATIONSHIP_TYPES, r);
    return r;
  }

  // ("|" ":"? RelTypeName)?
  private static boolean RelationshipTypes_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipTypes_2")) return false;
    RelationshipTypes_2_0(b, l + 1);
    return true;
  }

  // "|" ":"? RelTypeName
  private static boolean RelationshipTypes_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipTypes_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PIPE);
    r = r && RelationshipTypes_2_0_1(b, l + 1);
    r = r && RelTypeName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ":"?
  private static boolean RelationshipTypes_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipTypes_2_0_1")) return false;
    consumeToken(b, COLON);
    return true;
  }

  /* ********************************************************** */
  // K_REMOVE RemoveItem ("," RemoveItem)*
  public static boolean Remove(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Remove")) return false;
    if (!nextTokenIs(b, K_REMOVE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_REMOVE);
    r = r && RemoveItem(b, l + 1);
    r = r && Remove_2(b, l + 1);
    exit_section_(b, m, REMOVE, r);
    return r;
  }

  // ("," RemoveItem)*
  private static boolean Remove_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Remove_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Remove_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Remove_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // "," RemoveItem
  private static boolean Remove_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Remove_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && RemoveItem(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (Identifier NodeLabels) | PropertyExpression
  public static boolean RemoveItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RemoveItem")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<remove item>");
    r = RemoveItem_0(b, l + 1);
    if (!r) r = PropertyExpression(b, l + 1);
    exit_section_(b, l, m, REMOVE_ITEM, r, false, null);
    return r;
  }

  // Identifier NodeLabels
  private static boolean RemoveItem_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RemoveItem_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && NodeLabels(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (K_RETURN_DISTINCT ReturnBody)
  //          | (K_RETURN  ReturnBody)
  public static boolean Return(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Return")) return false;
    if (!nextTokenIs(b, "<return>", K_RETURN, K_RETURN_DISTINCT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<return>");
    r = Return_0(b, l + 1);
    if (!r) r = Return_1(b, l + 1);
    exit_section_(b, l, m, RETURN, r, false, null);
    return r;
  }

  // K_RETURN_DISTINCT ReturnBody
  private static boolean Return_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Return_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_RETURN_DISTINCT);
    r = r && ReturnBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // K_RETURN  ReturnBody
  private static boolean Return_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Return_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_RETURN);
    r = r && ReturnBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ReturnItems Order? Skip? Limit?
  public static boolean ReturnBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnBody")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<return body>");
    r = ReturnItems(b, l + 1);
    r = r && ReturnBody_1(b, l + 1);
    r = r && ReturnBody_2(b, l + 1);
    r = r && ReturnBody_3(b, l + 1);
    exit_section_(b, l, m, RETURN_BODY, r, false, null);
    return r;
  }

  // Order?
  private static boolean ReturnBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnBody_1")) return false;
    Order(b, l + 1);
    return true;
  }

  // Skip?
  private static boolean ReturnBody_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnBody_2")) return false;
    Skip(b, l + 1);
    return true;
  }

  // Limit?
  private static boolean ReturnBody_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnBody_3")) return false;
    Limit(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (Expression K_AS Identifier) | (Expression)
  public static boolean ReturnItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnItem")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<return item>");
    r = ReturnItem_0(b, l + 1);
    if (!r) r = ReturnItem_1(b, l + 1);
    exit_section_(b, l, m, RETURN_ITEM, r, false, null);
    return r;
  }

  // Expression K_AS Identifier
  private static boolean ReturnItem_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnItem_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    r = r && consumeToken(b, K_AS);
    r = r && Identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Expression)
  private static boolean ReturnItem_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnItem_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ("*" ReturnItem? ("," ReturnItem)*)
  //               | (ReturnItem ("," ReturnItem)*)
  public static boolean ReturnItems(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnItems")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<return items>");
    r = ReturnItems_0(b, l + 1);
    if (!r) r = ReturnItems_1(b, l + 1);
    exit_section_(b, l, m, RETURN_ITEMS, r, false, null);
    return r;
  }

  // "*" ReturnItem? ("," ReturnItem)*
  private static boolean ReturnItems_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnItems_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MUL);
    r = r && ReturnItems_0_1(b, l + 1);
    r = r && ReturnItems_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ReturnItem?
  private static boolean ReturnItems_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnItems_0_1")) return false;
    ReturnItem(b, l + 1);
    return true;
  }

  // ("," ReturnItem)*
  private static boolean ReturnItems_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnItems_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ReturnItems_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ReturnItems_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // "," ReturnItem
  private static boolean ReturnItems_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnItems_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && ReturnItem(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ReturnItem ("," ReturnItem)*
  private static boolean ReturnItems_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnItems_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ReturnItem(b, l + 1);
    r = r && ReturnItems_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("," ReturnItem)*
  private static boolean ReturnItems_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnItems_1_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ReturnItems_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ReturnItems_1_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // "," ReturnItem
  private static boolean ReturnItems_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnItems_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && ReturnItem(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ">"
  static boolean RightArrowHead(PsiBuilder b, int l) {
    return consumeToken(b, GREATHERTHEN);
  }

  /* ********************************************************** */
  // K_SET SetItem ("," SetItem)*
  public static boolean SetClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SetClause")) return false;
    if (!nextTokenIs(b, K_SET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_SET);
    r = r && SetItem(b, l + 1);
    r = r && SetClause_2(b, l + 1);
    exit_section_(b, m, SET_CLAUSE, r);
    return r;
  }

  // ("," SetItem)*
  private static boolean SetClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SetClause_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!SetClause_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SetClause_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // "," SetItem
  private static boolean SetClause_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SetClause_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && SetItem(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (PropertyExpression "=" Expression)
  //           | (Identifier "=" Expression)
  //           | (Identifier "+=" Expression)
  //           | (Identifier NodeLabels)
  public static boolean SetItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SetItem")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<set item>");
    r = SetItem_0(b, l + 1);
    if (!r) r = SetItem_1(b, l + 1);
    if (!r) r = SetItem_2(b, l + 1);
    if (!r) r = SetItem_3(b, l + 1);
    exit_section_(b, l, m, SET_ITEM, r, false, null);
    return r;
  }

  // PropertyExpression "=" Expression
  private static boolean SetItem_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SetItem_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PropertyExpression(b, l + 1);
    r = r && consumeToken(b, EQUAL);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Identifier "=" Expression
  private static boolean SetItem_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SetItem_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && consumeToken(b, EQUAL);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Identifier "+=" Expression
  private static boolean SetItem_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SetItem_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && consumeToken(b, PLUSEQUALS);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Identifier NodeLabels
  private static boolean SetItem_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SetItem_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && NodeLabels(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (K_SHORTESTPATH "(" PatternElement ")")
  //                       | (K_ALLSHORTESTPATHS "(" PatternElement ")")
  public static boolean ShortestPathPattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShortestPathPattern")) return false;
    if (!nextTokenIs(b, "<shortest path pattern>", K_ALLSHORTESTPATHS, K_SHORTESTPATH)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<shortest path pattern>");
    r = ShortestPathPattern_0(b, l + 1);
    if (!r) r = ShortestPathPattern_1(b, l + 1);
    exit_section_(b, l, m, SHORTEST_PATH_PATTERN, r, false, null);
    return r;
  }

  // K_SHORTESTPATH "(" PatternElement ")"
  private static boolean ShortestPathPattern_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShortestPathPattern_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_SHORTESTPATH);
    r = r && consumeToken(b, LEFTBRACE);
    r = r && PatternElement(b, l + 1);
    r = r && consumeToken(b, RIGHTBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // K_ALLSHORTESTPATHS "(" PatternElement ")"
  private static boolean ShortestPathPattern_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShortestPathPattern_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_ALLSHORTESTPATHS);
    r = r && consumeToken(b, LEFTBRACE);
    r = r && PatternElement(b, l + 1);
    r = r && consumeToken(b, RIGHTBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // l_integer
  static boolean SignedDecimalInteger(PsiBuilder b, int l) {
    return consumeToken(b, L_INTEGER);
  }

  /* ********************************************************** */
  // SignedDecimalInteger
  public static boolean SignedIntegerLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SignedIntegerLiteral")) return false;
    if (!nextTokenIs(b, L_INTEGER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SignedDecimalInteger(b, l + 1);
    exit_section_(b, m, SIGNED_INTEGER_LITERAL, r);
    return r;
  }

  /* ********************************************************** */
  // Clause+
  public static boolean SingleQuery(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SingleQuery")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<single query>");
    r = Clause(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!Clause(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SingleQuery", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, SINGLE_QUERY, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // K_SKIP  Expression
  public static boolean Skip(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Skip")) return false;
    if (!nextTokenIs(b, K_SKIP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_SKIP);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, SKIP, r);
    return r;
  }

  /* ********************************************************** */
  // (Expression (K_DESCENDING | K_DESC))
  //            | (Expression (K_ASCENDING | K_ASC)?)
  public static boolean SortItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SortItem")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<sort item>");
    r = SortItem_0(b, l + 1);
    if (!r) r = SortItem_1(b, l + 1);
    exit_section_(b, l, m, SORT_ITEM, r, false, null);
    return r;
  }

  // Expression (K_DESCENDING | K_DESC)
  private static boolean SortItem_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SortItem_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    r = r && SortItem_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // K_DESCENDING | K_DESC
  private static boolean SortItem_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SortItem_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_DESCENDING);
    if (!r) r = consumeToken(b, K_DESC);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression (K_ASCENDING | K_ASC)?
  private static boolean SortItem_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SortItem_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    r = r && SortItem_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (K_ASCENDING | K_ASC)?
  private static boolean SortItem_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SortItem_1_1")) return false;
    SortItem_1_1_0(b, l + 1);
    return true;
  }

  // K_ASCENDING | K_ASC
  private static boolean SortItem_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SortItem_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_ASCENDING);
    if (!r) r = consumeToken(b, K_ASC);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // l_space
  static boolean Space(PsiBuilder b, int l) {
    return consumeToken(b, L_SPACE);
  }

  /* ********************************************************** */
  // K_START (StartPoint ("," StartPoint)*)? Where?
  public static boolean Start(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Start")) return false;
    if (!nextTokenIs(b, K_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_START);
    r = r && Start_1(b, l + 1);
    r = r && Start_2(b, l + 1);
    exit_section_(b, m, START, r);
    return r;
  }

  // (StartPoint ("," StartPoint)*)?
  private static boolean Start_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Start_1")) return false;
    Start_1_0(b, l + 1);
    return true;
  }

  // StartPoint ("," StartPoint)*
  private static boolean Start_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Start_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StartPoint(b, l + 1);
    r = r && Start_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("," StartPoint)*
  private static boolean Start_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Start_1_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Start_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Start_1_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // "," StartPoint
  private static boolean Start_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Start_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && StartPoint(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Where?
  private static boolean Start_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Start_2")) return false;
    Where(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Identifier "=" Lookup
  public static boolean StartPoint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StartPoint")) return false;
    if (!nextTokenIs(b, "<start point>", L_IDENTIFIER, L_IDENTIFIER_TEXT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<start point>");
    r = Identifier(b, l + 1);
    r = r && consumeToken(b, EQUAL);
    r = r && Lookup(b, l + 1);
    exit_section_(b, l, m, START_POINT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Command | Query
  public static boolean Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<statement>");
    r = Command(b, l + 1);
    if (!r) r = Query(b, l + 1);
    exit_section_(b, l, m, STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // !<<eof>> Statement ';'
  static boolean Statements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statements")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = Statements_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, Statement(b, l + 1));
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, null, r, p, statement_recover_parser_);
    return r || p;
  }

  // !<<eof>>
  private static boolean Statements_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statements_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !eof(b, l + 1);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // l_string
  public static boolean StringLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringLiteral")) return false;
    if (!nextTokenIs(b, L_STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, L_STRING);
    exit_section_(b, m, STRING_LITERAL, r);
    return r;
  }

  /* ********************************************************** */
  // UnescapedSymbolicNameString | EscapedSymbolicNameString
  static boolean SymbolicNameString(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SymbolicNameString")) return false;
    if (!nextTokenIs(b, "", L_IDENTIFIER, L_IDENTIFIER_TEXT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UnescapedSymbolicNameString(b, l + 1);
    if (!r) r = EscapedSymbolicNameString(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // l_identifier
  static boolean UnescapedSymbolicNameString(PsiBuilder b, int l) {
    return consumeToken(b, L_IDENTIFIER);
  }

  /* ********************************************************** */
  // (K_UNION_ALL | K_UNION) SingleQuery
  public static boolean Union(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Union")) return false;
    if (!nextTokenIs(b, "<union>", K_UNION, K_UNION_ALL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<union>");
    r = Union_0(b, l + 1);
    r = r && SingleQuery(b, l + 1);
    exit_section_(b, l, m, UNION, r, false, null);
    return r;
  }

  // K_UNION_ALL | K_UNION
  private static boolean Union_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Union_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_UNION_ALL);
    if (!r) r = consumeToken(b, K_UNION);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // K_CONSTRAINT_ON "(" Identifier NodeLabel  ")" K_ASSERT PropertyExpression K_IS_UNIQUE
  public static boolean UniqueConstraintSyntax(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UniqueConstraintSyntax")) return false;
    if (!nextTokenIs(b, K_CONSTRAINT_ON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_CONSTRAINT_ON);
    r = r && consumeToken(b, LEFTBRACE);
    r = r && Identifier(b, l + 1);
    r = r && NodeLabel(b, l + 1);
    r = r && consumeToken(b, RIGHTBRACE);
    r = r && consumeToken(b, K_ASSERT);
    r = r && PropertyExpression(b, l + 1);
    r = r && consumeToken(b, K_IS_UNIQUE);
    exit_section_(b, m, UNIQUE_CONSTRAINT_SYNTAX, r);
    return r;
  }

  /* ********************************************************** */
  // l_integer
  static boolean UnsignedDecimalInteger(PsiBuilder b, int l) {
    return consumeToken(b, L_INTEGER);
  }

  /* ********************************************************** */
  // UnsignedDecimalInteger
  public static boolean UnsignedIntegerLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnsignedIntegerLiteral")) return false;
    if (!nextTokenIs(b, L_INTEGER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UnsignedDecimalInteger(b, l + 1);
    exit_section_(b, m, UNSIGNED_INTEGER_LITERAL, r);
    return r;
  }

  /* ********************************************************** */
  // K_UNWIND Expression K_AS Identifier
  public static boolean Unwind(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Unwind")) return false;
    if (!nextTokenIs(b, K_UNWIND)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_UNWIND);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, K_AS);
    r = r && Identifier(b, l + 1);
    exit_section_(b, m, UNWIND, r);
    return r;
  }

  /* ********************************************************** */
  // K_WHERE Expression
  public static boolean Where(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Where")) return false;
    if (!nextTokenIs(b, K_WHERE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_WHERE);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, WHERE, r);
    return r;
  }

  /* ********************************************************** */
  // (K_WITH_DISTINCT ReturnBody Where?)
  //        | (K_WITH ReturnBody Where?)
  public static boolean With(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "With")) return false;
    if (!nextTokenIs(b, "<with>", K_WITH, K_WITH_DISTINCT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<with>");
    r = With_0(b, l + 1);
    if (!r) r = With_1(b, l + 1);
    exit_section_(b, l, m, WITH, r, false, null);
    return r;
  }

  // K_WITH_DISTINCT ReturnBody Where?
  private static boolean With_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "With_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_WITH_DISTINCT);
    r = r && ReturnBody(b, l + 1);
    r = r && With_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Where?
  private static boolean With_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "With_0_2")) return false;
    Where(b, l + 1);
    return true;
  }

  // K_WITH ReturnBody Where?
  private static boolean With_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "With_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_WITH);
    r = r && ReturnBody(b, l + 1);
    r = r && With_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Where?
  private static boolean With_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "With_1_2")) return false;
    Where(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Statements *
  static boolean cypher(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cypher")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Statements(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "cypher", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // !(';')
  static boolean statement_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !statement_recover_0(b, l + 1);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  // (';')
  private static boolean statement_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_recover_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  final static Parser statement_recover_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return statement_recover(b, l + 1);
    }
  };
}
