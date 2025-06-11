package org.example.examples.set;

import lombok.var;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Example {
    public static void main(String[] args) {
        addCatToHashSer();

    }

    static void addCatToHashSer() {
        //        Set<Integer> set1 = new HashSet<>(Set.of(3, 1, 6, 7, 9, 10, -1, 0));
        Cat cat1 = new Cat(4, "Ракета");
        Cat cat2 = new Cat(3, "Тимон");
        Cat cat3 = new Cat(1, "Тимон");
        Cat cat4 = new Cat(1, "Тимон");
        Set<Cat> set2 = new HashSet<>();
        set2.add(cat1);
        set2.add(cat2);
        set2.add(cat3);
        set2.add(cat4);
//        System.out.println(cat3.equals(cat4));
//        System.out.println(cat3.hashCode() == cat4.hashCode());
        set2.forEach(System.out::println);
        System.out.println();

        cat1.setName("Тимон");
        cat1.setWeight(3);
        System.out.println(cat1.equals(cat2));
        System.out.println(cat1.hashCode() == cat2.hashCode());
        set2.forEach(System.out::println);


    }
}
