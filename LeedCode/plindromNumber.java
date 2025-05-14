package LeedCode;

public class plindromNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false; // Negative numbers are not palindromes
    
        int original = x;
        int reversed = 0;
    
        while (original != 0) { // Reverse the number
            // Get the last digit and add it to the reversed number
            int digit = original % 10;  // Get the last digit
            // Check for overflow before multiplying by 10
            reversed = reversed * 10 + digit;   // Add the last digit to the reversed number
            // Check for overflow before multiplying by 10
            original /= 10; // Remove the last digit from the original number
        }
    
        return reversed == x;
    }
    
    public static void main(String [] args){
        int x = -123;
       
        System.out.println(plindromNumber.isPalindrome(x));


    }
    
}
