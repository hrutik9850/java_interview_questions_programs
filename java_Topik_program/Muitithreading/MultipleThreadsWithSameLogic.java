package java_Topik_program.Muitithreading;
public class MultipleThreadsWithSameLogic {
    public static void main(String[] args){
		MyThread_MultUser multuser = new MyThread_MultUser();
        multuser.setx(10);
        multuser.start();
        MyThread_MultUser multuser2 = new MyThread_MultUser();
       // multuser2.setx(20);
        multuser2.start();
		for(int i =0;i < 10; i++){
			System.out.println("main:"+i);
		}
	}
    
}
