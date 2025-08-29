package java_Topik_program.Muitithreading;
public class Text23_GetThredStates {
    public static void main(String[] args) throws InterruptedException {
        MyThread_Application23 mt = new MyThread_Application23();
        System.out.println("Before start thread state is : " + mt.getState());
        
        mt.start();
        
        System.out.println("After start thread state is : " + mt.getState());
        
       Thread.sleep(10000);
        
        System.out.println("After thread end state is : " + mt.getState());
        Thread.sleep(6000);
        System.out.println("After thread end state is : " + mt.getState());
        
    }

    
}
