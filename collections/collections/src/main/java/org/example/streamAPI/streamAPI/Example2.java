package org.example.streamAPI.streamAPI;

import java.util.Random;

public class Example2 {
    public static void main(String[] args) {
        int i = new Random().ints(1, 21).parallel().distinct().limit(5).sequential().sum();
        System.out.println(i);
    }
}
