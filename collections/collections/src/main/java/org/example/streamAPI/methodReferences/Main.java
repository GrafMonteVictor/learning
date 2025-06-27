package org.example.streamAPI.methodReferences;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;


public class Main {
    public static void main(String[] args) {
        String s = "Hello, world";
        Supplier<Integer> length = s::length; //ссылка на метод объекта
        System.out.println(length.get());

        //ссылка на метод класса
        Consumer<Double> random = System.out::println;
        random.accept(1.0);

        Function<String, String> toUpperCase = String::toUpperCase; //ссылка на метод через класс экземпляра
        System.out.println(toUpperCase.apply("hello"));  // Output: HELLO

        //ссылка на конструктор
        Supplier<String> newString = String::new;
        String s1 = newString.get();
    }
}
