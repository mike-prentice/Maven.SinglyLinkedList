package com.zipcodewilmington.singlylinkedlist;

import java.util.LinkedList;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {

    private static int counter;
    private Node head;

    //constructor


    public SinglyLinkedList() {
    }

    //adds element to end of list
    public void add(Object data) {
        //initialize node at head if one doesnt exist
        if (head == null) {
            head = new Node(data);
        }
        Node linkedTemp = new Node(data);
        Node linkedCurrent = head;

        if (linkedCurrent != null) {
            //starts at head and goes to the end of the list and finds empty spot
            while (linkedCurrent.getNext() != null) {
                linkedCurrent = linkedCurrent.getNext();
            }
            //last node next reference set to new node
            linkedCurrent.setNext(linkedTemp);
        }
        //adds to the number of elements
        incrementCounter();
    }

    private static int getCounter() {
        return counter;
    }

    private static void incrementCounter() {
        counter++;
    }

    private static void decrementCounter() {
        counter--;
    }

    //adds to a specific index
    public void add(Object data, int index) {
        Node linkedTemp = new Node(data);
        Node linkedCurrent = head;

        if (linkedCurrent != null) {
            for (int i = 0; i < index && linkedCurrent.getNext() != null; i++) {
                linkedCurrent = linkedCurrent.getNext();
            }
        }
        linkedTemp.setNext(linkedCurrent.getNext());
        linkedCurrent.setNext(linkedTemp);

        incrementCounter();
    }

    //get method
    public Object get(int index) {
        if (index < 0) {
            return null;
        }
        Node linkedCurrent = null;
        if (head != null) {
            linkedCurrent = head.getNext();
            for (int i = 0; i < index; i++) {
                if (linkedCurrent.getNext() == null) {
                    return null;
                }
                linkedCurrent = linkedCurrent.getNext();

                return linkedCurrent.getData();
            }
        }
        return linkedCurrent;
    }

}

