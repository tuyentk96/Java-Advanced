package concurrency.thread.priority_thread;

public class PriorityThreadExample extends Thread {
    public void run() {
        System.out.println("Running thread name is " + Thread.currentThread().getName());
        System.out.println("Running thread priority is " + Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        PriorityThreadExample thread1 = new PriorityThreadExample();
        PriorityThreadExample thread2 = new PriorityThreadExample();

        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
    }
}
