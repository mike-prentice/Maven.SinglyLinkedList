package com.zipcodewilmington.singlylinkedlist;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    @org.junit.jupiter.api.Test
    void addTest() {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.add(3);
        linkedList.add(4);
        assertThat(linkedList.size(), is(2));


    }

    @org.junit.jupiter.api.Test
    void testAddtoIndexTest() {
        SinglyLinkedList linkedList1 = new SinglyLinkedList();
        linkedList1.add(0, 4);
        linkedList1.add(1, 4);
        assertThat(linkedList1.size(), is(2));
    }

    @org.junit.jupiter.api.Test
    void getTest() {
        SinglyLinkedList linkedList2 = new SinglyLinkedList();
        linkedList2.add(0, 4);
        linkedList2.add(1, 4);
        System.out.println(linkedList2.get(1));
    }

    @Test
    void remove() {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.remove(0);
        linkedList.remove(1);
        assertThat(linkedList.size(), is(0));

    }

    @Test
    void size() {
        SinglyLinkedList linkedList4 = new SinglyLinkedList();
        linkedList4.add(3);
        linkedList4.add(4);
        linkedList4.add(5);
        linkedList4.add(8);
        linkedList4.add(9);
        assertThat(linkedList4.size(), is(7));
    }

    @Test
    void testToString() {
    }
}
