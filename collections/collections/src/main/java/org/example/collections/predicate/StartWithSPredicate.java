package org.example.collections.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StartWithSPredicate {
    public static void main(String[] args) {


//        Predicate<String> predicate = new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.startsWith("S");
//            }
//        };
        Predicate<String> predicate = s -> s.startsWith("S");
//    Predicate<String> startsWithS = str -> str.startsWith("S");
        List<String> names = Arrays.asList("Smith", "Samueal", "Catley", "Sie");
        names.stream().filter(predicate).forEach(System.out::println);
    }
}
