package concurrency.thread_safe_with_collection.concurrent_hash_map;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();

        Thread thread1 = new Thread(new AddTask(concurrentHashMap));
        Thread thread2 = new Thread(new AddTask(concurrentHashMap));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("ConcurrentHashMap :" + concurrentHashMap);
    }
}
