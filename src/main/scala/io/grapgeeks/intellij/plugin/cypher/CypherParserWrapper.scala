package io.grapgeeks.intellij.plugin.cypher

import org.neo4j.cypher.internal.frontend.v2_3.ast
import org.neo4j.cypher.internal.frontend.v2_3.parser.{Expressions, Statement}
import org.parboiled.scala._

/**
  * Construct cypher parser runner
  *
  * @author dmitry.vrublevsky@graphgeeks.io
  */
class CypherParserWrapper extends Parser with Statement with Expressions {
  override val buildParseTree = true

  /**
    * Copy-paste from Cypher paste to make it possible to override build tree settings.
    * @return
    */
  def Statements: Rule1[Seq[ast.Statement]] = rule {
    oneOrMore(WS ~ Statement ~ WS, separator = ch(';')) ~~ optional(ch(';')) ~~ EOI.label("end of input")
  }
}

object CypherParserWrapper {
  def parse(input: String): ParsingResult[Seq[ast.Statement]] = {
    val parser = new CypherParserWrapper
    ReportingParseRunner(parser.Statements).run(input)
  }
}
