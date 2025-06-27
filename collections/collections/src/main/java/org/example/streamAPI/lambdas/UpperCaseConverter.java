package org.example.streamAPI.lambdas;

@FunctionalInterface
public interface UpperCaseConverter {
    String toUpperCase(String input);
}
