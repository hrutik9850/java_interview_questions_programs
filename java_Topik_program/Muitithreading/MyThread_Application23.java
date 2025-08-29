package java_Topik_program.Muitithreading;
public class MyThread_Application23 extends Thread {
    public void run(){
        System.out.println("Thread is running");
        System.out.println("From run methods mt state after start cll : "+this.getState());
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thred is end and state is : "+this.getState());
    }
    
}
