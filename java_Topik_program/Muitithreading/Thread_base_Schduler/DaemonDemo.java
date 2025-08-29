public class DaemonDemo implements Runnable {

    Thread th ;
    DaemonDemo(){
        th = new Thread(this);
      //  th.setDaemon(true); // Setting the thread as a daemon thread
        th.start();
        System.out.println("Daemon thread started");

    } 
    @Override
    public void run() {
       System.out.println("Daemon thread is running"+th.isDaemon());
        for(int i =0 ; i <=100; i++){
            System.out.print("Daemon thread count: " + i + " ");
        }
    }
   

}
    

