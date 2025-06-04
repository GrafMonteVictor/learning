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
            if (i == 5) {
                return;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("start App1 " + i);
        }
    }
}
