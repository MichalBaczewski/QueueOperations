package com.michalbaczewski.main;

public class LinkedQueueTest {
    public static void main(String[] args) {
        LinkedQueue<String> linkedQueue = new LinkedQueue<>();
        System.out.println("isEmpty: " + linkedQueue.isEmpty());
        linkedQueue.push("Element nr 1");
        System.out.println("Front: " + linkedQueue.front());
        linkedQueue.push("Element nr 2");
        linkedQueue.push("Element nr 3");
        System.out.println("isEmpty: " + linkedQueue.isEmpty());
        System.out.println("Front: " + linkedQueue.front());
        System.out.println("Zdejmuje: " + linkedQueue.pop());
        System.out.println("Zdejmje: " + linkedQueue.pop());
        System.out.println("Front: " + linkedQueue.front());
        System.out.println("Zdejmje: " + linkedQueue.pop());
    }
}