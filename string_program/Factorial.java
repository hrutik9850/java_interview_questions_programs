package string_program;
import java.util.Scanner;
public class Factorial {
    public int factorial(int ft){
        
        if(ft == 0 || ft==1 ){
         return 1;
        
        }else {
            return ft * factorial(ft-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        System.out.println("Enter the elements which element factorial :");
        Scanner  scan = new Scanner(System.in);

        int n = scan.nextInt();
       System.out.println( new Factorial().factorial(n));
    }
    
}
