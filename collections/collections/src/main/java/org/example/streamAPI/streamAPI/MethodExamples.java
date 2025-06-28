package org.example.streamAPI.streamAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodExamples {
    public static void main(String[] args) {
        //flatMap
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1, 40, -9),
                Arrays.asList(123, 0, -5),
                Arrays.asList(-45, -234, -11, 0)
        );

        list.stream()
                .flatMap(Collection::stream) //flatMap()
                .distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.println("");
        //takeWhile
        List<Integer> list1 = Arrays.asList(1, -29, -65, 23, 1023, 1);
        List<Integer> takenNumbers = list1.stream()
//                                        .takeWhile(i -> i >= 0)
                                        .filter(i -> i >= 0)
                                        .collect(Collectors.toList());

        //peek
        list1.stream()
                .peek(System.out::println)
                .map(i -> i + 2)
                .sorted()
                .forEach(System.out::println);

        //.collect(Collectors.toStet())
        Set<Integer> set = list1.stream()
                                    .collect(Collectors.toSet());
        System.out.println(set.getClass().getName());
        set.stream()
                .count();

        //reduce()
        Optional<Integer> sumOpt = set.stream()
                                        .reduce((a, b) -> a * b);
        int sum = sumOpt.get();
        System.out.println("произведение: " + sum);

        //anyMatch()
        boolean hasEven = set.stream()
                .anyMatch(n -> n % 2 == 0);
        System.out.println(hasEven);


    }

}
