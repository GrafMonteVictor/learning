package org.example.lambda.functionalInterface;

public class Main {
    public static void main(String[] args) {
        StringProcessor sp = new StringProcessor();
        sp.setCharacterReplacer((input, oldChar, newChar) -> {
            return input.replace(oldChar, newChar);
        });

        sp.setLengthChecker(input -> {
            if (input.length() > 10) {
                System.out.println("String is too long!");
            } else {
                System.out.println("String length is fine.");
            }
        });
        sp.setUpperCaseConverter(input -> {
            return input.toUpperCase();
        });
    }
}
