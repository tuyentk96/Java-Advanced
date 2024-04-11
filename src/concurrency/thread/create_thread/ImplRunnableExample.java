package concurrency.thread.create_thread;

public class ImplRunnableExample implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running....");
    }

    public static void main(String[] args) {
        ImplRunnableExample implRunnableExample = new ImplRunnableExample();
        Thread thread = new Thread(implRunnableExample);
        thread.start();
    }
}
