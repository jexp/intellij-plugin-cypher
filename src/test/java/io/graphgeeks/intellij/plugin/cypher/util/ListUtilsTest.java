package io.graphgeeks.intellij.plugin.cypher.util;

import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static io.graphgeeks.intellij.plugin.cypher.util.ListUtils.getNext;
import static io.graphgeeks.intellij.plugin.cypher.util.ListUtils.getPrev;
import static io.graphgeeks.intellij.plugin.cypher.util.ListUtils.getSafe;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * TODO: Description
 *
 * @author dmitry.vrublevsky@graphgeeks.io
 */
public class ListUtilsTest {

    private List<String> empty;
    private List<String> one;
    private List<String> two;
    private List<String> five;

    @Before
    public void setUp() throws Exception {
        empty = Lists.newArrayList();

        one = Lists.newArrayList("1");
        two = Lists.newArrayList("1", "2");
        five = Lists.newArrayList("1", "2", "3", "4", "5");
    }

    @Test
    public void testGetSafe() throws Exception {
        assertNull(getSafe(empty, 0));

        assertEquals("1", getSafe(one, 0));
        assertNull(getSafe(one, 1));

        assertEquals("1", getSafe(two, 0));
        assertEquals("2", getSafe(two, 1));
        assertNull(getSafe(two, 3));

        assertEquals("5", getSafe(five, 4));
        assertNull(getSafe(five, 5));
        assertNull(getSafe(five, 6));
    }

    @Test
    public void testGetNext() throws Exception {
        assertNull(getNext(empty, 0));

        assertNull(getNext(one, 0));

        assertEquals("2", getNext(two, 0));
        assertNull(getNext(two, 2));

        assertEquals("5", getNext(five, 3));
        assertNull(getNext(five, 4));
        assertNull(getNext(five, 5));
    }

    @Test
    public void testGetPrev() throws Exception {
        assertNull(getPrev(empty, 0));

        assertNull(getPrev(one, 0));

        assertNull(getPrev(two, 0));
        assertEquals("1", getPrev(two, 1));

        assertEquals("5", getPrev(five, 5));
        assertNull(getPrev(five, 6));
    }
}
