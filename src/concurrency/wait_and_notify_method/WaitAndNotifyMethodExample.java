package concurrency.wait_and_notify_method;

public class WaitAndNotifyMethodExample {
    public static void main(String[] args) {
        final Customer customer = new Customer();
        new Thread(){
            public void run(){
                customer.withdraw(15000);
            }
        }.start();
        new Thread(){
            public void run(){
                customer.deposit(10000);
            }
        }.start();
    }
}
