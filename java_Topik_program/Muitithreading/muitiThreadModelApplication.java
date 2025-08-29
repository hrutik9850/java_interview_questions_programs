package java_Topik_program.Muitithreading;
public class muitiThreadModelApplication extends Thread {
    static  DoubleThredModel_Printing print = new DoubleThredModel_Printing();
    public void run(){
        print.print100To1();
    }
    public static void main(String[] args){
        muitiThreadModelApplication model = new muitiThreadModelApplication();
        long time1  = System.currentTimeMillis();
        model.start();
        print.print1To100();
        long time2 = System.currentTimeMillis();
        System.out.println("Execution time: " + (time2 - time1) + " milliseconds");
    }
    
}
