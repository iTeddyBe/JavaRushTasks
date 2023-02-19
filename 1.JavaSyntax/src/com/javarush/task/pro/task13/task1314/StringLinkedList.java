package com.javarush.task.pro.task13.task1314;

public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void add(String value) {
        if (first.next == null) {
            Node node = new Node();
            node.value = value;
            first.next = node;
        }
        if (last.prev == null) {
            last.prev = first.next;
            return;
        }

        Node node = new Node();
        node.value = value;

        Node lastNode = last.prev;
        lastNode.next = node;
        node.prev = lastNode;
        last.prev = node;
    }

    public String get(int index) {
        int currentIndex = 0;
        Node currentNode = first.next;
        while (currentNode != null) {
            if (currentIndex == index) {
                return currentNode.value;
            }
            currentIndex++;
            currentNode = currentNode.next;
        }
        return null;
    }

    public String get2(int index) {
        Node current = first.next;
        int size = 0; // счетчик, показывающий на каком элементе цикл
        if (index < 0 || first.next == null) { return null; } // проверка на отрицательное значение индекса и отсутствие элементов в списке
        while (index > 0) {
            if (size == index) { break; } // если счетчик элементов равен заданному значению индекса, завершаем цикл
            if (current == last.prev) { return null; } // если нода является последней, то дальше выполнять цикл нет смысла
            current = current.next; // присваиваем ноде следующую ссылку
            size++;
        }
        return current.value;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
