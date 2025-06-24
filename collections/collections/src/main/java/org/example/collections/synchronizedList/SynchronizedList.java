package org.example.collections.synchronizedList;

import java.util.*;

public class SynchronizedList {
    public static void main(String[] args) {
        List<String> list = Collections.synchronizedList(new LinkedList<>());
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add(1, "10");
        synchronized (list) {
            for (String s: list) {
                System.out.println(s);
            }
        }
    }
}
