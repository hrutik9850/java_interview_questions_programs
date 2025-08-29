package java_Topik_program.Muitithreading;
public class MyThreed extends Thread {
    	public void run(){
            this.run(22);
	System.out.println("MyThreed run() whout parameter");
	}
    public void run(int i){
        System.out.println("MyThreed run() with parameter: " + i);
        System.out.println("Thread name: " + Thread.currentThread().getName());
        System.out.println("Thread ID: " + Thread.currentThread().getId());
        System.out.println("Thread priority: " + Thread.currentThread().getPriority());
    }   
}
