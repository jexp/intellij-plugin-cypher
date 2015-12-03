package io.graphgeeks.intellij.plugin.cypher.lexer;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static io.graphgeeks.intellij.plugin.cypher.psi.CypherTypes.*;

%%

%{
  public _CypherLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _CypherLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL="\r"|"\n"|"\r\n"
LINE_WS=[\ \t\f]
WHITE_SPACE=({LINE_WS}|{EOL})+

K_MATCH=(M|m)(A|a)(T|t)(C|c)(H|h)
K_RETURN=(R|r)(E|e)(T|t)(U|u)(R|r)(N|n)
K_RETURN_DISTINCT=(R|r)(E|e)(T|t)(U|u)(R|r)(N|n) (D|d)(I|i)(S|s)(T|t)(I|i)(N|n)(C|c)(T|t)
K_UNION=(U|u)(N|n)(I|i)(O|o)(N|n)
K_UNION_ALL=(U|u)(N|n)(I|i)(O|o)(N|n) (A|a)(L|l)(L|l)
K_LOAD_CSV=((L|l)(O|o)(A|a)(D|d) (C|c)(S|s)(V|v))
K_WITH_HEADERS=(W|w)(I|i)(T|t)(H|h) (H|h)(E|e)(A|a)(D|d)(E|e)(R|r)(S|s)
K_FROM=(F|f)(R|r)(O|o)(M|m)
K_AS=(A|a)(S|s)
K_FIELDTERMINATOR=(F|f)(I|i)(E|e)(L|l)(D|d)(T|t)(E|e)(R|r)(M|m)(I|i)(N|n)(A|a)(T|t)(O|o)(R|r)
K_CREATE=(C|c)(R|r)(E|e)(A|a)(T|t)(E|e)
K_CONSTRAINT_ON=(C|c)(O|o)(N|n)(S|s)(T|t)(R|r)(A|a)(I|i)(N|n)(T|t) (O|o)(N|n)
K_ASSERT=(A|a)(S|s)(S|s)(E|e)(R|r)(T|t)
K_IS_UNIQUE=(I|i)(S|s) (U|u)(N|n)(I|i)(Q|q)(U|u)(E|e)
K_ASSERT_EXISTS=(A|a)(S|s)(S|s)(E|e)(R|r)(T|t) (E|e)(X|x)(I|i)(S|s)(T|t)(S|s)
K_CREATE_INDEX_ON=(C|c)(R|r)(E|e)(A|a)(T|t)(E|e) (I|i)(N|n)(D|d)(E|e)(X|x) (O|o)(N|n)
K_DROP=(D|d)(R|r)(O|o)(P|p)
K_DROP_INDEX_ON=(D|d)(R|r)(O|o)(P|p) (I|i)(N|n)(D|d)(E|e)(X|x) (O|o)(N|n)
K_START=(S|s)(T|t)(A|a)(R|r)(T|t)
K_WHERE=(W|w)(H|h)(E|e)(R|r)(E|e)
K_NODE=(N|n)(O|o)(D|d)(E|e)
K_RELATIONSHIP=(R|r)(E|e)(L|l)(A|a)(T|t)(I|i)(O|o)(N|n)(S|s)(H|h)(I|i)(P|p)
K_REL=(R|r)(E|e)(L|l)
K_OPTIONAL_MATCH=(O|o)(P|p)(T|t)(I|i)(O|o)(N|n)(A|a)(L|l) (M|m)(A|a)(T|t)(C|c)(H|h)
K_USING_INDEX=(U|u)(S|s)(I|i)(N|n)(G|g) (I|i)(N|n)(D|d)(E|e)(X|x)
K_USING_JOIN_ON=(U|u)(S|s)(I|i)(N|n)(G|g) (J|j)(O|o)(I|i)(N|n) (O|o)(N|n)
K_USING_SCAN=(U|u)(S|s)(I|i)(N|n)(G|g) (S|s)(C|c)(A|a)(N|n)
K_SHORTESTPATH=(S|s)(H|h)(O|o)(R|r)(T|t)(E|e)(S|s)(T|t)(P|p)(A|a)(T|t)(H|h)
K_ALLSHORTESTPATHS=(A|a)(L|l)(L|l)(S|s)(H|h)(O|o)(R|r)(T|t)(E|e)(S|s)(T|t)(P|p)(A|a)(T|t)(H|h)(S|s)
K_UNWIND=(U|u)(N|n)(W|w)(I|i)(N|n)(D|d)
K_MERGE=(M|m)(E|e)(R|r)(G|g)(E|e)
K_ON_MATCH=(O|o)(N|n) (M|m)(A|a)(T|t)(C|c)(H|h)
K_ON_CREATE=(O|o)(N|n) (C|c)(R|r)(E|e)(A|a)(T|t)(E|e)
K_SET=(S|s)(E|e)(T|t)
K_CREATE_UNIQUE=(C|c)(R|r)(E|e)(A|a)(T|t)(E|e) (U|u)(N|n)(I|i)(Q|q)(U|u)(E|e)
K_DELETE=(D|d)(E|e)(L|l)(E|e)(T|t)(E|e)
K_DETACH_DELETE=(D|d)(E|e)(T|t)(A|a)(C|c)(H|h) (D|d)(E|e)(L|l)(E|e)(T|t)(E|e)
K_REMOVE=(R|r)(E|e)(M|m)(O|o)(V|v)(E|e)
K_FOREACH=(F|f)(O|o)(R|r)(E|e)(A|a)(C|c)(H|h)
K_IN=(I|i)(N|n)
K_WITH_DISTINCT=(W|w)(I|i)(T|t)(H|h) (D|d)(I|i)(S|s)(T|t)(I|i)(N|n)(C|c)(T|t)
K_WITH=(W|w)(I|i)(T|t)(H|h)
K_ORDER_BY=(O|o)(R|r)(D|d)(E|e)(R|r) (B|b)(Y|y)
K_DESCENDING=(D|d)(E|e)(S|s)(C|c)(E|e)(N|n)(D|d)(I|i)(N|n)(G|g)
K_DESC=(D|d)(E|e)(S|s)(C|c)
K_ASCENDING=(A|a)(S|s)(C|c)(E|e)(N|n)(D|d)(I|i)(N|n)(G|g)
K_ASC=(A|a)(S|s)(C|c)
K_SKIP=(S|s)(K|k)(I|i)(P|p)
K_LIMIT=(L|l)(I|i)(M|m)(I|i)(T|t)
K_USING_PERIODIC_COMMIT=(U|u)(S|s)(I|i)(N|n)(G|g) (P|p)(E|e)(R|r)(I|i)(O|o)(D|d)(I|i)(C|c) (C|c)(O|o)(M|m)(M|m)(I|i)(T|t)
L_SPACE=[ \t\n\x0B\f\r]+
L_IDENTIFIER=[a-zA-Z_$][a-zA-Z_$\d]+
L_IDENTIFIER_TEXT=\`[^`]+\`
L_DECIMAL=[+-]?(([1-9][0-9]+)|([0-9]))\.[0-9]+
L_INTEGER=[+-]?(([1-9][0-9]+)|([0-9]))
L_STRING=('([^'\\]|\\.)*'|\"([^\"\\]|\\.)*\")
LINECOMMENT="//".*
BLOCKCOMMENT="/"\*(.|\n)*\*"/"

%%
<YYINITIAL> {
  {WHITE_SPACE}                  { return com.intellij.psi.TokenType.WHITE_SPACE; }

  "("                            { return LEFTBRACE; }
  ")"                            { return RIGHTBRACE; }
  "{"                            { return LEFTCURLYBRACE; }
  "}"                            { return RIGHTCURLYBRACE; }
  "["                            { return LEFTSQUAREBRACE; }
  "]"                            { return RIGHTSQUAREBRACE; }
  ";"                            { return SEMICOLON; }
  ":"                            { return COLON; }
  "."                            { return DOT; }
  "="                            { return EQUAL; }
  "<"                            { return LESSTHEN; }
  ">"                            { return GREATHERTHEN; }
  "+"                            { return PLUS; }
  "-"                            { return MINUS; }
  "*"                            { return MUL; }
  "`"                            { return BACTICK; }
  ","                            { return COMMA; }
  "?"                            { return QUESTIONSIGN; }
  "|"                            { return PIPE; }
  ".."                           { return RANGE; }
  "+="                           { return PLUSEQUALS; }
  "()-["                         { return STARTRELPATTERN; }
  "()<-["                        { return STARTRELPATTERNDIRECTED; }
  "]-()"                         { return ENDRELPATTERN; }
  "]->()"                        { return ENDRELPATTERNDIRECTED; }

  {K_MATCH}                      { return K_MATCH; }
  {K_RETURN}                     { return K_RETURN; }
  {K_RETURN_DISTINCT}            { return K_RETURN_DISTINCT; }
  {K_UNION}                      { return K_UNION; }
  {K_UNION_ALL}                  { return K_UNION_ALL; }
  {K_LOAD_CSV}                   { return K_LOAD_CSV; }
  {K_WITH_HEADERS}               { return K_WITH_HEADERS; }
  {K_FROM}                       { return K_FROM; }
  {K_AS}                         { return K_AS; }
  {K_FIELDTERMINATOR}            { return K_FIELDTERMINATOR; }
  {K_CREATE}                     { return K_CREATE; }
  {K_CONSTRAINT_ON}              { return K_CONSTRAINT_ON; }
  {K_ASSERT}                     { return K_ASSERT; }
  {K_IS_UNIQUE}                  { return K_IS_UNIQUE; }
  {K_ASSERT_EXISTS}              { return K_ASSERT_EXISTS; }
  {K_CREATE_INDEX_ON}            { return K_CREATE_INDEX_ON; }
  {K_DROP}                       { return K_DROP; }
  {K_DROP_INDEX_ON}              { return K_DROP_INDEX_ON; }
  {K_START}                      { return K_START; }
  {K_WHERE}                      { return K_WHERE; }
  {K_NODE}                       { return K_NODE; }
  {K_RELATIONSHIP}               { return K_RELATIONSHIP; }
  {K_REL}                        { return K_REL; }
  {K_OPTIONAL_MATCH}             { return K_OPTIONAL_MATCH; }
  {K_USING_INDEX}                { return K_USING_INDEX; }
  {K_USING_JOIN_ON}              { return K_USING_JOIN_ON; }
  {K_USING_SCAN}                 { return K_USING_SCAN; }
  {K_SHORTESTPATH}               { return K_SHORTESTPATH; }
  {K_ALLSHORTESTPATHS}           { return K_ALLSHORTESTPATHS; }
  {K_UNWIND}                     { return K_UNWIND; }
  {K_MERGE}                      { return K_MERGE; }
  {K_ON_MATCH}                   { return K_ON_MATCH; }
  {K_ON_CREATE}                  { return K_ON_CREATE; }
  {K_SET}                        { return K_SET; }
  {K_CREATE_UNIQUE}              { return K_CREATE_UNIQUE; }
  {K_DELETE}                     { return K_DELETE; }
  {K_DETACH_DELETE}              { return K_DETACH_DELETE; }
  {K_REMOVE}                     { return K_REMOVE; }
  {K_FOREACH}                    { return K_FOREACH; }
  {K_IN}                         { return K_IN; }
  {K_WITH_DISTINCT}              { return K_WITH_DISTINCT; }
  {K_WITH}                       { return K_WITH; }
  {K_ORDER_BY}                   { return K_ORDER_BY; }
  {K_DESCENDING}                 { return K_DESCENDING; }
  {K_DESC}                       { return K_DESC; }
  {K_ASCENDING}                  { return K_ASCENDING; }
  {K_ASC}                        { return K_ASC; }
  {K_SKIP}                       { return K_SKIP; }
  {K_LIMIT}                      { return K_LIMIT; }
  {K_USING_PERIODIC_COMMIT}      { return K_USING_PERIODIC_COMMIT; }
  {L_SPACE}                      { return L_SPACE; }
  {L_IDENTIFIER}                 { return L_IDENTIFIER; }
  {L_IDENTIFIER_TEXT}            { return L_IDENTIFIER_TEXT; }
  {L_DECIMAL}                    { return L_DECIMAL; }
  {L_INTEGER}                    { return L_INTEGER; }
  {L_STRING}                     { return L_STRING; }
  {LINECOMMENT}                  { return LINECOMMENT; }
  {BLOCKCOMMENT}                 { return BLOCKCOMMENT; }

  [^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}
