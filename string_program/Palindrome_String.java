package string_program;

public class Palindrome_String {


    public static boolean isPalindrome(String str){
        int left =0 ;
        int right = str.length()-1;
        
      
        while(left < right){    //// Loop to check if the string is a palindrome
            if(str.charAt(left)!= str.charAt(right)){// if the characters at the left and right indices are not equal
                System.out.println("The string is not a palindrome.");
                return false;
            }
                left++;
                right--;       }
        

        return true;
    }
    public static void main(String[] args){
        System.out.println( new Palindrome_String().isPalindrome("mkljm"));
        System.out.println( new Palindrome_String().isPalindrome("madam"));

    }
    
}
