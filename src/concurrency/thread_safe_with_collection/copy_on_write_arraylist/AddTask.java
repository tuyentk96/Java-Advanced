package concurrency.thread_safe_with_collection.copy_on_write_arraylist;


import java.util.concurrent.CopyOnWriteArrayList;

public class AddTask implements Runnable{
    private final CopyOnWriteArrayList<String> list;

    public AddTask(CopyOnWriteArrayList<String> list) {
        this.list = list;
    }


    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            list.add(Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
