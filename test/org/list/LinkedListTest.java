package org.list;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LinkedListTest {
    LinkedList list;
    Node node;

    @Before
    public void before() {
        list = new LinkedList();
    }

    @Test
    public void WhenCreated_LinkedListHasNoElements() {
        assertEquals(0, list.size());
    }

    @Test
    public void canGetHead() {
        assertEquals(null, list.getHead());
    }

    @Test
    public void canInsertToFront() {
        list.insertToFront(99);
        assertEquals(1, list.size());
        assertEquals(99, list.getHead());
    }

    @Test
    public void canRemoveFromFront() {
        list.insertToFront(5);
        list.insertToFront(15);
        list.removeFromFront();
        assertEquals(1, list.size());
        assertEquals(5, list.getHead());
    }

    @Test
    public void canGet() {
        list.insertToFront(5);
        list.insertToFront(15);
        list.insertToFront(30);
        assertEquals(30, list.get(0).value);
        assertEquals(15, list.get(1).value);
        assertEquals(5, list.get(2).value);
    }

    @Test
    public void canAddToEnd() {
        list.insertToFront(5);
        list.insertToFront(15);
        list.insertToFront(30);
        list.insertToEnd(100);
        assertEquals(30, list.get(0).value);
        assertEquals(15, list.get(1).value);
        assertEquals(5, list.get(2).value);
        assertEquals(100, list.get(3).value);
        assertEquals(4, list.size());
    }

    @Test
    public void canRemoveFromEnd() {
        list.insertToEnd(5);
        list.insertToEnd(15);
        list.insertToEnd(100);
        list.removeFromEnd();
        assertEquals(2, list.size());
        assertEquals(15, list.get(1).value);
    }

    @Test
    public void canRemoveFromPosition() {
        list.insertToEnd(5);
        list.insertToEnd(15);
        list.insertToEnd(100);
        list.remove(1);
        assertEquals(2, list.size());
        assertEquals(100, list.get(1).value);

    }


}
