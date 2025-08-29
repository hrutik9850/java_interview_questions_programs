public class Test25_priority{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main start");
        MyThread25 mt = new MyThread25();
        MyThread25 mt1 = new MyThread25();

       mt.setPriority(8);
       mt1.setPriority(9);
        mt.start();
        mt1.start();    
        System.out.println("main end ");
    }
}