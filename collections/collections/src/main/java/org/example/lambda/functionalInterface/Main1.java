package org.example.lambda.functionalInterface;

public class Main1 {
    public static void main(String[] args) {
        StringProcessor sp = new StringProcessor();
        sp.setCharacterReplacer((input, oldChar, newChar) -> input.replace(oldChar, newChar));

        sp.setLengthChecker(input -> { //иницилаизация лямбды но не её выполнение
            if (input.length() > 10) {
                System.out.println("String is too long!");
            } else {
                System.out.println("String length is fine.");
            }
        });

        sp.setUpperCaseConverter((String input) -> {
            return input.toUpperCase();
        });

        sp.setUpperCaseConverter(String::toUpperCase);

        String result = sp.process("просто так");
        System.out.println(result);
    }
}
