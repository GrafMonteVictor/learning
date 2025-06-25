package org.example.lambda.functionalInterface;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> toInt1 = s -> Integer.parseInt(s); //преобразователь значений
        Function<String, Integer> toInt2 = Integer::parseInt; //преобразователь значений
        System.out.println(toInt1.apply("123"));

        Predicate<String> moreThan10 = s -> s.length() > 10; //предикат - проверяющий условие
        System.out.println(moreThan10.test("пух"));

        Consumer<String> print1 = s -> System.out.println(s); //консюмер - ничего не возвращает
        Consumer<String> print2 = System.out::println; //консюмер - ничего не возвращает
        print1.accept("что это");

        Supplier<Double> generateRandom = Math::random; //поставщик чисел, бананов, шлюх
        System.out.println(generateRandom.get());

        UnaryOperator<Integer> x2 = integer -> integer / 2; //унарный оператор - работающий с одним типом/аргусментом
        System.out.println(x2.apply(10));

        BinaryOperator<Integer> sum = (a, b) -> a + b; //оператор над 2-мя параметрами одного типа
        System.out.println(sum);


    }
}
