package org.example.creatingThreads;

public class App3 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("start App3");
        }
    }
}
