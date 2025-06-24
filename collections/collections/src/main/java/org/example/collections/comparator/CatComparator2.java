package org.example.collections.comparator;

import org.example.collections.Cat;

import java.util.Comparator;

public class CatComparator2 implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getWeight() - o2.getWeight();
    }
}
