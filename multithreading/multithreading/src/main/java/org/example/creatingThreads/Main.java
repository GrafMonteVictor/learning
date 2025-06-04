package org.example.creatingThreads;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new App1());
        Thread thread2 = new Thread(new App2());
        App3 app3 = new App3();
        thread1.start();
        try {
            Thread.sleep(10000);
            System.out.println("главная нить спит");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();
        app3.start();
    }
}
