package org.example.streamAPI.injectionInterface;

public class Main {
    public static void main(String[] args) {
        StringProcessor sp = new StringProcessor();
        sp.setStringOperation(new DefaultStringOperation());
        System.out.println(sp.process("строка"));

    }
}
