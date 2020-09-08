package com.lucas.LinkedList;

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

    public LinkedListNode reverse(LinkedListNode head) {
        LinkedListNode previousNode = null;
        LinkedListNode currentNode = head;
        LinkedListNode nextNode = currentNode.nextNode;
        while (currentNode != null){
            currentNode.nextNode = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
            if (nextNode != null) {
                nextNode = nextNode.nextNode;
            }
        }
        return previousNode;
    }

    public String[] toArray(LinkedListNode head) {
        LinkedListNode currentNode = head;
        int LinkedListLength = 0;
        while (currentNode != null) {
            currentNode = currentNode.nextNode;
            LinkedListLength++;
        }
        String[] arr = new String[LinkedListLength];
        currentNode = head;
        for (int i = 0; i < LinkedListLength; i++) {
            arr[i] = currentNode.value;
            currentNode = currentNode.nextNode;
        }
        return arr;
    }
}
