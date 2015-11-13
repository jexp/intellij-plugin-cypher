package io.graphgeeks.intellij.plugin.cypher.lexer.token.impl;

import com.intellij.psi.tree.IElementType;
import io.graphgeeks.intellij.plugin.cypher.lexer.token.Token;
import io.graphgeeks.intellij.plugin.cypher.psi.CypherTokenType;
import org.parboiled.Node;

/**
 * Represents common token.
 *
 * @author dmitry.vrublevsky@graphgeeks.io
 */
public class CommonToken extends Token {

    private final Node<?> node;

    public CommonToken(Node<?> node) {
        this.node = node;
    }

    @Override
    public String getName() {
        return node.getLabel();
    }

    @Override
    public IElementType getTokenType() {
        return CypherTokenType.get(node.getLabel());
    }

    @Override
    public int getStartOffset() {
        return node.getStartIndex();
    }

    @Override
    public int getEndOffset() {
        return node.getEndIndex();
    }
}
