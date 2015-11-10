package io.graphgeeks.intellij.plugin.cypher;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

/**
 * @author dmitry.vrublevsky@graphgeeks.io
 */
public class CypherFileTypeFactory extends FileTypeFactory {

    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(CypherFileType.INSTANCE, "cyp");
    }
}
