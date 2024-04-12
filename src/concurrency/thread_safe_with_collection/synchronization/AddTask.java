package concurrency.thread_safe_with_collection.synchronization;

import java.util.List;

public class AddTask implements Runnable{
    private final List<String> list;

    public AddTask(List<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (list) {
                list.add(Thread.currentThread().getName() + " - " + i);
            }
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
