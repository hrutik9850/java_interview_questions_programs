package LeedCode;
import java.util.HashSet;
import java.util.Set;

public class CountDonotRepetated_Character {
     public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0, right = 0, maxLength = 0;
        Set<Character> set = new HashSet<>();

        while (right < n) { // Iterate through the string
            // Check if the character at the right pointer is not in the set
            if (!set.contains(s.charAt(right))) {   // Check if the character is not in the set
                // If not, add it to the set
                set.add(s.charAt(right));// Add the character to the set
                // Update the maximum length of substring
                maxLength = Math.max(maxLength, right - left + 1);// Update maxLength
                // Move the right pointer to the next character
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }
    public static void main(String[] args) {
        String str = "abcabcbb";
        CountDonotRepetated_Character obj = new CountDonotRepetated_Character();
        int result = obj.lengthOfLongestSubstring(str);
        System.out.println("Length of longest substring without repeating characters: " + result);
        str="pwwkew";
        result = obj.lengthOfLongestSubstring(str); 
        System.out.println("Length of longest substring without repeating characters: " + result);
        str="";
        result = obj.lengthOfLongestSubstring(str);     
        System.out.println("Length of longest substring without repeating characters: " + result);
        str=" ";
        result = obj.lengthOfLongestSubstring(str);
        System.out.println("Length of longest substring without repeating characters: " + result);
    }
}
