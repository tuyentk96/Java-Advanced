package concurrency.thread.create_thread;

public class ExtendsThreadExample extends Thread {
    public void run() {
        System.out.println("Thread is running....");
    }
    public static void main(String[] args) {
        ExtendsThreadExample thread = new ExtendsThreadExample();
        thread.start();
    }
}
