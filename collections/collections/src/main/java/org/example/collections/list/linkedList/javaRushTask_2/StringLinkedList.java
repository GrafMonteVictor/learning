package org.example.collections.list.linkedList.javaRushTask_2;

public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public StringLinkedList() {
        first.next = last;
        last.prev = first;
    }

    public void add(String value) {
        Node newNode = new Node();
        newNode.value = value;

        Node prevLast = last.prev;
        prevLast.next = newNode;
        newNode.prev = prevLast;
        newNode.next = last;
        last.prev = newNode;
    }

    public String get(int index) {
        return null;
        //напишите тут ваш код
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
