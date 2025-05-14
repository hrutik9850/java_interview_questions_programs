
public class ReversEatcahString_OneSeantese {
    public static String reverseString(String  str){
      String [] words = str.split(" ");
        StringBuilder reversed = new StringBuilder();   // create a StringBuilder to hold the reversed string
      for(int i =0 ; i < words.length  ;i++){
        StringBuilder sb = new StringBuilder(words[i]);// create a StringBuilder for each word
        sb.reverse();           // reverse the word// reverse the word using StringBuilder's reverse method
        reversed.append(sb.toString()).append(" "); // append the reversed word and a space
      }
      return reversed.toString().trim(); // remove the trailing space
    }
    public static void main(String[] args) {
        String str = "Hello World! This is a test string.";
        String reversed = reverseString(str);
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversed);
    }
}
