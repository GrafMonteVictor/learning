package org.example.collections.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcurrentModificationExceptionexample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("PHP");
        list.add("Python");
        for (String language : list) {
            if (language.equals("PHP")) {
                list.remove(language); // Здесь возникнет ConcurrentModificationException
            }
        }
    }


}
