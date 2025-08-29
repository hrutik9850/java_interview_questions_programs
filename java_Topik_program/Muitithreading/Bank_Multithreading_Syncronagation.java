package java_Topik_program.Muitithreading;

public class Bank_Multithreading_Syncronagation {
    private int balance = 1000;

  

    public synchronized void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
            try {
                // Simulating some processing time
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
            

        } else {
            System.out.println("Withdrawal of " + amount + " failed, insufficient funds. Current Balance: " + balance);
        }
    }

    
}
