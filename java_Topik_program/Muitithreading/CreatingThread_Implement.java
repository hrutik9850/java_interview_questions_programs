package java_Topik_program.Muitithreading;

public class CreatingThread_Implement implements Runnable{

@Override
public void run(){
    System.out.println("Thread is created By Implementing Runnable Interface");
    for(int i = 0 ;i < 20;i++){
        System.out.println("Thread is running " + i);
        try {
            Thread.sleep(1000); // Sleep for 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
            
        }
    }
}
public static void main(String[] arg){
 
    // creating a Obect of the class
    CreatingThread_Implement thread = new CreatingThread_Implement();
    // creating a Thread object and passing the Runnable object
    Thread t = new Thread(thread);
    t.start(); // starting the thread
   

}


}
