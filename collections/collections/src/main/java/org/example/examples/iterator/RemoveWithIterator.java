package org.example.examples.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveWithIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("1", "a", "e", "w", "q"));
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (list.indexOf(s) != 0 && list.indexOf(s) % 2 == 0) {
                iterator.remove();
            }
        }
        list.forEach(System.out::println);

        List<String> list1 = new ArrayList<>(Arrays.asList("1", "a", "e", "w", "q"));
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).equals("a")) {
                list1.remove(i);
            }
        }
        list1.forEach(System.out::println);

//        List<String> list2 = new ArrayList<>(Arrays.asList("1", "a", "e", "w", "q"));
//        for (String item: list2) {
//            if (item.equals("a")) {
//                list2.remove(item); //выскочит исключение .ConcurrentModificationException
//            }
//        }
//        list2.forEach(System.out::println);

        List<String> list3 = new ArrayList<>(Arrays.asList("1", "a", "e", "w", "q"));
        list3.removeIf(item -> list3.indexOf(item) % 2 == 0);
        list3.forEach(System.out::print);

    }
}
