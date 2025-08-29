package java_Topik_program.Muitithreading;
public class Text01 {
    public static void main(String[] args) {
        System.out.println("Text01");
		MyThreed mythreed = new MyThreed();
		mythreed.start();
		System.out.println("MyThreed started");
		MyRunnable myrunnable = new MyRunnable();
		Thread threed = new Thread(myrunnable :: run);//
        threed.start();
      System.out.println(" main "+Thread.currentThread().getName()+ Thread.currentThread().getId()              );
    } 
}
