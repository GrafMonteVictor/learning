package org.example.examples.iterator;

import java.util.LinkedList;

public class CycleLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = getRandomList();
        list.forEach(System.out::println);
        System.out.println("_____________________\n");
        list.removeIf(i -> i > 10);
        list.forEach(System.out::println);

    }
    public static LinkedList<Integer> getRandomList() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 1000; i++) {
            list.add((int) (1 + Math.random() * (100 - 1) + 1));
        }
        return list;
    }
}
