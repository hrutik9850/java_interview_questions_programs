package string_program;
public class Prime_Number{
    public static boolean isPrime(int n ){
        if (n <=1)return false; 
        for (int i =2 ;i<= Math.sqrt(n);i++){
            if(n % i == 0)  return true;
        }
            
         return true; // If no divisors were found, the number is prime
            
    }
        
    public static void main(String [] args){
    System.out.println("Enter a number to check if it is prime:");
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    int number = scanner.nextInt(); // Read an integer from user input       
   System.out.println("checked the number isPrime or not := " + isPrime(number)); // Call the isPrime method to check if the number is prime

    }
}