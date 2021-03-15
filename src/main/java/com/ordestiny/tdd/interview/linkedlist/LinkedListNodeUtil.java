package com.ordestiny.tdd.interview.linkedlist;

public class LinkedListNodeUtil {

    /**
     * interview Question:
     * A LinkedListNode, with N elements,
     * each element has its value(integer)
     *
     * given a partition value x, all the values in LinkedListNode must be separated into two parts,
     * values below x in left part, values above x must be in right part, then concatenate them
     * ex,
     * Given
     * When LinkedListNode 3-> 5->8 ->5->10->2->1 , and partition = 5
     * Expect 3-> 2->1 ->5->8->5->10
     *
     * @param node
     * @param x
     * @return
     */
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

    /**
     * interview Question:
     * Detect a loop linkedlist node
     * Given a list node
     * When node link as (A->B->C-D->B)
     * Expect return B
     * When node link as (C->D->A->B->E->D)
     * Expect return C
     *
     * @param head
     * @return
     */
    public static LinkedListNode findLoopNode(LinkedListNode head) {
        LinkedListNode slowNode = head;
        LinkedListNode fastNode = head;

        // find first meet node,
        // k:(distance from list start to loop node start)
        //
        // number of nodes passed should be k + (circle length - mod(k, circle length))
        while (fastNode != null && fastNode.hasNext()) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
            if (slowNode == fastNode)
                break;
        }

        // no meet
        if (fastNode == null || fastNode.next == null)
            return null;


        slowNode = head;
        while(slowNode != fastNode) {
            slowNode = slowNode.next;
            fastNode = fastNode.next;
        }

        return fastNode;
    }
}
