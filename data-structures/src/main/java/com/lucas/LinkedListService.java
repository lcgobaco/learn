package com.lucas;

public class LinkedListService {

    /*
    1 -> 2 -> 3 -> null
     */
    public LinkedListNode createLinkedList(String[] values) {
        LinkedListNode nextNode = null;
        for (int i = values.length-1; i >= 0 ; i--) {
            nextNode = new LinkedListNode(values[i], nextNode);
        }
        return nextNode;
    }

    public LinkedList createLinkedListV2(String[] values) {
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < values.length; i++) {
            linkedList.addNode(values[i]);
        }
        return linkedList;
    }


}
