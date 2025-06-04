package org.example.creatingThreads;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new App1());
        Thread thread2 = new Thread(new App2());
        thread1.start();
        thread2.start();
    }
}
