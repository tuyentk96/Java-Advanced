package concurrency.thread.sleep_thread;

public class SleepThreadExample extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        SleepThreadExample thread1 = new SleepThreadExample();
        SleepThreadExample thread2 = new SleepThreadExample();

        thread1.start();
        thread2.start();
    }
}
