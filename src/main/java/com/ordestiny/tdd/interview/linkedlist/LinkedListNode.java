package com.ordestiny.tdd.interview.linkedlist;

import lombok.Builder;

@Builder
public class LinkedListNode<E> {
    LinkedListNode<E> next;
    private E data;

    public boolean hasNext() {
        return next != null;
    }

    public void setNext(LinkedListNode<E> next) {
        this.next = next;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
}
