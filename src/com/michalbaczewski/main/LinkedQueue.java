package com.michalbaczewski.main;

import java.util.EmptyStackException;

public class LinkedQueue<T> implements Queue<T> {

    private QueueElement<T> last;
    private QueueElement<T> first;
    private Integer size;

    public LinkedQueue() {
        this.last = null;
        this.first = null;
        this.size = 0;
    }

    public void push(T element) {
        QueueElement<T> newElement = new QueueElement<>(element);
        if (isEmpty()) {
            last = newElement;
            first = last;
        } else {
            last.nextElement = newElement;
            last = last.nextElement;
        }
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T front() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            return first.value;
        }
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        if (size == 1) {
            last = null;
        }
        T temp = first.value;
        first = first.nextElement;
        size--;
        return temp;
    }

    private class QueueElement<T> {
        private T value;
        private QueueElement<T> nextElement;

        public QueueElement(T value) {
            this.value = value;
            this.nextElement = null;
        }
    }
}
