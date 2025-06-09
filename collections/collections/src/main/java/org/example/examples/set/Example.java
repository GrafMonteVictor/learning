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
//        Set<Cat> set2 = new HashSet<>(Set.of(cat1, cat2));
//        Set<Cat> set3 = new HashSet<>(Set.of(new Cat()));
//        Set<Cat> set2 = new HashSet<>(Arrays.asList(new Cat(4, "Ракета"), new Cat(3, "Тимон")));
        Set<Cat> set2 = new HashSet<>();
        set2.add(cat1);
        set2.add(cat2);
        set2.add(cat3);
        set2.add(cat4);
        System.out.println(cat3.equals(cat4));
        System.out.println(cat3.hashCode() == cat4.hashCode());
//        System.out.println(set2);
//        cat3 = cat4;
//        System.out.println(cat3.hashCode());
//        System.out.println(cat4.hashCode());
        for (Cat cat: set2) {
            System.out.println(cat);
        }
    }
}
