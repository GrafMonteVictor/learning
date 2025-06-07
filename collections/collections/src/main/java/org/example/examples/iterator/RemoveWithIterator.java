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
    }
}
