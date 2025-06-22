package org.example.examples.map.putGetHashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put(new Key("vishal"), 20); //одинаковый хэш
        map.put(new Key("sachin"), 30);
        map.put(new Key("vaibhav"), 40); //одинаковый хэш
        System.out.println(map);
        System.out.println(map.get(new Key("vishal")));
        System.out.println(map.get(new Key("vaibhav")));
    }
}
