public class Test30Demon {
    public static void main(String[] args) {
        DaemonDemo daemonDemo = new DaemonDemo();

        System.out.println("Main thread is running");
        for(int i =0 ;i<=100;i++){
            System.out.println(i+" ");;
        }
    }
    
}
