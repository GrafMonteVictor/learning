package org.example.examples.list.linkedList.javaRushTask;

public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement != null) && (currentElement != last)) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        //создаем новую ноду
        //next prevNode = текущая нода
        //для текущей ноды: prev = prevNode; next = null
        Node newNode = new Node();
        if (first.next != null) {
            Node preNewNode = last.prev;
            preNewNode.next = newNode;
            newNode.prev = preNewNode;
        } else {
            first.next = newNode;
            newNode.prev=first;
        }
        newNode.value = value;
        newNode.next=last;
        last.prev = newNode;
//        LinkedList
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
