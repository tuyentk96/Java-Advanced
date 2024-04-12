package concurrency.thread_safe_with_collection.copy_on_write_arraylist;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        Thread thread1 = new Thread(new AddTask(list));
        Thread thread2 = new Thread(new AddTask(list));



        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("CopyOnWriteArrayList: " + list);
    }
}
