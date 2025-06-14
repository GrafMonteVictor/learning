package org.example.examples.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MapExample_1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Leo");
        map.put(2, "Don");
        map.put(3, "Don1");
        map.put(4, "Don2");
        map.put(5, "Don3");
        map.put(6, "Don4");
        map.put(7, "Don5");
        map.put(524288, "Mike");
        map.put(8, "Don6");
//        map.put(8, "Raf");
        System.out.println(map);
//        System.out.println(Objects.hash(8));
        for (Map.Entry<Integer, String> mapEntry: map.entrySet()) {
            System.out.println(mapEntry.getKey());
        }
    }
}
