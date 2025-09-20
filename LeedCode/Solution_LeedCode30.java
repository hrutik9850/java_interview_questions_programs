import java.util.*;
class Solution_LeedCode30{

public static void main(String [] args){
String s ="barfoothefoobarman";
String[] word ={"foo","bar"};
Solution_LeedCode30 slc = new Solution_LeedCode30();
List<Integer> output = slc.findSubstring(s, word);
System.out.println(output);
}
 public List<Integer> findSubstring(String s, String[] words) {
       List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return result;
        }
        
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
        int wordLen = words[0].length();
        int totalLen = wordLen * words.length;
        
        for (int i = 0; i < wordLen; i++) { // start offset
            int left = i, right = i;
            int count = 0;
            Map<String, Integer> seen = new HashMap<>();
            
            while (right + wordLen <= s.length()) {
                String w = s.substring(right, right + wordLen);
                right += wordLen;
                
                if (wordCount.containsKey(w)) {
                    seen.put(w, seen.getOrDefault(w, 0) + 1);
                    count++;
                    
                    while (seen.get(w) > wordCount.get(w)) {
                        String leftWord = s.substring(left, left + wordLen);
                        seen.put(leftWord, seen.get(leftWord) - 1);
                        left += wordLen;
                        count--;
                    }
                    
                    if (count == words.length) {
                        result.add(left);
                    }
                } else {
                    seen.clear();
                    count = 0;
                    left = right;
                }
            }
        }
        
        return result;  
    }
}
/**
You are given a string s and an array of strings words. All the strings of words are of the same length.

A concatenated string is a string that exactly contains all the strings of any permutation of words concatenated.

For example, if words = ["ab","cd","ef"], then "abcdef", "abefcd", "cdabef", "cdefab", "efabcd", and "efcdab" are all concatenated strings. "acdbef" is not a concatenated string because it is not the concatenation of any permutation of words.
Return an array of the starting indices of all the concatenated substrings in s. You can return the answer in any order.

 

**/