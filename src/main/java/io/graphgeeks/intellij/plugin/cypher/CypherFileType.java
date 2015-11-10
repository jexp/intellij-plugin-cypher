package io.graphgeeks.intellij.plugin.cypher;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.Icon;

/**
 * @author dmitry.vrublevsky@graphgeeks.io
 */
public class CypherFileType extends LanguageFileType{

    public static final CypherFileType INSTANCE = new CypherFileType();

    private CypherFileType() {
        super(CypherLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Cypher file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Cypher query language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "cyp";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return CypherIcons.FILE;
    }
}
