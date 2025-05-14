package LeedCode;

import java.util.HashMap;

public class Roman_to_Integer {
     public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        s = s.toUpperCase(); // assign back
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = map.get(s.charAt(i));
            int next = (i + 1 < s.length()) ? map.get(s.charAt(i + 1)) : 0;

            if (current < next) {
                result -= current;
            } else {
                result += current;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Roman_to_Integer obj = new Roman_to_Integer();
        String s = "III";
        int result = obj.romanToInt(s);
        System.out.println("Roman numeral " + s + " is equal to " + result); // Output: 3
        s = "IV";
        result = obj.romanToInt(s);
        System.out.println("Roman numeral " + s + " is equal to " + result); // Output: 4
        s = "IX";
        result = obj.romanToInt(s);
        System.out.println("Roman numeral " + s + " is equal to " + result); // Output: 9
        s = "MCMXCIV";
        result = obj.romanToInt(s);
        System.out.println("Roman numeral " + s + " is equal to " + result); // Output: 1994
    }

}
