package concurrency.thread_safe_with_collection.concurrent_hash_map;

import java.util.concurrent.ConcurrentHashMap;

public class AddTask implements Runnable{
    private final ConcurrentHashMap<Integer, String> map;

    public AddTask(ConcurrentHashMap<Integer, String> map) {
        this.map = map;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            map.put(i, Thread.currentThread().getName());
            System.out.println("Thread " + Thread.currentThread().getName() + " added " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
