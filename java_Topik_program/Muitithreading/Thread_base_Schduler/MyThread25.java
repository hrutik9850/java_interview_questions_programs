public class MyThread25 extends Thread{
    public void run(){
        System.out.println("Thread is running");
        try{
            this.sleep(5000);
        }
        catch( InterruptedException e){
            e.printStackTrace();
        }
    }    
}
