package com.michalbaczewski.main;

public interface Queue<T> {

    void push(T element);
    T pop();
    T front();
    boolean isEmpty();

}
