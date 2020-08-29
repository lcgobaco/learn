package com.lucas;

public class LinkedList {
    LinkedListNode head = null;
    LinkedListNode tail = null;
    public LinkedList() {
        head = null;
        tail = null;
    }
    public LinkedList(LinkedListNode head, LinkedListNode tail) {
        this.head = head;
        this.tail = tail;
    }

    public LinkedList addNode(String value) {
        LinkedListNode nextNode = new LinkedListNode(value, null);
        if (tail != null) {
            tail.nextNode = nextNode;
            tail = tail.nextNode;
        } else {
            head = nextNode;
            tail = nextNode;
        }
        return this;
    }
}