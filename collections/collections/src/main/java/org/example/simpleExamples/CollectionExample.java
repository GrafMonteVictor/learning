package org.example.simpleExamples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionExample {
    public static void main(String[] args) {
        LinkedHashSet<String> positions1 = new LinkedHashSet<>();
        positions1.add("junior");
        positions1.add("junior");
        positions1.add("middle");
        positions1.add("senior");
        positions1.add("team lead");
        positions1.add("architect");
        System.out.println(positions1);

        Set<String> positions2 = new HashSet<>();
        positions2.add("junior");
        positions2.add("junior");
        positions2.add("middle");
        positions2.add("senior");
        positions2.add("team lead");
        positions2.add("architect");
        System.out.println(positions2);
    }
}
