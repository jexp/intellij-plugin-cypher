package io.graphgeeks.intellij.plugin.cypher.util;

import java.util.List;

/**
 * Utilities for handling common collection usages.
 *
 * @author dmitry.vrublevsky@graphgeeks.io
 */
public class ListUtils {

    /**
     * Return list element, or null if index is out of bound.
     *
     * @param <T> Retrieved element
     */
    public static <T> T getSafe(List<T> list, int i) {
        if (i >= 0 && i < list.size()) {
            return list.get(i);
        } else {
            return null;
        }
    }

    public static <T> T getNext(List<T> list, int i) {
        return getSafe(list, i + 1);
    }

    public static <T> T getPrev(List<T> list, int i) {
        return getSafe(list, i - 1);
    }
}
