package org.example.streamAPI.streamAPI;

import java.util.stream.Stream;

public class StreamBuilder {
    public static void main(String[] args) {
        Stream stream = Stream.builder()
                .add(1)
                .add(2)
                .add(3)
                .build();
        stream.forEach(System.out::println);
    }
}
