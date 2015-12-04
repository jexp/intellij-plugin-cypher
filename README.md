Cypher Intellij Plugin
======================

Plugin provides (Cypher)[http://www.opencypher.org/] language support for IntelliJ IDE.

## Installation

TODO

## Known issues

* Using keyword or function name, as variable will break lexer.
* Error description is not really usable (internal naming).

## Development

Gradle is used as build system. 

**Run Idea to test plugin:** `gradle runIdea`

#### Grammar

Cypher grammar is located here - `src/main/java/com/neueda4j/intellij/plugin/cypher/lexer/Cypher.bnf`

After grammar change:

* Generate parser code for grammar
* Generate jFlex `.lexer` for grammar
* Generate lexer code from `.lexer`

