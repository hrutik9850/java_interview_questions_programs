package java_Topik_program.Muitithreading;
public class MyRunnable {
    public void run( ){
	System.out.println("MyRunnable run() whout parameter");
        this.run(22);
          
            System.out.println("thred name: " + Thread.currentThread().getName());
            System.out.println("thred id: " + Thread.currentThread().getPriority());
            
        }
    public void run(int i){
        System.out.println("MyRunnable run() with parameter: " + i);            
        System.out.println("Thread name: " + Thread.currentThread().getName());
        System.out.println("Thread ID: " + Thread.currentThread().getId()); 
        System.out.println("Thread priority: " + Thread.currentThread().getPriority());
    }
	
}
