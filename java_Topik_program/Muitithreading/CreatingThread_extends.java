package java_Topik_program.Muitithreading;
public class CreatingThread_extends extends Thread {
    @Override 
    public void run(){
        System.out.println("Thread is created By Extending Thread Class");
        for(int i = 0 ;i < 20;i++){
            System.out.println("Thread is running " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args){
        //creating an Object of the class
        CreatingThread_extends thread = new CreatingThread_extends();
        //starting the thread
        System.out.println("Thread is created");
        thread.start();
    }
}
