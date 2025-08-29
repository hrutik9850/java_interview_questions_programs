package java_Topik_program.Muitithreading;
public class MyThread_MultUser extends Thread {
    int x;
	public void setx(int x){
		this.x =x;
	}		
	public void run(){
        System.out.println("MyThread_MultUser run() with parameter: " + x);
		for(int i =0 ;i < this.x ;i ++){
				System.out.println(Thread.currentThread().getName()+"run"+i);
			}
	}
}
