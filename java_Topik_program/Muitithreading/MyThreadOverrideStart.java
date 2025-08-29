package java_Topik_program.Muitithreading;
public class MyThreadOverrideStart {
    public static void main(String [] ags){ 
		System.out.print("Main class started  super class object created");
		OverrideStart start = new OverrideStart();
		start.start();
		System.out.print("end the main");
	}
}
