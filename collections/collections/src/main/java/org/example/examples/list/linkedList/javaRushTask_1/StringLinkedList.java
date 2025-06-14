package org.example.examples.list.linkedList.javaRushTask_1;

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
        Node newNode = new Node();
        if (first.next != null) {
            Node prelastNode = last.prev; //задаем предпоследний элемент
            prelastNode.next = newNode; //поле предпоследнего элемента ссылается на новую ноду
            newNode.prev = prelastNode; //указываем в новой ноде, что предыдущий элемент - предпоследний
        } else {
            first.next = newNode;
            newNode.prev=first;
        }
        newNode.value = value;
        newNode.next=last; //новый элемент всегда ссылается на last
        last.prev = newNode; //last ссылается на новый элемент
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
