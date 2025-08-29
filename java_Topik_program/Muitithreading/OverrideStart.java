package java_Topik_program.Muitithreading;
public class OverrideStart extends Thread{
    @Override
    public void run(){
		System.out.println("OverrideStart run() method called");	
	}
    @Override
    public void start() {
        System.out.println("OverrideStart thread started");
        super.start();// Call the original start method to begin the thread execution
       // run(); // Directly call run() method to execute the thread logic
    }
    
}
