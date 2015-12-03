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
    else if (t == CASE_ALTERNATIVES) {
      r = CaseAlternatives(b, 0);
    }
    else if (t == CASE_EXPRESSION) {
      r = CaseExpression(b, 0);
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
    else if (t == DOUBLE_LITERAL) {
      r = DoubleLiteral(b, 0);
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
    else if (t == FILTER_EXPRESSION) {
      r = FilterExpression(b, 0);
    }
    else if (t == FOREACH) {
      r = Foreach(b, 0);
    }
    else if (t == FUNCTION_INVOCATION) {
      r = FunctionInvocation(b, 0);
    }
    else if (t == FUNCTION_NAME) {
      r = FunctionName(b, 0);
    }
    else if (t == HINT) {
      r = Hint(b, 0);
    }
    else if (t == ID_IN_COLL) {
      r = IdInColl(b, 0);
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
    else if (t == LIST_COMPREHENSION) {
      r = ListComprehension(b, 0);
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
    else if (t == NUMBER_LITERAL) {
      r = NumberLiteral(b, 0);
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
    else if (t == PROPERTY_LOOKUP) {
      r = PropertyLookup(b, 0);
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
    else if (t == RELATIONSHIPS_PATTERN) {
      r = RelationshipsPattern(b, 0);
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
    else if (t == PARENTHESIZED_EXPRESSION) {
      r = parenthesizedExpression(b, 0);
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
    if (!nextTokenIs(b, "<bulk import query>", K_USING_PERIODIC_COMMIT, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<bulk import query>");
    r = PeriodicCommitHint(b, l + 1);
    r = r && LoadCSVQuery(b, l + 1);
    exit_section_(b, l, m, BULK_IMPORT_QUERY, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ws K_WHEN Expression ws K_THEN Expression
  public static boolean CaseAlternatives(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseAlternatives")) return false;
    if (!nextTokenIs(b, "<case alternatives>", K_WHEN, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<case alternatives>");
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_WHEN);
    r = r && Expression(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, K_THEN);
    r = r && Expression(b, l + 1);
    exit_section_(b, l, m, CASE_ALTERNATIVES, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ((ws K_CASE CaseAlternatives+) | (ws K_CASE Expression CaseAlternatives+))
  //                    (ws K_ELSE Expression)?
  //                    ws K_END
  public static boolean CaseExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseExpression")) return false;
    if (!nextTokenIs(b, "<case expression>", K_CASE, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<case expression>");
    r = CaseExpression_0(b, l + 1);
    r = r && CaseExpression_1(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, K_END);
    exit_section_(b, l, m, CASE_EXPRESSION, r, false, null);
    return r;
  }

  // (ws K_CASE CaseAlternatives+) | (ws K_CASE Expression CaseAlternatives+)
  private static boolean CaseExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CaseExpression_0_0(b, l + 1);
    if (!r) r = CaseExpression_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws K_CASE CaseAlternatives+
  private static boolean CaseExpression_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseExpression_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_CASE);
    r = r && CaseExpression_0_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CaseAlternatives+
  private static boolean CaseExpression_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseExpression_0_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CaseAlternatives(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!CaseAlternatives(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CaseExpression_0_0_2", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ws K_CASE Expression CaseAlternatives+
  private static boolean CaseExpression_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseExpression_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_CASE);
    r = r && Expression(b, l + 1);
    r = r && CaseExpression_0_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CaseAlternatives+
  private static boolean CaseExpression_0_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseExpression_0_1_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CaseAlternatives(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!CaseAlternatives(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CaseExpression_0_1_3", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // (ws K_ELSE Expression)?
  private static boolean CaseExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseExpression_1")) return false;
    CaseExpression_1_0(b, l + 1);
    return true;
  }

  // ws K_ELSE Expression
  private static boolean CaseExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_ELSE);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
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
  // (ws K_CREATE_UNIQUE Pattern)
  //          | (ws K_CREATE Pattern)
  public static boolean Create(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Create")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<create>");
    r = Create_0(b, l + 1);
    if (!r) r = Create_1(b, l + 1);
    exit_section_(b, l, m, CREATE, r, false, null);
    return r;
  }

  // ws K_CREATE_UNIQUE Pattern
  private static boolean Create_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Create_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_CREATE_UNIQUE);
    r = r && Pattern(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws K_CREATE Pattern
  private static boolean Create_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Create_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_CREATE);
    r = r && Pattern(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ws K_CREATE_INDEX_ON NodeLabel ws "(" ws PropertyKeyName ws ")"
  public static boolean CreateIndex(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CreateIndex")) return false;
    if (!nextTokenIs(b, "<create index>", K_CREATE_INDEX_ON, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<create index>");
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_CREATE_INDEX_ON);
    r = r && NodeLabel(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, LEFTBRACE);
    r = r && ws(b, l + 1);
    r = r && PropertyKeyName(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, RIGHTBRACE);
    exit_section_(b, l, m, CREATE_INDEX, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ws K_CREATE NodePropertyExistenceConstraintSyntax
  public static boolean CreateNodePropertyExistenceConstraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CreateNodePropertyExistenceConstraint")) return false;
    if (!nextTokenIs(b, "<create node property existence constraint>", K_CREATE, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<create node property existence constraint>");
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_CREATE);
    r = r && NodePropertyExistenceConstraintSyntax(b, l + 1);
    exit_section_(b, l, m, CREATE_NODE_PROPERTY_EXISTENCE_CONSTRAINT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ws K_CREATE RelationshipPropertyExistenceConstraintSyntax
  public static boolean CreateRelationshipPropertyExistenceConstraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CreateRelationshipPropertyExistenceConstraint")) return false;
    if (!nextTokenIs(b, "<create relationship property existence constraint>", K_CREATE, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<create relationship property existence constraint>");
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_CREATE);
    r = r && RelationshipPropertyExistenceConstraintSyntax(b, l + 1);
    exit_section_(b, l, m, CREATE_RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ws K_CREATE UniqueConstraintSyntax
  public static boolean CreateUniqueConstraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CreateUniqueConstraint")) return false;
    if (!nextTokenIs(b, "<create unique constraint>", K_CREATE, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<create unique constraint>");
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_CREATE);
    r = r && UniqueConstraintSyntax(b, l + 1);
    exit_section_(b, l, m, CREATE_UNIQUE_CONSTRAINT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ws "-" ws
  static boolean Dash(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Dash")) return false;
    if (!nextTokenIs(b, "", MINUS, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, MINUS);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (ws K_DELETE Expression (ws "," ws Expression)*)
  //          | (ws K_DETACH_DELETE Expression (ws "," ws Expression)*)
  public static boolean Delete(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Delete")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<delete>");
    r = Delete_0(b, l + 1);
    if (!r) r = Delete_1(b, l + 1);
    exit_section_(b, l, m, DELETE, r, false, null);
    return r;
  }

  // ws K_DELETE Expression (ws "," ws Expression)*
  private static boolean Delete_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Delete_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_DELETE);
    r = r && Expression(b, l + 1);
    r = r && Delete_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ws "," ws Expression)*
  private static boolean Delete_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Delete_0_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Delete_0_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Delete_0_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ws "," ws Expression
  private static boolean Delete_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Delete_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && ws(b, l + 1);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws K_DETACH_DELETE Expression (ws "," ws Expression)*
  private static boolean Delete_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Delete_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_DETACH_DELETE);
    r = r && Expression(b, l + 1);
    r = r && Delete_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ws "," ws Expression)*
  private static boolean Delete_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Delete_1_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Delete_1_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Delete_1_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ws "," ws Expression
  private static boolean Delete_1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Delete_1_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && ws(b, l + 1);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // l_decimal
  public static boolean DoubleLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DoubleLiteral")) return false;
    if (!nextTokenIs(b, L_DECIMAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, L_DECIMAL);
    exit_section_(b, m, DOUBLE_LITERAL, r);
    return r;
  }

  /* ********************************************************** */
  // ws K_DROP_INDEX_ON NodeLabel ws "(" ws PropertyKeyName ws ")"
  public static boolean DropIndex(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DropIndex")) return false;
    if (!nextTokenIs(b, "<drop index>", K_DROP_INDEX_ON, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<drop index>");
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_DROP_INDEX_ON);
    r = r && NodeLabel(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, LEFTBRACE);
    r = r && ws(b, l + 1);
    r = r && PropertyKeyName(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, RIGHTBRACE);
    exit_section_(b, l, m, DROP_INDEX, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ws K_DROP NodePropertyExistenceConstraintSyntax
  public static boolean DropNodePropertyExistenceConstraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DropNodePropertyExistenceConstraint")) return false;
    if (!nextTokenIs(b, "<drop node property existence constraint>", K_DROP, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<drop node property existence constraint>");
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_DROP);
    r = r && NodePropertyExistenceConstraintSyntax(b, l + 1);
    exit_section_(b, l, m, DROP_NODE_PROPERTY_EXISTENCE_CONSTRAINT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ws K_DROP RelationshipPropertyExistenceConstraintSyntax
  public static boolean DropRelationshipPropertyExistenceConstraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DropRelationshipPropertyExistenceConstraint")) return false;
    if (!nextTokenIs(b, "<drop relationship property existence constraint>", K_DROP, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<drop relationship property existence constraint>");
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_DROP);
    r = r && RelationshipPropertyExistenceConstraintSyntax(b, l + 1);
    exit_section_(b, l, m, DROP_RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ws K_DROP UniqueConstraintSyntax
  public static boolean DropUniqueConstraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DropUniqueConstraint")) return false;
    if (!nextTokenIs(b, "<drop unique constraint>", K_DROP, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<drop unique constraint>");
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_DROP);
    r = r && UniqueConstraintSyntax(b, l + 1);
    exit_section_(b, l, m, DROP_UNIQUE_CONSTRAINT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ws l_identifier_text
  static boolean EscapedSymbolicNameString(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EscapedSymbolicNameString")) return false;
    if (!nextTokenIs(b, "", L_IDENTIFIER_TEXT, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, L_IDENTIFIER_TEXT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression12
  public static boolean Expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, "<expression>");
    r = Expression12(b, l + 1);
    exit_section_(b, l, m, EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // NumberLiteral
  //               | StringLiteral
  //               | Parameter
  //               | (ws K_TRUE)
  //               | (ws K_FALSE)
  //               | (ws K_NULL)
  //               | CaseExpression
  //               | (ws K_COUNT ws "(" ws "*" ws ")")
  //               | MapLiteral
  //               | ListComprehension
  //               | (ws "[" Expression? (ws "," Expression)* ws "]")
  //               | (ws K_FILTER ws "(" FilterExpression ws ")")
  //               | (ws K_EXTRACT ws "(" FilterExpression (ws "|" Expression)? ws ")")
  //               | (ws K_REDUCE ws "(" Identifier ws "=" Expression ws "," IdInColl ws "|" Expression ws ")")
  //               | (ws K_ALL ws "(" FilterExpression ws ")")
  //               | (ws K_ANY ws "(" FilterExpression ws ")")
  //               | (ws K_NONE ws "(" FilterExpression ws ")")
  //               | (ws K_SINGLE ws "(" FilterExpression ws ")")
  //               | ShortestPathPattern
  //               | RelationshipsPattern
  //               | parenthesizedExpression
  //               | FunctionInvocation
  //               | Identifier
  static boolean Expression1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NumberLiteral(b, l + 1);
    if (!r) r = StringLiteral(b, l + 1);
    if (!r) r = Parameter(b, l + 1);
    if (!r) r = Expression1_3(b, l + 1);
    if (!r) r = Expression1_4(b, l + 1);
    if (!r) r = Expression1_5(b, l + 1);
    if (!r) r = CaseExpression(b, l + 1);
    if (!r) r = Expression1_7(b, l + 1);
    if (!r) r = MapLiteral(b, l + 1);
    if (!r) r = ListComprehension(b, l + 1);
    if (!r) r = Expression1_10(b, l + 1);
    if (!r) r = Expression1_11(b, l + 1);
    if (!r) r = Expression1_12(b, l + 1);
    if (!r) r = Expression1_13(b, l + 1);
    if (!r) r = Expression1_14(b, l + 1);
    if (!r) r = Expression1_15(b, l + 1);
    if (!r) r = Expression1_16(b, l + 1);
    if (!r) r = Expression1_17(b, l + 1);
    if (!r) r = ShortestPathPattern(b, l + 1);
    if (!r) r = RelationshipsPattern(b, l + 1);
    if (!r) r = parenthesizedExpression(b, l + 1);
    if (!r) r = FunctionInvocation(b, l + 1);
    if (!r) r = Identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws K_TRUE
  private static boolean Expression1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression1_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_TRUE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws K_FALSE
  private static boolean Expression1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression1_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_FALSE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws K_NULL
  private static boolean Expression1_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression1_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_NULL);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws K_COUNT ws "(" ws "*" ws ")"
  private static boolean Expression1_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression1_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_COUNT);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, LEFTBRACE);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, MUL);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, RIGHTBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws "[" Expression? (ws "," Expression)* ws "]"
  private static boolean Expression1_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression1_10")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, LEFTSQUAREBRACE);
    r = r && Expression1_10_2(b, l + 1);
    r = r && Expression1_10_3(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, RIGHTSQUAREBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression?
  private static boolean Expression1_10_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression1_10_2")) return false;
    Expression(b, l + 1);
    return true;
  }

  // (ws "," Expression)*
  private static boolean Expression1_10_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression1_10_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Expression1_10_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Expression1_10_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ws "," Expression
  private static boolean Expression1_10_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression1_10_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws K_FILTER ws "(" FilterExpression ws ")"
  private static boolean Expression1_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression1_11")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_FILTER);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, LEFTBRACE);
    r = r && FilterExpression(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, RIGHTBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws K_EXTRACT ws "(" FilterExpression (ws "|" Expression)? ws ")"
  private static boolean Expression1_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression1_12")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_EXTRACT);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, LEFTBRACE);
    r = r && FilterExpression(b, l + 1);
    r = r && Expression1_12_5(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, RIGHTBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ws "|" Expression)?
  private static boolean Expression1_12_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression1_12_5")) return false;
    Expression1_12_5_0(b, l + 1);
    return true;
  }

  // ws "|" Expression
  private static boolean Expression1_12_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression1_12_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, PIPE);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws K_REDUCE ws "(" Identifier ws "=" Expression ws "," IdInColl ws "|" Expression ws ")"
  private static boolean Expression1_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression1_13")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_REDUCE);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, LEFTBRACE);
    r = r && Identifier(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, EQUAL);
    r = r && Expression(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && IdInColl(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, PIPE);
    r = r && Expression(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, RIGHTBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws K_ALL ws "(" FilterExpression ws ")"
  private static boolean Expression1_14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression1_14")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_ALL);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, LEFTBRACE);
    r = r && FilterExpression(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, RIGHTBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws K_ANY ws "(" FilterExpression ws ")"
  private static boolean Expression1_15(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression1_15")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_ANY);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, LEFTBRACE);
    r = r && FilterExpression(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, RIGHTBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws K_NONE ws "(" FilterExpression ws ")"
  private static boolean Expression1_16(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression1_16")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_NONE);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, LEFTBRACE);
    r = r && FilterExpression(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, RIGHTBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws K_SINGLE ws "(" FilterExpression ws ")"
  private static boolean Expression1_17(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression1_17")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_SINGLE);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, LEFTBRACE);
    r = r && FilterExpression(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, RIGHTBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression9 (ws K_AND Expression9)*
  static boolean Expression10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression10")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression9(b, l + 1);
    r = r && Expression10_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ws K_AND Expression9)*
  private static boolean Expression10_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression10_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Expression10_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Expression10_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ws K_AND Expression9
  private static boolean Expression10_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression10_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_AND);
    r = r && Expression9(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression10 (ws K_XOR Expression10)*
  static boolean Expression11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression11")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression10(b, l + 1);
    r = r && Expression11_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ws K_XOR Expression10)*
  private static boolean Expression11_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression11_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Expression11_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Expression11_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ws K_XOR Expression10
  private static boolean Expression11_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression11_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_XOR);
    r = r && Expression10(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression11 (ws K_OR Expression11)*
  static boolean Expression12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression12")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression11(b, l + 1);
    r = r && Expression12_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ws K_OR Expression11)*
  private static boolean Expression12_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression12_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Expression12_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Expression12_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ws K_OR Expression11
  private static boolean Expression12_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression12_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_OR);
    r = r && Expression11(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression1 (PropertyLookup | NodeLabels)*
  static boolean Expression2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression1(b, l + 1);
    r = r && Expression2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (PropertyLookup | NodeLabels)*
  private static boolean Expression2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression2_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Expression2_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Expression2_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // PropertyLookup | NodeLabels
  private static boolean Expression2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PropertyLookup(b, l + 1);
    if (!r) r = NodeLabels(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression2 (
  //     (ws "[" Expression ws "]")
  //   | (ws "[" Expression? ws ".." Expression? ws "]")
  //   | (ws "=~" Expression2)
  //   | (ws K_IN Expression2)
  //   | (ws K_STARTS_WITH  Expression2)
  //   | (ws K_ENDS_WITH  Expression2)
  //   | (ws K_CONTAINS  Expression2)
  //   | (ws K_IS_NULL  Expression2)
  //   | (ws K_IS_NOT_NULL  Expression2)
  // )*
  static boolean Expression3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression2(b, l + 1);
    r = r && Expression3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (
  //     (ws "[" Expression ws "]")
  //   | (ws "[" Expression? ws ".." Expression? ws "]")
  //   | (ws "=~" Expression2)
  //   | (ws K_IN Expression2)
  //   | (ws K_STARTS_WITH  Expression2)
  //   | (ws K_ENDS_WITH  Expression2)
  //   | (ws K_CONTAINS  Expression2)
  //   | (ws K_IS_NULL  Expression2)
  //   | (ws K_IS_NOT_NULL  Expression2)
  // )*
  private static boolean Expression3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression3_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Expression3_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Expression3_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (ws "[" Expression ws "]")
  //   | (ws "[" Expression? ws ".." Expression? ws "]")
  //   | (ws "=~" Expression2)
  //   | (ws K_IN Expression2)
  //   | (ws K_STARTS_WITH  Expression2)
  //   | (ws K_ENDS_WITH  Expression2)
  //   | (ws K_CONTAINS  Expression2)
  //   | (ws K_IS_NULL  Expression2)
  //   | (ws K_IS_NOT_NULL  Expression2)
  private static boolean Expression3_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression3_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression3_1_0_0(b, l + 1);
    if (!r) r = Expression3_1_0_1(b, l + 1);
    if (!r) r = Expression3_1_0_2(b, l + 1);
    if (!r) r = Expression3_1_0_3(b, l + 1);
    if (!r) r = Expression3_1_0_4(b, l + 1);
    if (!r) r = Expression3_1_0_5(b, l + 1);
    if (!r) r = Expression3_1_0_6(b, l + 1);
    if (!r) r = Expression3_1_0_7(b, l + 1);
    if (!r) r = Expression3_1_0_8(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws "[" Expression ws "]"
  private static boolean Expression3_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression3_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, LEFTSQUAREBRACE);
    r = r && Expression(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, RIGHTSQUAREBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws "[" Expression? ws ".." Expression? ws "]"
  private static boolean Expression3_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression3_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, LEFTSQUAREBRACE);
    r = r && Expression3_1_0_1_2(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, RANGE);
    r = r && Expression3_1_0_1_5(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, RIGHTSQUAREBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression?
  private static boolean Expression3_1_0_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression3_1_0_1_2")) return false;
    Expression(b, l + 1);
    return true;
  }

  // Expression?
  private static boolean Expression3_1_0_1_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression3_1_0_1_5")) return false;
    Expression(b, l + 1);
    return true;
  }

  // ws "=~" Expression2
  private static boolean Expression3_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression3_1_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, REGEXMATCH);
    r = r && Expression2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws K_IN Expression2
  private static boolean Expression3_1_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression3_1_0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_IN);
    r = r && Expression2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws K_STARTS_WITH  Expression2
  private static boolean Expression3_1_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression3_1_0_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_STARTS_WITH);
    r = r && Expression2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws K_ENDS_WITH  Expression2
  private static boolean Expression3_1_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression3_1_0_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_ENDS_WITH);
    r = r && Expression2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws K_CONTAINS  Expression2
  private static boolean Expression3_1_0_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression3_1_0_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_CONTAINS);
    r = r && Expression2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws K_IS_NULL  Expression2
  private static boolean Expression3_1_0_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression3_1_0_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_IS_NULL);
    r = r && Expression2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws K_IS_NOT_NULL  Expression2
  private static boolean Expression3_1_0_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression3_1_0_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_IS_NOT_NULL);
    r = r && Expression2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression3 | (ws "-" Expression4) | (ws "+" Expression4)
  static boolean Expression4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression3(b, l + 1);
    if (!r) r = Expression4_1(b, l + 1);
    if (!r) r = Expression4_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws "-" Expression4
  private static boolean Expression4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression4_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, MINUS);
    r = r && Expression4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws "+" Expression4
  private static boolean Expression4_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression4_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, PLUS);
    r = r && Expression4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression4 (ws "^" Expression4)*
  static boolean Expression5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression4(b, l + 1);
    r = r && Expression5_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ws "^" Expression4)*
  private static boolean Expression5_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression5_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Expression5_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Expression5_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ws "^" Expression4
  private static boolean Expression5_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression5_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, POW);
    r = r && Expression4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression5 ((ws "*" Expression5) | (ws "/" Expression5) | (ws "%" Expression5))*
  static boolean Expression6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression5(b, l + 1);
    r = r && Expression6_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((ws "*" Expression5) | (ws "/" Expression5) | (ws "%" Expression5))*
  private static boolean Expression6_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression6_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Expression6_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Expression6_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (ws "*" Expression5) | (ws "/" Expression5) | (ws "%" Expression5)
  private static boolean Expression6_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression6_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression6_1_0_0(b, l + 1);
    if (!r) r = Expression6_1_0_1(b, l + 1);
    if (!r) r = Expression6_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws "*" Expression5
  private static boolean Expression6_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression6_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, MUL);
    r = r && Expression5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws "/" Expression5
  private static boolean Expression6_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression6_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, DIVIDE);
    r = r && Expression5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws "%" Expression5
  private static boolean Expression6_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression6_1_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, MODULO);
    r = r && Expression5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression6 ((ws "-" Expression6) | (ws "+" Expression6))*
  static boolean Expression7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression6(b, l + 1);
    r = r && Expression7_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((ws "-" Expression6) | (ws "+" Expression6))*
  private static boolean Expression7_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression7_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Expression7_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Expression7_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (ws "-" Expression6) | (ws "+" Expression6)
  private static boolean Expression7_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression7_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression7_1_0_0(b, l + 1);
    if (!r) r = Expression7_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws "-" Expression6
  private static boolean Expression7_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression7_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, MINUS);
    r = r && Expression6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws "+" Expression6
  private static boolean Expression7_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression7_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, PLUS);
    r = r && Expression6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression7 PartialComparisonExpression*
  static boolean Expression8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression7(b, l + 1);
    r = r && Expression8_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PartialComparisonExpression*
  private static boolean Expression8_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression8_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!PartialComparisonExpression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Expression8_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // (ws K_NOT Expression9) | Expression8
  static boolean Expression9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression9_0(b, l + 1);
    if (!r) r = Expression8(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws K_NOT Expression9
  private static boolean Expression9_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression9_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_NOT);
    r = r && Expression9(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ws IdInColl (ws K_WHERE)? Expression
  public static boolean FilterExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FilterExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<filter expression>");
    r = ws(b, l + 1);
    r = r && IdInColl(b, l + 1);
    r = r && FilterExpression_2(b, l + 1);
    r = r && Expression(b, l + 1);
    exit_section_(b, l, m, FILTER_EXPRESSION, r, false, null);
    return r;
  }

  // (ws K_WHERE)?
  private static boolean FilterExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FilterExpression_2")) return false;
    FilterExpression_2_0(b, l + 1);
    return true;
  }

  // ws K_WHERE
  private static boolean FilterExpression_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FilterExpression_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_WHERE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ws K_FOREACH ws "(" ws Identifier K_IN Expression ws "|" ws Clause+ ws ")"
  public static boolean Foreach(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Foreach")) return false;
    if (!nextTokenIs(b, "<foreach>", K_FOREACH, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<foreach>");
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_FOREACH);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, LEFTBRACE);
    r = r && ws(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && consumeToken(b, K_IN);
    r = r && Expression(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, PIPE);
    r = r && ws(b, l + 1);
    r = r && Foreach_11(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, RIGHTBRACE);
    exit_section_(b, l, m, FOREACH, r, false, null);
    return r;
  }

  // Clause+
  private static boolean Foreach_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Foreach_11")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Clause(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!Clause(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Foreach_11", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FunctionName ws "(" ws K_DISTINCT? Expression? (ws "," Expression)* ws ")"
  public static boolean FunctionInvocation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionInvocation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<function invocation>");
    r = FunctionName(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, LEFTBRACE);
    r = r && ws(b, l + 1);
    r = r && FunctionInvocation_4(b, l + 1);
    r = r && FunctionInvocation_5(b, l + 1);
    r = r && FunctionInvocation_6(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, RIGHTBRACE);
    exit_section_(b, l, m, FUNCTION_INVOCATION, r, false, null);
    return r;
  }

  // K_DISTINCT?
  private static boolean FunctionInvocation_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionInvocation_4")) return false;
    consumeToken(b, K_DISTINCT);
    return true;
  }

  // Expression?
  private static boolean FunctionInvocation_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionInvocation_5")) return false;
    Expression(b, l + 1);
    return true;
  }

  // (ws "," Expression)*
  private static boolean FunctionInvocation_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionInvocation_6")) return false;
    int c = current_position_(b);
    while (true) {
      if (!FunctionInvocation_6_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionInvocation_6", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ws "," Expression
  private static boolean FunctionInvocation_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionInvocation_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SymbolicNameString
  public static boolean FunctionName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<function name>");
    r = SymbolicNameString(b, l + 1);
    exit_section_(b, l, m, FUNCTION_NAME, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (ws K_USING_INDEX Identifier NodeLabel ws "(" ws PropertyKeyName ws ")" ws)
  //        | (ws K_USING_JOIN_ON Identifier (ws "," ws Identifier)*)
  //        | (ws K_USING_SCAN Identifier NodeLabel)
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

  // ws K_USING_INDEX Identifier NodeLabel ws "(" ws PropertyKeyName ws ")" ws
  private static boolean Hint_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Hint_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_USING_INDEX);
    r = r && Identifier(b, l + 1);
    r = r && NodeLabel(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, LEFTBRACE);
    r = r && ws(b, l + 1);
    r = r && PropertyKeyName(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, RIGHTBRACE);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws K_USING_JOIN_ON Identifier (ws "," ws Identifier)*
  private static boolean Hint_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Hint_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_USING_JOIN_ON);
    r = r && Identifier(b, l + 1);
    r = r && Hint_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ws "," ws Identifier)*
  private static boolean Hint_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Hint_1_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Hint_1_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Hint_1_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ws "," ws Identifier
  private static boolean Hint_1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Hint_1_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && ws(b, l + 1);
    r = r && Identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws K_USING_SCAN Identifier NodeLabel
  private static boolean Hint_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Hint_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_USING_SCAN);
    r = r && Identifier(b, l + 1);
    r = r && NodeLabel(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ws Identifier ws K_IN Expression
  public static boolean IdInColl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdInColl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<id in coll>");
    r = ws(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, K_IN);
    r = r && Expression(b, l + 1);
    exit_section_(b, l, m, ID_IN_COLL, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ws ":" ws SymbolicNameString ws "(" ws SymbolicNameString ws "=" ws (StringLiteral | Parameter) ws ")"
  public static boolean IdentifiedIndexLookup(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentifiedIndexLookup")) return false;
    if (!nextTokenIs(b, "<identified index lookup>", COLON, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<identified index lookup>");
    r = ws(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && ws(b, l + 1);
    r = r && SymbolicNameString(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, LEFTBRACE);
    r = r && ws(b, l + 1);
    r = r && SymbolicNameString(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, EQUAL);
    r = r && ws(b, l + 1);
    r = r && IdentifiedIndexLookup_11(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, RIGHTBRACE);
    exit_section_(b, l, m, IDENTIFIED_INDEX_LOOKUP, r, false, null);
    return r;
  }

  // StringLiteral | Parameter
  private static boolean IdentifiedIndexLookup_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentifiedIndexLookup_11")) return false;
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
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<identifier>");
    r = SymbolicNameString(b, l + 1);
    exit_section_(b, l, m, IDENTIFIER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ws ":" ws SymbolicNameString ws "(" ws (StringLiteral | Parameter) ws ")" ws
  public static boolean IndexQuery(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IndexQuery")) return false;
    if (!nextTokenIs(b, "<index query>", COLON, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<index query>");
    r = ws(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && ws(b, l + 1);
    r = r && SymbolicNameString(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, LEFTBRACE);
    r = r && ws(b, l + 1);
    r = r && IndexQuery_7(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, RIGHTBRACE);
    r = r && ws(b, l + 1);
    exit_section_(b, l, m, INDEX_QUERY, r, false, null);
    return r;
  }

  // StringLiteral | Parameter
  private static boolean IndexQuery_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IndexQuery_7")) return false;
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
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<label name>");
    r = SymbolicNameString(b, l + 1);
    exit_section_(b, l, m, LABEL_NAME, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ws "<" ws
  static boolean LeftArrowHead(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LeftArrowHead")) return false;
    if (!nextTokenIs(b, "", LESSTHEN, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, LESSTHEN);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ws K_LIMIT Expression
  public static boolean Limit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Limit")) return false;
    if (!nextTokenIs(b, "<limit>", K_LIMIT, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<limit>");
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_LIMIT);
    r = r && Expression(b, l + 1);
    exit_section_(b, l, m, LIMIT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ws "[" FilterExpression (ws "|"  Expression)? ws "]"
  public static boolean ListComprehension(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ListComprehension")) return false;
    if (!nextTokenIs(b, "<list comprehension>", LEFTSQUAREBRACE, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<list comprehension>");
    r = ws(b, l + 1);
    r = r && consumeToken(b, LEFTSQUAREBRACE);
    r = r && FilterExpression(b, l + 1);
    r = r && ListComprehension_3(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, RIGHTSQUAREBRACE);
    exit_section_(b, l, m, LIST_COMPREHENSION, r, false, null);
    return r;
  }

  // (ws "|"  Expression)?
  private static boolean ListComprehension_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ListComprehension_3")) return false;
    ListComprehension_3_0(b, l + 1);
    return true;
  }

  // ws "|"  Expression
  private static boolean ListComprehension_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ListComprehension_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, PIPE);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // UnsignedIntegerLiteral (ws ","ws  UnsignedIntegerLiteral)*
  public static boolean LiteralIds(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LiteralIds")) return false;
    if (!nextTokenIs(b, "<literal ids>", L_INTEGER, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<literal ids>");
    r = UnsignedIntegerLiteral(b, l + 1);
    r = r && LiteralIds_1(b, l + 1);
    exit_section_(b, l, m, LITERAL_IDS, r, false, null);
    return r;
  }

  // (ws ","ws  UnsignedIntegerLiteral)*
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

  // ws ","ws  UnsignedIntegerLiteral
  private static boolean LiteralIds_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LiteralIds_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && ws(b, l + 1);
    r = r && UnsignedIntegerLiteral(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ws K_LOAD_CSV K_WITH_HEADERS? K_FROM Expression K_AS Identifier (K_FIELDTERMINATOR StringLiteral)?
  public static boolean LoadCSV(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LoadCSV")) return false;
    if (!nextTokenIs(b, "<load csv>", K_LOAD_CSV, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<load csv>");
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_LOAD_CSV);
    r = r && LoadCSV_2(b, l + 1);
    r = r && consumeToken(b, K_FROM);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, K_AS);
    r = r && Identifier(b, l + 1);
    r = r && LoadCSV_7(b, l + 1);
    exit_section_(b, l, m, LOAD_CSV, r, false, null);
    return r;
  }

  // K_WITH_HEADERS?
  private static boolean LoadCSV_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LoadCSV_2")) return false;
    consumeToken(b, K_WITH_HEADERS);
    return true;
  }

  // (K_FIELDTERMINATOR StringLiteral)?
  private static boolean LoadCSV_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LoadCSV_7")) return false;
    LoadCSV_7_0(b, l + 1);
    return true;
  }

  // K_FIELDTERMINATOR StringLiteral
  private static boolean LoadCSV_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LoadCSV_7_0")) return false;
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
    if (!nextTokenIs(b, "<load csv query>", K_LOAD_CSV, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<load csv query>");
    r = LoadCSV(b, l + 1);
    r = r && LoadCSVQuery_1(b, l + 1);
    exit_section_(b, l, m, LOAD_CSV_QUERY, r, false, null);
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
  // ws "{" ws (PropertyKeyName ws ":" ws Expression)? (ws "," ws PropertyKeyName ws ":" ws Expression)* ws "}" ws
  public static boolean MapLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapLiteral")) return false;
    if (!nextTokenIs(b, "<map literal>", LEFTCURLYBRACE, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<map literal>");
    r = ws(b, l + 1);
    r = r && consumeToken(b, LEFTCURLYBRACE);
    r = r && ws(b, l + 1);
    r = r && MapLiteral_3(b, l + 1);
    r = r && MapLiteral_4(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, RIGHTCURLYBRACE);
    r = r && ws(b, l + 1);
    exit_section_(b, l, m, MAP_LITERAL, r, false, null);
    return r;
  }

  // (PropertyKeyName ws ":" ws Expression)?
  private static boolean MapLiteral_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapLiteral_3")) return false;
    MapLiteral_3_0(b, l + 1);
    return true;
  }

  // PropertyKeyName ws ":" ws Expression
  private static boolean MapLiteral_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapLiteral_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PropertyKeyName(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && ws(b, l + 1);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ws "," ws PropertyKeyName ws ":" ws Expression)*
  private static boolean MapLiteral_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapLiteral_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!MapLiteral_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MapLiteral_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ws "," ws PropertyKeyName ws ":" ws Expression
  private static boolean MapLiteral_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapLiteral_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && ws(b, l + 1);
    r = r && PropertyKeyName(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && ws(b, l + 1);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ws (K_OPTIONAL_MATCH | K_MATCH) Pattern Hint* Where?
  public static boolean Match(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Match")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<match>");
    r = ws(b, l + 1);
    r = r && Match_1(b, l + 1);
    r = r && Pattern(b, l + 1);
    r = r && Match_3(b, l + 1);
    r = r && Match_4(b, l + 1);
    exit_section_(b, l, m, MATCH, r, false, null);
    return r;
  }

  // K_OPTIONAL_MATCH | K_MATCH
  private static boolean Match_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Match_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_OPTIONAL_MATCH);
    if (!r) r = consumeToken(b, K_MATCH);
    exit_section_(b, m, null, r);
    return r;
  }

  // Hint*
  private static boolean Match_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Match_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Hint(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Match_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // Where?
  private static boolean Match_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Match_4")) return false;
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
  // (ws "*" ws RangeLiteral?)?
  public static boolean MaybeVariableLength(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaybeVariableLength")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<maybe variable length>");
    MaybeVariableLength_0(b, l + 1);
    exit_section_(b, l, m, MAYBE_VARIABLE_LENGTH, true, false, null);
    return true;
  }

  // ws "*" ws RangeLiteral?
  private static boolean MaybeVariableLength_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaybeVariableLength_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, MUL);
    r = r && ws(b, l + 1);
    r = r && MaybeVariableLength_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // RangeLiteral?
  private static boolean MaybeVariableLength_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaybeVariableLength_0_3")) return false;
    RangeLiteral(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ws K_MERGE PatternPart MergeAction*
  public static boolean Merge(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Merge")) return false;
    if (!nextTokenIs(b, "<merge>", K_MERGE, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<merge>");
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_MERGE);
    r = r && PatternPart(b, l + 1);
    r = r && Merge_3(b, l + 1);
    exit_section_(b, l, m, MERGE, r, false, null);
    return r;
  }

  // MergeAction*
  private static boolean Merge_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Merge_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!MergeAction(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Merge_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // (ws K_ON_MATCH SetClause)
  //               | (ws K_ON_CREATE SetClause)
  public static boolean MergeAction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MergeAction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<merge action>");
    r = MergeAction_0(b, l + 1);
    if (!r) r = MergeAction_1(b, l + 1);
    exit_section_(b, l, m, MERGE_ACTION, r, false, null);
    return r;
  }

  // ws K_ON_MATCH SetClause
  private static boolean MergeAction_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MergeAction_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_ON_MATCH);
    r = r && SetClause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws K_ON_CREATE SetClause
  private static boolean MergeAction_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MergeAction_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_ON_CREATE);
    r = r && SetClause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ws "(" ws (LiteralIds | Parameter | ws "*") ws ")"
  public static boolean NodeIdLookup(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NodeIdLookup")) return false;
    if (!nextTokenIs(b, "<node id lookup>", LEFTBRACE, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<node id lookup>");
    r = ws(b, l + 1);
    r = r && consumeToken(b, LEFTBRACE);
    r = r && ws(b, l + 1);
    r = r && NodeIdLookup_3(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, RIGHTBRACE);
    exit_section_(b, l, m, NODE_ID_LOOKUP, r, false, null);
    return r;
  }

  // LiteralIds | Parameter | ws "*"
  private static boolean NodeIdLookup_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NodeIdLookup_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LiteralIds(b, l + 1);
    if (!r) r = Parameter(b, l + 1);
    if (!r) r = NodeIdLookup_3_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws "*"
  private static boolean NodeIdLookup_3_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NodeIdLookup_3_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, MUL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IdentifiedIndexLookup
  public static boolean NodeIndexLookup(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NodeIndexLookup")) return false;
    if (!nextTokenIs(b, "<node index lookup>", COLON, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<node index lookup>");
    r = IdentifiedIndexLookup(b, l + 1);
    exit_section_(b, l, m, NODE_INDEX_LOOKUP, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IndexQuery
  public static boolean NodeIndexQuery(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NodeIndexQuery")) return false;
    if (!nextTokenIs(b, "<node index query>", COLON, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<node index query>");
    r = IndexQuery(b, l + 1);
    exit_section_(b, l, m, NODE_INDEX_QUERY, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ws ":" ws LabelName
  public static boolean NodeLabel(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NodeLabel")) return false;
    if (!nextTokenIs(b, "<node label>", COLON, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<node label>");
    r = ws(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && ws(b, l + 1);
    r = r && LabelName(b, l + 1);
    exit_section_(b, l, m, NODE_LABEL, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // NodeLabel+
  public static boolean NodeLabels(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NodeLabels")) return false;
    if (!nextTokenIs(b, "<node labels>", COLON, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<node labels>");
    r = NodeLabel(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!NodeLabel(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "NodeLabels", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, NODE_LABELS, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ws K_NODE (NodeIndexLookup | NodeIndexQuery | NodeIdLookup)
  public static boolean NodeLookup(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NodeLookup")) return false;
    if (!nextTokenIs(b, "<node lookup>", K_NODE, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<node lookup>");
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_NODE);
    r = r && NodeLookup_2(b, l + 1);
    exit_section_(b, l, m, NODE_LOOKUP, r, false, null);
    return r;
  }

  // NodeIndexLookup | NodeIndexQuery | NodeIdLookup
  private static boolean NodeLookup_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NodeLookup_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NodeIndexLookup(b, l + 1);
    if (!r) r = NodeIndexQuery(b, l + 1);
    if (!r) r = NodeIdLookup(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (ws "(" MaybeIdentifier MaybeNodeLabels MaybeProperties ")")
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

  // ws "(" MaybeIdentifier MaybeNodeLabels MaybeProperties ")"
  private static boolean NodePattern_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NodePattern_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, LEFTBRACE);
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
  // ws K_CONSTRAINT_ON ws "(" ws Identifier NodeLabel ws ")" ws K_ASSERT_EXISTS ws "(" ws PropertyExpression ws ")"
  public static boolean NodePropertyExistenceConstraintSyntax(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NodePropertyExistenceConstraintSyntax")) return false;
    if (!nextTokenIs(b, "<node property existence constraint syntax>", K_CONSTRAINT_ON, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<node property existence constraint syntax>");
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_CONSTRAINT_ON);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, LEFTBRACE);
    r = r && ws(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && NodeLabel(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, RIGHTBRACE);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, K_ASSERT_EXISTS);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, LEFTBRACE);
    r = r && ws(b, l + 1);
    r = r && PropertyExpression(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, RIGHTBRACE);
    exit_section_(b, l, m, NODE_PROPERTY_EXISTENCE_CONSTRAINT_SYNTAX, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DoubleLiteral | SignedIntegerLiteral
  public static boolean NumberLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NumberLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<number literal>");
    r = DoubleLiteral(b, l + 1);
    if (!r) r = SignedIntegerLiteral(b, l + 1);
    exit_section_(b, l, m, NUMBER_LITERAL, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ws K_ORDER_BY SortItem (ws "," ws SortItem)*
  public static boolean Order(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Order")) return false;
    if (!nextTokenIs(b, "<order>", K_ORDER_BY, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<order>");
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_ORDER_BY);
    r = r && SortItem(b, l + 1);
    r = r && Order_3(b, l + 1);
    exit_section_(b, l, m, ORDER, r, false, null);
    return r;
  }

  // (ws "," ws SortItem)*
  private static boolean Order_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Order_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Order_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Order_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ws "," ws SortItem
  private static boolean Order_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Order_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && ws(b, l + 1);
    r = r && SortItem(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ws "{" ws (SymbolicNameString | UnsignedDecimalInteger) ws "}" ws
  public static boolean Parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter")) return false;
    if (!nextTokenIs(b, "<parameter>", LEFTCURLYBRACE, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<parameter>");
    r = ws(b, l + 1);
    r = r && consumeToken(b, LEFTCURLYBRACE);
    r = r && ws(b, l + 1);
    r = r && Parameter_3(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, RIGHTCURLYBRACE);
    r = r && ws(b, l + 1);
    exit_section_(b, l, m, PARAMETER, r, false, null);
    return r;
  }

  // SymbolicNameString | UnsignedDecimalInteger
  private static boolean Parameter_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SymbolicNameString(b, l + 1);
    if (!r) r = UnsignedDecimalInteger(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (ws "=" Expression7)
  //                                       | (ws "<>" Expression7)
  //                                       | (ws "!=" Expression7)
  //                                       | (ws "<" Expression7)
  //                                       | (ws ">" Expression7)
  //                                       | (ws "<=" Expression7)
  //                                       | (ws ">=" Expression7)
  static boolean PartialComparisonExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PartialComparisonExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PartialComparisonExpression_0(b, l + 1);
    if (!r) r = PartialComparisonExpression_1(b, l + 1);
    if (!r) r = PartialComparisonExpression_2(b, l + 1);
    if (!r) r = PartialComparisonExpression_3(b, l + 1);
    if (!r) r = PartialComparisonExpression_4(b, l + 1);
    if (!r) r = PartialComparisonExpression_5(b, l + 1);
    if (!r) r = PartialComparisonExpression_6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws "=" Expression7
  private static boolean PartialComparisonExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PartialComparisonExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, EQUAL);
    r = r && Expression7(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws "<>" Expression7
  private static boolean PartialComparisonExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PartialComparisonExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, INVALIDNOTEQUALS);
    r = r && Expression7(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws "!=" Expression7
  private static boolean PartialComparisonExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PartialComparisonExpression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, NOTEQUALS);
    r = r && Expression7(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws "<" Expression7
  private static boolean PartialComparisonExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PartialComparisonExpression_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, LESSTHEN);
    r = r && Expression7(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws ">" Expression7
  private static boolean PartialComparisonExpression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PartialComparisonExpression_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, GREATHERTHEN);
    r = r && Expression7(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws "<=" Expression7
  private static boolean PartialComparisonExpression_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PartialComparisonExpression_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, LESSTHANEQUALS);
    r = r && Expression7(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws ">=" Expression7
  private static boolean PartialComparisonExpression_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PartialComparisonExpression_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, GREATERTHANEQUALS);
    r = r && Expression7(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PatternPart (ws "," ws PatternPart)*
  public static boolean Pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pattern")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<pattern>");
    r = PatternPart(b, l + 1);
    r = r && Pattern_1(b, l + 1);
    exit_section_(b, l, m, PATTERN, r, false, null);
    return r;
  }

  // (ws "," ws PatternPart)*
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

  // ws "," ws PatternPart
  private static boolean Pattern_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pattern_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && ws(b, l + 1);
    r = r && PatternPart(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (ws NodePattern PatternElementChain*)
  //                  | (ws "(" ws PatternElement ws ")" ws)
  public static boolean PatternElement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternElement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<pattern element>");
    r = PatternElement_0(b, l + 1);
    if (!r) r = PatternElement_1(b, l + 1);
    exit_section_(b, l, m, PATTERN_ELEMENT, r, false, null);
    return r;
  }

  // ws NodePattern PatternElementChain*
  private static boolean PatternElement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternElement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && NodePattern(b, l + 1);
    r = r && PatternElement_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PatternElementChain*
  private static boolean PatternElement_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternElement_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!PatternElementChain(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "PatternElement_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ws "(" ws PatternElement ws ")" ws
  private static boolean PatternElement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternElement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, LEFTBRACE);
    r = r && ws(b, l + 1);
    r = r && PatternElement(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, RIGHTBRACE);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // RelationshipPattern NodePattern
  public static boolean PatternElementChain(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternElementChain")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<pattern element chain>");
    r = RelationshipPattern(b, l + 1);
    r = r && NodePattern(b, l + 1);
    exit_section_(b, l, m, PATTERN_ELEMENT_CHAIN, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (Identifier ws "=" ws AnonymousPatternPart) | AnonymousPatternPart
  public static boolean PatternPart(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternPart")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<pattern part>");
    r = PatternPart_0(b, l + 1);
    if (!r) r = AnonymousPatternPart(b, l + 1);
    exit_section_(b, l, m, PATTERN_PART, r, false, null);
    return r;
  }

  // Identifier ws "=" ws AnonymousPatternPart
  private static boolean PatternPart_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternPart_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, EQUAL);
    r = r && ws(b, l + 1);
    r = r && AnonymousPatternPart(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ws K_USING_PERIODIC_COMMIT SignedIntegerLiteral?
  public static boolean PeriodicCommitHint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PeriodicCommitHint")) return false;
    if (!nextTokenIs(b, "<periodic commit hint>", K_USING_PERIODIC_COMMIT, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<periodic commit hint>");
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_USING_PERIODIC_COMMIT);
    r = r && PeriodicCommitHint_2(b, l + 1);
    exit_section_(b, l, m, PERIODIC_COMMIT_HINT, r, false, null);
    return r;
  }

  // SignedIntegerLiteral?
  private static boolean PeriodicCommitHint_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PeriodicCommitHint_2")) return false;
    SignedIntegerLiteral(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Expression1 (PropertyLookup)+
  public static boolean PropertyExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PropertyExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<property expression>");
    r = Expression1(b, l + 1);
    r = r && PropertyExpression_1(b, l + 1);
    exit_section_(b, l, m, PROPERTY_EXPRESSION, r, false, null);
    return r;
  }

  // (PropertyLookup)+
  private static boolean PropertyExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PropertyExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PropertyExpression_1_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!PropertyExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "PropertyExpression_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // (PropertyLookup)
  private static boolean PropertyExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PropertyExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PropertyLookup(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SymbolicNameString
  public static boolean PropertyKeyName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PropertyKeyName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<property key name>");
    r = SymbolicNameString(b, l + 1);
    exit_section_(b, l, m, PROPERTY_KEY_NAME, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ws "." PropertyKeyName
  public static boolean PropertyLookup(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PropertyLookup")) return false;
    if (!nextTokenIs(b, "<property lookup>", DOT, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<property lookup>");
    r = ws(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && PropertyKeyName(b, l + 1);
    exit_section_(b, l, m, PROPERTY_LOOKUP, r, false, null);
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
  // (UnsignedIntegerLiteral? ws ".." ws UnsignedIntegerLiteral?) | (UnsignedIntegerLiteral)
  public static boolean RangeLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RangeLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<range literal>");
    r = RangeLiteral_0(b, l + 1);
    if (!r) r = RangeLiteral_1(b, l + 1);
    exit_section_(b, l, m, RANGE_LITERAL, r, false, null);
    return r;
  }

  // UnsignedIntegerLiteral? ws ".." ws UnsignedIntegerLiteral?
  private static boolean RangeLiteral_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RangeLiteral_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RangeLiteral_0_0(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, RANGE);
    r = r && ws(b, l + 1);
    r = r && RangeLiteral_0_4(b, l + 1);
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
  private static boolean RangeLiteral_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RangeLiteral_0_4")) return false;
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
  // ws ":" ws RelTypeName
  public static boolean RelType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelType")) return false;
    if (!nextTokenIs(b, "<rel type>", COLON, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<rel type>");
    r = ws(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && ws(b, l + 1);
    r = r && RelTypeName(b, l + 1);
    exit_section_(b, l, m, REL_TYPE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SymbolicNameString
  public static boolean RelTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelTypeName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<rel type name>");
    r = SymbolicNameString(b, l + 1);
    exit_section_(b, l, m, REL_TYPE_NAME, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ws "[" ws MaybeIdentifier ws "?"? ws RelationshipTypes MaybeVariableLength MaybeProperties "]"
  public static boolean RelationshipDetail(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipDetail")) return false;
    if (!nextTokenIs(b, "<relationship detail>", LEFTSQUAREBRACE, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<relationship detail>");
    r = ws(b, l + 1);
    r = r && consumeToken(b, LEFTSQUAREBRACE);
    r = r && ws(b, l + 1);
    r = r && MaybeIdentifier(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && RelationshipDetail_5(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && RelationshipTypes(b, l + 1);
    r = r && MaybeVariableLength(b, l + 1);
    r = r && MaybeProperties(b, l + 1);
    r = r && consumeToken(b, RIGHTSQUAREBRACE);
    exit_section_(b, l, m, RELATIONSHIP_DETAIL, r, false, null);
    return r;
  }

  // "?"?
  private static boolean RelationshipDetail_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipDetail_5")) return false;
    consumeToken(b, QUESTIONSIGN);
    return true;
  }

  /* ********************************************************** */
  // ws "(" (LiteralIds | Parameter | ws "*") ws ")"
  public static boolean RelationshipIdLookup(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipIdLookup")) return false;
    if (!nextTokenIs(b, "<relationship id lookup>", LEFTBRACE, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<relationship id lookup>");
    r = ws(b, l + 1);
    r = r && consumeToken(b, LEFTBRACE);
    r = r && RelationshipIdLookup_2(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, RIGHTBRACE);
    exit_section_(b, l, m, RELATIONSHIP_ID_LOOKUP, r, false, null);
    return r;
  }

  // LiteralIds | Parameter | ws "*"
  private static boolean RelationshipIdLookup_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipIdLookup_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LiteralIds(b, l + 1);
    if (!r) r = Parameter(b, l + 1);
    if (!r) r = RelationshipIdLookup_2_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws "*"
  private static boolean RelationshipIdLookup_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipIdLookup_2_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, MUL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IdentifiedIndexLookup
  public static boolean RelationshipIndexLookup(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipIndexLookup")) return false;
    if (!nextTokenIs(b, "<relationship index lookup>", COLON, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<relationship index lookup>");
    r = IdentifiedIndexLookup(b, l + 1);
    exit_section_(b, l, m, RELATIONSHIP_INDEX_LOOKUP, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IndexQuery
  public static boolean RelationshipIndexQuery(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipIndexQuery")) return false;
    if (!nextTokenIs(b, "<relationship index query>", COLON, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<relationship index query>");
    r = IndexQuery(b, l + 1);
    exit_section_(b, l, m, RELATIONSHIP_INDEX_QUERY, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ws (K_RELATIONSHIP | K_REL) (RelationshipIndexLookup | RelationshipIndexQuery | RelationshipIdLookup)
  public static boolean RelationshipLookup(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipLookup")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<relationship lookup>");
    r = ws(b, l + 1);
    r = r && RelationshipLookup_1(b, l + 1);
    r = r && RelationshipLookup_2(b, l + 1);
    exit_section_(b, l, m, RELATIONSHIP_LOOKUP, r, false, null);
    return r;
  }

  // K_RELATIONSHIP | K_REL
  private static boolean RelationshipLookup_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipLookup_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_RELATIONSHIP);
    if (!r) r = consumeToken(b, K_REL);
    exit_section_(b, m, null, r);
    return r;
  }

  // RelationshipIndexLookup | RelationshipIndexQuery | RelationshipIdLookup
  private static boolean RelationshipLookup_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipLookup_2")) return false;
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
  // (ws "()-[" ws Identifier RelType ws "]-()") // todo: move this to literals
  //       | (ws "()-[" ws Identifier RelType ws "]->()")
  //       | (ws "()<-[" ws Identifier RelType ws "]-()")
  public static boolean RelationshipPatternSyntax(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipPatternSyntax")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<relationship pattern syntax>");
    r = RelationshipPatternSyntax_0(b, l + 1);
    if (!r) r = RelationshipPatternSyntax_1(b, l + 1);
    if (!r) r = RelationshipPatternSyntax_2(b, l + 1);
    exit_section_(b, l, m, RELATIONSHIP_PATTERN_SYNTAX, r, false, null);
    return r;
  }

  // ws "()-[" ws Identifier RelType ws "]-()"
  private static boolean RelationshipPatternSyntax_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipPatternSyntax_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, STARTRELPATTERN);
    r = r && ws(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && RelType(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, ENDRELPATTERN);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws "()-[" ws Identifier RelType ws "]->()"
  private static boolean RelationshipPatternSyntax_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipPatternSyntax_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, STARTRELPATTERN);
    r = r && ws(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && RelType(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, ENDRELPATTERNDIRECTED);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws "()<-[" ws Identifier RelType ws "]-()"
  private static boolean RelationshipPatternSyntax_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipPatternSyntax_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, STARTRELPATTERNDIRECTED);
    r = r && ws(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && RelType(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, ENDRELPATTERN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ws K_CONSTRAINT_ON RelationshipPatternSyntax K_ASSERT_EXISTS ws "(" ws PropertyExpression ws ")"
  public static boolean RelationshipPropertyExistenceConstraintSyntax(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipPropertyExistenceConstraintSyntax")) return false;
    if (!nextTokenIs(b, "<relationship property existence constraint syntax>", K_CONSTRAINT_ON, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<relationship property existence constraint syntax>");
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_CONSTRAINT_ON);
    r = r && RelationshipPatternSyntax(b, l + 1);
    r = r && consumeToken(b, K_ASSERT_EXISTS);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, LEFTBRACE);
    r = r && ws(b, l + 1);
    r = r && PropertyExpression(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, RIGHTBRACE);
    exit_section_(b, l, m, RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT_SYNTAX, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (ws ":" ws RelTypeName (ws "|" ws ":"? ws RelTypeName)*)?
  public static boolean RelationshipTypes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipTypes")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<relationship types>");
    RelationshipTypes_0(b, l + 1);
    exit_section_(b, l, m, RELATIONSHIP_TYPES, true, false, null);
    return true;
  }

  // ws ":" ws RelTypeName (ws "|" ws ":"? ws RelTypeName)*
  private static boolean RelationshipTypes_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipTypes_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && ws(b, l + 1);
    r = r && RelTypeName(b, l + 1);
    r = r && RelationshipTypes_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ws "|" ws ":"? ws RelTypeName)*
  private static boolean RelationshipTypes_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipTypes_0_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RelationshipTypes_0_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RelationshipTypes_0_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ws "|" ws ":"? ws RelTypeName
  private static boolean RelationshipTypes_0_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipTypes_0_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, PIPE);
    r = r && ws(b, l + 1);
    r = r && RelationshipTypes_0_4_0_3(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && RelTypeName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ":"?
  private static boolean RelationshipTypes_0_4_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipTypes_0_4_0_3")) return false;
    consumeToken(b, COLON);
    return true;
  }

  /* ********************************************************** */
  // NodePattern PatternElementChain+
  public static boolean RelationshipsPattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipsPattern")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<relationships pattern>");
    r = NodePattern(b, l + 1);
    r = r && RelationshipsPattern_1(b, l + 1);
    exit_section_(b, l, m, RELATIONSHIPS_PATTERN, r, false, null);
    return r;
  }

  // PatternElementChain+
  private static boolean RelationshipsPattern_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationshipsPattern_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PatternElementChain(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!PatternElementChain(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RelationshipsPattern_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ws K_REMOVE RemoveItem (ws "," ws RemoveItem)*
  public static boolean Remove(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Remove")) return false;
    if (!nextTokenIs(b, "<remove>", K_REMOVE, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<remove>");
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_REMOVE);
    r = r && RemoveItem(b, l + 1);
    r = r && Remove_3(b, l + 1);
    exit_section_(b, l, m, REMOVE, r, false, null);
    return r;
  }

  // (ws "," ws RemoveItem)*
  private static boolean Remove_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Remove_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Remove_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Remove_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ws "," ws RemoveItem
  private static boolean Remove_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Remove_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && ws(b, l + 1);
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
  // (ws K_RETURN_DISTINCT ReturnBody)
  //          | (ws K_RETURN ReturnBody)
  public static boolean Return(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Return")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<return>");
    r = Return_0(b, l + 1);
    if (!r) r = Return_1(b, l + 1);
    exit_section_(b, l, m, RETURN, r, false, null);
    return r;
  }

  // ws K_RETURN_DISTINCT ReturnBody
  private static boolean Return_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Return_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_RETURN_DISTINCT);
    r = r && ReturnBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws K_RETURN ReturnBody
  private static boolean Return_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Return_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_RETURN);
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
  // (ws "*" ws ReturnItem? (ws "," ws ReturnItem)*)
  //               | (ws ReturnItem (ws "," ws ReturnItem)*)
  public static boolean ReturnItems(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnItems")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<return items>");
    r = ReturnItems_0(b, l + 1);
    if (!r) r = ReturnItems_1(b, l + 1);
    exit_section_(b, l, m, RETURN_ITEMS, r, false, null);
    return r;
  }

  // ws "*" ws ReturnItem? (ws "," ws ReturnItem)*
  private static boolean ReturnItems_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnItems_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, MUL);
    r = r && ws(b, l + 1);
    r = r && ReturnItems_0_3(b, l + 1);
    r = r && ReturnItems_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ReturnItem?
  private static boolean ReturnItems_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnItems_0_3")) return false;
    ReturnItem(b, l + 1);
    return true;
  }

  // (ws "," ws ReturnItem)*
  private static boolean ReturnItems_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnItems_0_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ReturnItems_0_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ReturnItems_0_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ws "," ws ReturnItem
  private static boolean ReturnItems_0_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnItems_0_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && ws(b, l + 1);
    r = r && ReturnItem(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws ReturnItem (ws "," ws ReturnItem)*
  private static boolean ReturnItems_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnItems_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && ReturnItem(b, l + 1);
    r = r && ReturnItems_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ws "," ws ReturnItem)*
  private static boolean ReturnItems_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnItems_1_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ReturnItems_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ReturnItems_1_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ws "," ws ReturnItem
  private static boolean ReturnItems_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnItems_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && ws(b, l + 1);
    r = r && ReturnItem(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ws ">" ws
  static boolean RightArrowHead(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RightArrowHead")) return false;
    if (!nextTokenIs(b, "", GREATHERTHEN, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, GREATHERTHEN);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ws K_SET SetItem (ws "," ws SetItem)*
  public static boolean SetClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SetClause")) return false;
    if (!nextTokenIs(b, "<set clause>", K_SET, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<set clause>");
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_SET);
    r = r && SetItem(b, l + 1);
    r = r && SetClause_3(b, l + 1);
    exit_section_(b, l, m, SET_CLAUSE, r, false, null);
    return r;
  }

  // (ws "," ws SetItem)*
  private static boolean SetClause_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SetClause_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!SetClause_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SetClause_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ws "," ws SetItem
  private static boolean SetClause_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SetClause_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && ws(b, l + 1);
    r = r && SetItem(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (ws PropertyExpression ws "=" ws Expression)
  //           | (ws Identifier ws "=" ws Expression)
  //           | (ws Identifier ws "+=" ws Expression)
  //           | (ws Identifier NodeLabels)
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

  // ws PropertyExpression ws "=" ws Expression
  private static boolean SetItem_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SetItem_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && PropertyExpression(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, EQUAL);
    r = r && ws(b, l + 1);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws Identifier ws "=" ws Expression
  private static boolean SetItem_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SetItem_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, EQUAL);
    r = r && ws(b, l + 1);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws Identifier ws "+=" ws Expression
  private static boolean SetItem_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SetItem_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, PLUSEQUALS);
    r = r && ws(b, l + 1);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws Identifier NodeLabels
  private static boolean SetItem_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SetItem_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && NodeLabels(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (ws K_SHORTESTPATH ws "(" ws PatternElement ws ")" ws)
  //                       | (ws K_ALLSHORTESTPATHS ws "(" ws PatternElement ws ")" ws)
  public static boolean ShortestPathPattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShortestPathPattern")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<shortest path pattern>");
    r = ShortestPathPattern_0(b, l + 1);
    if (!r) r = ShortestPathPattern_1(b, l + 1);
    exit_section_(b, l, m, SHORTEST_PATH_PATTERN, r, false, null);
    return r;
  }

  // ws K_SHORTESTPATH ws "(" ws PatternElement ws ")" ws
  private static boolean ShortestPathPattern_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShortestPathPattern_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_SHORTESTPATH);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, LEFTBRACE);
    r = r && ws(b, l + 1);
    r = r && PatternElement(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, RIGHTBRACE);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ws K_ALLSHORTESTPATHS ws "(" ws PatternElement ws ")" ws
  private static boolean ShortestPathPattern_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShortestPathPattern_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_ALLSHORTESTPATHS);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, LEFTBRACE);
    r = r && ws(b, l + 1);
    r = r && PatternElement(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, RIGHTBRACE);
    r = r && ws(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ws l_integer
  static boolean SignedDecimalInteger(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SignedDecimalInteger")) return false;
    if (!nextTokenIs(b, "", L_INTEGER, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, L_INTEGER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SignedDecimalInteger
  public static boolean SignedIntegerLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SignedIntegerLiteral")) return false;
    if (!nextTokenIs(b, "<signed integer literal>", L_INTEGER, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<signed integer literal>");
    r = SignedDecimalInteger(b, l + 1);
    exit_section_(b, l, m, SIGNED_INTEGER_LITERAL, r, false, null);
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
  // ws K_SKIP Expression
  public static boolean Skip(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Skip")) return false;
    if (!nextTokenIs(b, "<skip>", K_SKIP, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<skip>");
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_SKIP);
    r = r && Expression(b, l + 1);
    exit_section_(b, l, m, SKIP, r, false, null);
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
  // ws K_START (StartPoint (ws "," ws StartPoint)*)? Where?
  public static boolean Start(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Start")) return false;
    if (!nextTokenIs(b, "<start>", K_START, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<start>");
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_START);
    r = r && Start_2(b, l + 1);
    r = r && Start_3(b, l + 1);
    exit_section_(b, l, m, START, r, false, null);
    return r;
  }

  // (StartPoint (ws "," ws StartPoint)*)?
  private static boolean Start_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Start_2")) return false;
    Start_2_0(b, l + 1);
    return true;
  }

  // StartPoint (ws "," ws StartPoint)*
  private static boolean Start_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Start_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StartPoint(b, l + 1);
    r = r && Start_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ws "," ws StartPoint)*
  private static boolean Start_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Start_2_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Start_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Start_2_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ws "," ws StartPoint
  private static boolean Start_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Start_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && ws(b, l + 1);
    r = r && StartPoint(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Where?
  private static boolean Start_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Start_3")) return false;
    Where(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Identifier ws "=" ws Lookup
  public static boolean StartPoint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StartPoint")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<start point>");
    r = Identifier(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, EQUAL);
    r = r && ws(b, l + 1);
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
  // ws l_string
  public static boolean StringLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringLiteral")) return false;
    if (!nextTokenIs(b, "<string literal>", L_SPACE, L_STRING)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<string literal>");
    r = ws(b, l + 1);
    r = r && consumeToken(b, L_STRING);
    exit_section_(b, l, m, STRING_LITERAL, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // UnescapedSymbolicNameString | EscapedSymbolicNameString
  static boolean SymbolicNameString(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SymbolicNameString")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UnescapedSymbolicNameString(b, l + 1);
    if (!r) r = EscapedSymbolicNameString(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ws l_identifier
  static boolean UnescapedSymbolicNameString(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnescapedSymbolicNameString")) return false;
    if (!nextTokenIs(b, "", L_IDENTIFIER, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, L_IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ws (K_UNION_ALL | K_UNION) SingleQuery
  public static boolean Union(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Union")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<union>");
    r = ws(b, l + 1);
    r = r && Union_1(b, l + 1);
    r = r && SingleQuery(b, l + 1);
    exit_section_(b, l, m, UNION, r, false, null);
    return r;
  }

  // K_UNION_ALL | K_UNION
  private static boolean Union_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Union_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, K_UNION_ALL);
    if (!r) r = consumeToken(b, K_UNION);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ws K_CONSTRAINT_ON ws "(" ws Identifier NodeLabel ws ")" ws K_ASSERT PropertyExpression K_IS_UNIQUE
  public static boolean UniqueConstraintSyntax(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UniqueConstraintSyntax")) return false;
    if (!nextTokenIs(b, "<unique constraint syntax>", K_CONSTRAINT_ON, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<unique constraint syntax>");
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_CONSTRAINT_ON);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, LEFTBRACE);
    r = r && ws(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && NodeLabel(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, RIGHTBRACE);
    r = r && ws(b, l + 1);
    r = r && consumeToken(b, K_ASSERT);
    r = r && PropertyExpression(b, l + 1);
    r = r && consumeToken(b, K_IS_UNIQUE);
    exit_section_(b, l, m, UNIQUE_CONSTRAINT_SYNTAX, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ws l_integer
  static boolean UnsignedDecimalInteger(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnsignedDecimalInteger")) return false;
    if (!nextTokenIs(b, "", L_INTEGER, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, L_INTEGER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // UnsignedDecimalInteger
  public static boolean UnsignedIntegerLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnsignedIntegerLiteral")) return false;
    if (!nextTokenIs(b, "<unsigned integer literal>", L_INTEGER, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<unsigned integer literal>");
    r = UnsignedDecimalInteger(b, l + 1);
    exit_section_(b, l, m, UNSIGNED_INTEGER_LITERAL, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ws K_UNWIND Expression K_AS Identifier
  public static boolean Unwind(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Unwind")) return false;
    if (!nextTokenIs(b, "<unwind>", K_UNWIND, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<unwind>");
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_UNWIND);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, K_AS);
    r = r && Identifier(b, l + 1);
    exit_section_(b, l, m, UNWIND, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ws K_WHERE Expression
  public static boolean Where(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Where")) return false;
    if (!nextTokenIs(b, "<where>", K_WHERE, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<where>");
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_WHERE);
    r = r && Expression(b, l + 1);
    exit_section_(b, l, m, WHERE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (ws K_WITH_DISTINCT ReturnBody Where?)
  //        | (ws K_WITH ReturnBody Where?)
  public static boolean With(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "With")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<with>");
    r = With_0(b, l + 1);
    if (!r) r = With_1(b, l + 1);
    exit_section_(b, l, m, WITH, r, false, null);
    return r;
  }

  // ws K_WITH_DISTINCT ReturnBody Where?
  private static boolean With_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "With_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_WITH_DISTINCT);
    r = r && ReturnBody(b, l + 1);
    r = r && With_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Where?
  private static boolean With_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "With_0_3")) return false;
    Where(b, l + 1);
    return true;
  }

  // ws K_WITH ReturnBody Where?
  private static boolean With_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "With_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ws(b, l + 1);
    r = r && consumeToken(b, K_WITH);
    r = r && ReturnBody(b, l + 1);
    r = r && With_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Where?
  private static boolean With_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "With_1_3")) return false;
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
  // ws "(" Expression ")"
  public static boolean parenthesizedExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parenthesizedExpression")) return false;
    if (!nextTokenIs(b, "<parenthesized expression>", LEFTBRACE, L_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<parenthesized expression>");
    r = ws(b, l + 1);
    r = r && consumeToken(b, LEFTBRACE);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, RIGHTBRACE);
    exit_section_(b, l, m, PARENTHESIZED_EXPRESSION, r, false, null);
    return r;
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

  /* ********************************************************** */
  // l_space*
  static boolean ws(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ws")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, L_SPACE)) break;
      if (!empty_element_parsed_guard_(b, "ws", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  final static Parser statement_recover_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return statement_recover(b, l + 1);
    }
  };
}
