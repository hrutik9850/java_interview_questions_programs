package java_Topik_program.Muitithreading;
public class Text24_isAliveDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThreadApplication24 mt = new MyThreadApplication24();
        System.out.println("Before start mt state: " + mt.isAlive());
        mt.start();
        System.out.println("After start : " + mt.isAlive());
        Thread.sleep(5000);
        System.out.println("After sleep mt state: " + mt.isAlive());
         Thread.sleep(6000);
        System.out.println("After sleep mt state: " + mt.isAlive());
    }
}
