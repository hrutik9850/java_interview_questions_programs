 package string_program;

class Revers_string {
   /*  public static String reverseString(String st) { // This method reverses the input string
        return new StringBuilder(st).reverse().toString();// StringBuilder is used to reverse the string
    } */
    public static String reverseString(String st){
        char[] charArray = st.toCharArray();
        String reversedString = "";
        for (int i = charArray.length - 1; i >= 0; i--) { // Loop to reverse the string
            reversedString += charArray[i]; // Concatenate characters in reverse order
        }
        return reversedString; // Return the reversed string
    }
     
    public static void main(String[] args){
        String str = "Hello World";
        String reversedStr = reverseString(str);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
    }

    
}