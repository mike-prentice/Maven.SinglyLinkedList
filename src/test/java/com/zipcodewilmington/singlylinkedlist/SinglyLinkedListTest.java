package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    @org.junit.jupiter.api.Test
    void addTest() {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.add(3);
        linkedList.add(4);
        System.out.println(linkedList);

    }

    @org.junit.jupiter.api.Test
    void testAddtoIndexTest() {
        SinglyLinkedList linkedList1 = new SinglyLinkedList();
        linkedList1.add(0, 4);
        linkedList1.add(1, 4);
        System.out.println(linkedList1);
    }

    @org.junit.jupiter.api.Test
    void getTest() {
        SinglyLinkedList linkedList2 = new SinglyLinkedList();
        linkedList2.add(0, 4);
        linkedList2.add(1, 4);
        System.out.println(linkedList2.get(1));
    }
}
