package concurrency.synchronization;

public class Table {
    synchronized void printTable(int n) {
        for (int i = 1; i < 6; i++) {
            System.out.println(n * i);
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
