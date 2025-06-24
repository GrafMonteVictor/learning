package org.example.collections.map;

import java.util.*;

public class MapExample_2 {
    public static void main(String[] args) {
        List<String> key = new ArrayList<>(Arrays.asList("1", "2", "3", "4"));
        Map map = new HashMap<>();
        map.put(key, "привет!");
        //при put/get
            //сущ-ют проиндексированные корзины (изначально 16)
            //сущ-ют ноды (хэш ключа, ключ, значение, ссылка на след. ноду)
            //получаем хэш ключа, вычисляем индекс в корзине ((n-1) & хэш)
            //создаем ноду, помещаем в корзину с соответсвующим индексом (при условии, что хэши разные)
        key.add("3140979265157058358");
//        key.add("31409");
        List<String> newKey = new ArrayList<>(key);
        System.out.println(map.get(key));
    }
}
