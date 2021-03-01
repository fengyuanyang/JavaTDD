package com.ordestiny.tdd.interview.linkedlist;

public class LinkedListNodeUtil {

    public static LinkedListNode partition(LinkedListNode node , int x) {
        if (node == null || node.next == null)
            return node;
        LinkedListNode leftCurrentNode = null;
        LinkedListNode leftNodeHead = null;
        LinkedListNode rightCurrentNode = null;
        LinkedListNode rightNodeHead = null;
        LinkedListNode currentNode = null;
        do {
            if (currentNode == null)
                currentNode = node;
            else
                currentNode = currentNode.next;
            int nodeValue = (int) currentNode.getData();
            LinkedListNode newNode = LinkedListNode.builder().data(nodeValue).build();
            if ( nodeValue < x) {
                if (leftNodeHead == null) {
                    leftNodeHead = newNode;
                    leftCurrentNode = leftNodeHead;
                } else {
                    leftCurrentNode.next = newNode;
                    leftCurrentNode = leftCurrentNode.next;
                }

            } else {
                if (rightNodeHead == null) {
                    rightNodeHead = newNode;
                    rightCurrentNode = rightNodeHead;
                } else {
                    rightCurrentNode.next = newNode;
                    rightCurrentNode = rightCurrentNode.next;
                }
            }
        } while(currentNode.hasNext());

        if (leftNodeHead == null)
            return rightNodeHead;
        if (rightNodeHead == null)
            return leftNodeHead;
        leftCurrentNode.next = rightNodeHead;

        return leftNodeHead;
    }
}
