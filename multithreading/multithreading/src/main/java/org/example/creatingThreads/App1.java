package org.example.creatingThreads;

/**
 * Hello world!
 *
 */
public class App1 implements Runnable
{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("start App1");
        }
    }
}
