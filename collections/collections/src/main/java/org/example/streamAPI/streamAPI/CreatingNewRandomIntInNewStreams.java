package org.example.streamAPI.streamAPI;

import java.util.Random;
import java.util.stream.Stream;

public class CreatingNewRandomIntInNewStreams {
    public static void main(String[] args) {
        Stream stream1 = Stream.generate(Math::random);
        Stream<Integer> stream2 = Stream.generate(() -> new Random().nextInt()).limit(10); //генерирует 10 случайных чисел
        Stream<Integer> stream3 = Stream.generate(() -> new Random().nextInt(71) + 30).limit(10); //генерирует 10 случайных чисел от 1 до 100
//        Stream<Integer> stream3 = Stream.generate(Math::random).limit(10); //генерирует 10 случайных чисел
        stream2.forEach(System.out::println);
        stream3.forEach(System.out::println);

//        Stream<Integer> stream3 = Stream.generate(() -> new Random().ints(1, 101).limit(10));
//        Stream stream = Stream.generate();
    }
}
