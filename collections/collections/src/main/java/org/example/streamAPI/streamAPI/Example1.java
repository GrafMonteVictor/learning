package org.example.streamAPI.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight"));
        list.stream()
                .filter(s -> s.length() <= 3)
                .sorted(Comparator.reverseOrder())
                .map(String::toUpperCase)
                .forEach(System.out::println);

        list.stream()
                .filter(s -> s.length() > 3)
                .sorted((o1, o2) -> o1.length() - o2.length())
                .map(s -> s.replace("o", "0"))
                .map(s -> s.replace("e", "9"))
                .forEach(System.out::println);
    }
}
