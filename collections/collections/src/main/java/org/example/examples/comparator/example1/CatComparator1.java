package org.example.examples.comparator.example1;

import org.example.examples.Cat;

import java.util.Comparator;

public class CatComparator1 implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
