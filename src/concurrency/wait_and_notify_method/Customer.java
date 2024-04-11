package concurrency.wait_and_notify_method;

public class Customer {
    int amount = 10000;
    synchronized void withdraw(int amount) {
        System.out.println("Withdrawing....");
        if (amount > this.amount) {
            System.out.println("Amount enough to withdraw, Waiting...");
            try{
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        this.amount -= amount;
        System.out.println("Withdraw complete...");
    }
    synchronized void deposit(int amount) {
        System.out.println("Depositing....");
        this.amount += amount;
        System.out.println("Deposit complete...");
        notify();
    }
}
