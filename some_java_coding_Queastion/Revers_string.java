
public class Revers_string {
   /*   it is a simple way to reverse a string in java
    public static String reverseString(String st) {
        return new StringBuilder(st).reverse().toString();// this is a simple way to reverse a string in java
    } */ 
    public static  String reverseString(String st){
        char[] chs = st.toCharArray(); // convert String to char array 
       int n = chs.length;
       String newString  = "";
       char[] newchar = new char[n]; // create a new char array of same length as original string
       // reverse the string using a loop
       int  index = 0;
       for(int i = n-1 ; i >= 0 ; i-- ){
           
         newchar[index] = chs[i];// assing the value of chs[i] to newchar[index]
         // newchar[index] = chs[i]; // assign the value of chs[i] to newchar[index]
         index++ ;
         
       }
       newString = String.valueOf(newchar);
       return newString;
   }
    public static void main(String [] args){
        String str = "Hello World!";
        String reversedStr = reverseString(str);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
    }
    
}
