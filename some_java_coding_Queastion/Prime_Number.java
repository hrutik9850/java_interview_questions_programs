import java.util.*;
public class Prime_Number{
    public static  boolean primeNumber(int a){
       
        if(a <=1)return false ; // check if the number is less than or equal to 1

        for (int i = 2; i <= Math.sqrt(a); i++) {  // check for divisors from 2 to sqrt(a)
            if (a % i == 0) {
                return false;  // Found a divisor, not prime
            }
        }
     return true; // No divisors found, it is prime; 

    }
    public static void main(String  []args){
        System.out.println("Enter a number to check if it is prime or not :");
        Scanner  scan = new Scanner(System.in);
        int a = scan.nextInt(); // read the number from the user
        System.out.println(Math.sqrt(a));
        boolean result =Prime_Number.primeNumber(a);// call the primeNumber method
        if (result) {
            System.out.println(a + " is a prime number.");
        } else {
            System.out.println(a + " is not a prime number.");      
            
        }
        System.out.println();


    }

}