package com.javarush.task.pro.task13.task1313;

public class StringLinkedListMy {
    private Node first = new Node();
    private Node last = new Node();

    public StringLinkedListMy() {
        first.next = last;
        last.prev = first;
    }

    public void printAll() {
        Node currentElement = first.next;

        while ((currentElement) != null) {
            String prevValue = (currentElement.prev == first) ? "first" : currentElement.prev.value;
            String currValue = currentElement.value;
            String nextValue = (currentElement.next == null) ? "last" : currentElement.next.value;
            System.out.printf("[prev: %5s] <- current: %5s -> [next: %4s]\n", prevValue, currValue, nextValue);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        Node node = new Node();
        node.value = value;


        Node lastPrevNode = last.prev;
        lastPrevNode.next = node;
        node.prev = lastPrevNode;
        //node.next = last; // === Не совсем корректно. В лекции говорится, что у носледнего Node().next == null
        last.prev = node;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
