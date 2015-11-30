package io.graphgeeks.intellij.plugin.cypher.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.Language;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import io.graphgeeks.intellij.plugin.cypher.CypherLanguage;
import io.graphgeeks.intellij.plugin.cypher.file.CypherFile;
import io.graphgeeks.intellij.plugin.cypher.lexer.CypherLexerAdapter;
import io.graphgeeks.intellij.plugin.cypher.psi.CypherTypes;
import org.jetbrains.annotations.NotNull;

/**
 * Definer lexer and parser.
 *
 * @author dmitry.vrublevsky@graphgeeks.io
 */
public class CypherParserDefinition implements ParserDefinition {

    public static final IFileElementType FILE =
            new IFileElementType(Language.findInstance(CypherLanguage.class));

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new CypherLexerAdapter();
    }

    @Override
    public PsiParser createParser(Project project) {
        return new CypherParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public TokenSet getWhitespaceTokens() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return CypherTypes.Factory.createElement(node);
    }

    @Override
    public PsiFile createFile(FileViewProvider viewProvider) {
        return new CypherFile(viewProvider);
    }

    @Override
    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }
}
