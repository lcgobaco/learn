package com.lucas;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListServiceTest {

    private LinkedListService linkedListService = new LinkedListService();

    @Test
    public void createLinkedList() {
        LinkedListNode result = linkedListService.createLinkedList(new String[] {"1", "2", "3"});
        System.out.println("End");

    }

    @Test
    public void createLinkedListV2() {
        LinkedList result = linkedListService.createLinkedListV2(new String[] {"1", "2", "3"});
        System.out.println("End");
    }
}