package org.example.examples.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class DeletingEven {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a", "e", "v", "e", "1"));
        Predicate<String> predicate = s -> list.indexOf(s) % 2 != 0;
        list.removeIf(predicate);
//        list.removeIf()
//        list.stream().filter(predicate).toList();
//        Predicate<String> predicate = s ->
//        List<Integer> list = new ArrayList<>(List.of(1, 4, 6, 3, 0, 7));
//        list.removeIf(n -> n % 2 == 0);
        System.out.println(list);
    }
}
