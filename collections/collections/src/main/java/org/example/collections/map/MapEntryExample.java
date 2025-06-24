package org.example.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class MapEntryExample {
    public static void main(String[] args) {
        final Map<String, Integer> customers = new HashMap<>();
        customers.put("Холоп 1", 100);
        customers.put("Холоп 2", 20);
        customers.put("Холоп 3", 200);
        Set<Map.Entry<String, Integer>> customersSet = customers.entrySet();
        for (Map.Entry<String, Integer> item: customersSet) {
            System.out.println(item.getKey());
            System.out.println(item.getValue());
        }
        for (Map.Entry<String, Integer> item: customersSet) {
            if (item.getValue() > 100) {
                item.setValue(item.getValue() - 10);
            }
            System.out.println(item.getKey());
            System.out.println(item.getValue());
        }
    }
}
