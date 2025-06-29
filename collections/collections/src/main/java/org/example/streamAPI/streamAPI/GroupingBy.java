package org.example.streamAPI.streamAPI;

import org.example.collections.Cat;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy {
    public static void main(String[] args) {
        List<Cat> listCat = Arrays.asList(
                new Cat(4, "raketka"),
                new Cat(3, "timon"),
                new Cat(3, "princessa"),
                new Cat(6, "rocket")

        );
//Collectors.groupingBy(Cat::getWeight, Collectors.toList())
        Map<Integer, List<Cat>> listCatGroupingByWeight = listCat.stream()
                .collect(Collectors.groupingBy(
                        Cat::getWeight, Collectors.toList())
                );
        for (Map.Entry<Integer, List<Cat>> entry : listCatGroupingByWeight.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        //
        Map<Integer, List<Cat>> listCatGroupingByWeight2 = listCat.stream()
                .collect(Collectors.groupingBy(
                        Cat::getWeight)
                );

        for (Map.Entry entry: listCatGroupingByWeight2.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
