package java_Topik_program.Muitithreading;
public class MyThreadApplication24 extends Thread {
    public void run(){
        System.out.println("Thread is running");
        System.out.println("From run method mt state afer start call: "+this.isAlive());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    };
    
}
