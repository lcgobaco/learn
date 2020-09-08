package com.lucas.LinkedList;

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

    @Test
    public void reverse() {
        LinkedListNode input = linkedListService.createLinkedList(new String[] {"1", "2", "3"});
        LinkedListNode result = linkedListService.reverse(input);
        System.out.println("End");
    }

    @Test
    public void toArray() {
        String[] input1 = new String[] {"1", "2", "3"};
        LinkedListNode input = linkedListService.createLinkedList(input1);
        String[] result = linkedListService.toArray(input);
        assertArrayEquals(input1, result);
    }

    @Test
    public void complete() {
        String[] input1 = new String[] {"1", "2", "3"};
        LinkedListNode result1 = linkedListService.createLinkedList(input1);
        LinkedListNode result2 = linkedListService.reverse(result1);
        LinkedListNode result3 = linkedListService.reverse(result2);
        String[] result4 = linkedListService.toArray(result3);
        assertArrayEquals(input1, result4);
    }
}