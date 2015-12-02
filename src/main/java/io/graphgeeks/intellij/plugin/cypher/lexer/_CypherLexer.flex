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


%%
<YYINITIAL> {
  {WHITE_SPACE}      { return com.intellij.psi.TokenType.WHITE_SPACE; }

  "COMMENT"          { return COMMENT; }
  "CRLF"             { return CRLF; }
  "KEY"              { return KEY; }
  "SEPARATOR"        { return SEPARATOR; }
  "VALUE"            { return VALUE; }


  [^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}
