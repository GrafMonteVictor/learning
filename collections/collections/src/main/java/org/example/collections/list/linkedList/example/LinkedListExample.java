package org.example.collections.list.linkedList.example;

import org.example.collections.Cat;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
    List<Cat> list = new LinkedList<>();
        Cat cat1 = new Cat(1, "1");
        Cat cat2 = new Cat(2, "2");
        cat1 = cat2;
        cat2 = new Cat(3, "3");
        System.out.println(cat1);
        System.out.println(cat2);
    }
}
