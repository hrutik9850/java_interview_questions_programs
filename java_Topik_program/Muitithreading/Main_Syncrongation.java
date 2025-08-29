package java_Topik_program.Muitithreading;

public class Main_Syncrongation {
    public static void main(String[] args) {
        Bank_Multithreading_Syncronagation bank = new Bank_Multithreading_Syncronagation();
        Runnable th = new  Runnable(){
            @Override 
            public void run(){
                bank.withdraw(50);
                
            }
        };
        Thread t1 = new Thread(th);
        Thread t2 = new Thread(th);
        t1.start();
        t2.start();
    }
    
}
