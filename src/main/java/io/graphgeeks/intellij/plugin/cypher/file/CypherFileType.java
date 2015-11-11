package io.graphgeeks.intellij.plugin.cypher.file;

import com.intellij.openapi.fileTypes.LanguageFileType;
import io.graphgeeks.intellij.plugin.cypher.CypherIcons;
import io.graphgeeks.intellij.plugin.cypher.CypherLanguage;
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
        return "Cypher";
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
