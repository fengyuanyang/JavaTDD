package com.ordestiny.tdd.interview.linkedlist;

import lombok.Builder;

@Builder
public class LinkedListNode<E> {
    LinkedListNode<E> next;
    private E data;

    public boolean hasNext() {
        return next != null;
    }

    public E getData() {
        return data;
    }

}
