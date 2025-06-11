package org.example.examples.map;

import lombok.var;

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
        for (var item: customersSet) {
            System.out.println(item.getKey());
            System.out.println(item.getValue());
        }
    }
}
