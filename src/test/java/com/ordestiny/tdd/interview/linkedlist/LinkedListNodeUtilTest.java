package com.ordestiny.tdd.interview.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class LinkedListNodeUtilTest {
    LinkedListNodeUtil util = new LinkedListNodeUtil();

    @ParameterizedTest
    @MethodSource("partitionArguments")
    void partition(LinkedListNode<Integer> node, int x, LinkedListNode<Integer> expectedNode) {
        LinkedListNode<Integer> currentNode = util.partition(node, x);

        do {
            Assertions.assertEquals(expectedNode.getData(), currentNode.getData());
            if (currentNode.hasNext()) {
                currentNode = currentNode.next;
                expectedNode = expectedNode.next;
            }

        } while (currentNode.hasNext());
    }

    @Test
    void partition_withNullNode_expectNull() {
        LinkedListNode<Integer> currentNode = util.partition(null, 5);

        Assertions.assertEquals(null, currentNode);
    }

    private static Stream<Arguments> partitionArguments() {
        return Stream.of(
                Arguments.of(generate(3, 5, 8, 5, 10, 2, 1), 5, generate(3, 2, 1, 5, 8, 5, 10)),
                Arguments.of(generate(3, 11, 20, 7, 9, 10), 9, generate(3, 7, 11, 20, 9, 10)),
                Arguments.of(generate(20, 19, 23, 13, 6, 5, 0), 0, generate(20, 19, 23, 13, 6, 5, 0)),
                Arguments.of(generate(20, 19, 23, 13, 6, 5, 0), 25, generate(20, 19, 23, 13, 6, 5, 0)),
                Arguments.of(generate(20), 22, generate(20))
        );
    }

    private static LinkedListNode generate(int... nodeValues) {
        LinkedListNode node = null;
        for (int i= nodeValues.length-1;i>=0;i--) {
            if (node == null)
                node = LinkedListNode.builder().data(nodeValues[i]).build();
            else
                node = LinkedListNode.builder().data(nodeValues[i]).next(node).build();
        }
        return node;
    }

    @ParameterizedTest
    @MethodSource("findLoopNodeArguments")
    void foundLoopNode(LinkedListNode<Integer> node, int loopNodeIndex) {
        LinkedListNode loopNode = node;
        for (int i=0;i<loopNodeIndex;i++) {
            loopNode = loopNode.next;
        }
        LinkedListNode endNode = loopNode;
        while(endNode.hasNext())
            endNode = endNode.next;

        endNode.next = loopNode;
        LinkedListNode returnNode = util.findLoopNode(node);
        Assertions.assertEquals(loopNode.getData(), returnNode.getData());
    }

    private static Stream<Arguments> findLoopNodeArguments() {
        return Stream.of(
                Arguments.of(generate(3, 5, 8, 4, 10, 2, 1), 5),
                Arguments.of(generate(3, 11, 20, 7, 9, 10), 3),
                Arguments.of(generate(20, 19, 23, 13, 6, 5, 0), 5),
                Arguments.of(generate(20, 19, 23, 13, 6, 5, 0), 4),
                Arguments.of(generate(20), 0)
        );
    }
}
