package concurrency.thread_safe_with_collection.synchronization;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizationExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        List<String> listSynchronized = Collections.synchronizedList(list);

        Thread thread1 = new Thread(new AddTask(listSynchronized));
        Thread thread2 = new Thread(new AddTask(listSynchronized));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Synchronized List: " + listSynchronized);
    }
}
