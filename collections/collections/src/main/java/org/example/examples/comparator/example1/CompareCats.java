package org.example.examples.comparator.example1;

import org.example.examples.Cat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareCats {
    public static void main(String[] args) {
        CatComparator1 comparator1 = new CatComparator1();
        CatComparator2 comparator2 = new CatComparator2();
        Cat cat1 = new Cat(10, "tim");
        Cat cat2 = new Cat(11, "rak");
        List<Cat> catList = new ArrayList<>();
        catList.add(cat1);
        catList.add(cat2);
        Collections.sort(catList, comparator1);
        System.out.println(catList);
        Collections.sort(catList, comparator2);
        System.out.println(catList);
        //сортировка comparable класса
        System.out.println("сортировка comparable класса по имени");
        Collections.sort(catList);
        System.out.println(catList);
    }
}
