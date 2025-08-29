package java_Topik_program.Muitithreading;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


import java.util.concurrent.TimeUnit;
public class Bank_locks_Multithreading {
    public  double blance = 1000;
    private final Lock lock = new ReentrantLock();
    public void withdraw(double amount){
        try {
            if (lock.tryLock(3, TimeUnit.SECONDS)) {
                try {
                    if (amount <= blance) {
                        blance -= amount;
                        System.out.println("Withdrew: " + amount + ", New Balance: " + blance);
                        Thread.sleep(10000); // Simulating some processing time
                    } else {
                        System.out.println("Withdrawal of " + amount + " failed, insufficient funds. Current Balance: " + blance);
                    }
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Could not acquire lock, withdrawal of " + amount + " failed.");
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
      
            
    

    }
}
