package LeedCode;

public class longestCommanPrifix {
   
       public  static String longestCommonPrefix(String[] strs) {
       if (strs == null || strs.length == 0) return "";
    
    String prefix = strs[0];
    System.out.println(prefix);
    
    for (int i = 1; i < strs.length; i++) {

        while (strs[i].indexOf(prefix) != 0) { // Check if the current string starts with the prefix
            System.out.println("prefix: " + prefix);
            prefix = prefix.substring(0, prefix.length() - 1); // Reduce the prefix by one character from the end
            System.out.println("Updated prefix: " + prefix);
         
            if (prefix.isEmpty()) return "";
        }
       
    }
    return prefix;
    }
    public static void main(String[] args) {
       String[]  strs = {"flower","flow","flight"};
     String repit =   longestCommanPrifix.longestCommonPrefix(strs);
     System.out.println(repit);
    }
}
    
// Output: "fl"
// Explanation: The longest common prefix among the strings "flower", "flow", and "flight" is "fl".
