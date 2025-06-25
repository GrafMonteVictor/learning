package org.example.lambda.lambdas;

public class Main2 {
    public static void main(String[] args) {
        StringProcessor sp = new StringProcessor();
        int threshold = 5; //инициализирую переменную
        sp.setLengthChecker(input -> {
            if (input.length() > threshold) {
                System.out.println("String is too long!");
            } else {
                System.out.println("String length is fine.");
            }
        });

//        threshold = 10; //нельзя изменять после реаоизации лямбда
        sp.process("строка очень большая");
    }
}
