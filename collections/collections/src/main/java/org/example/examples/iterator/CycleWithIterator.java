package org.example.examples.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CycleWithIterator {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("1", "a", "e", "w", "q"));
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
