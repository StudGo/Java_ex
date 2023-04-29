package lab13;

import java.util.ArrayList;
import java.util.List;

public class example4 {
    public static void main(String[] args) throws InterruptedException {
        List<Thread> listThread = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(() -> {
                System.out.println(Thread.currentThread().getName());
            });
            listThread.add(t);
        }

        for (Thread t:listThread) {
            t.start();
            t.join();
        }
    }
}
