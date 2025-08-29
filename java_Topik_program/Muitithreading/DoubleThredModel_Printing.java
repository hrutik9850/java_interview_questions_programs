package java_Topik_program.Muitithreading;

import java.util.function.DoubleBinaryOperator;

public class DoubleThredModel_Printing  {
   

         public void print1To100(){
        for(int i = 1; i <= 100; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100); // Sleep for 100 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void print100To1(){
        for(int i = 100; i >= 1; i--) {
            System.out.println(i);
            try {
                Thread.sleep(100); // Sleep for 100 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
