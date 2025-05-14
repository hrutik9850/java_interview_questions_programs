public class Vowels {
    public static void main(String[] args) {
        String  name = "hrutik";
        char[] ch = name.toCharArray();
        for(int i =0 ; i < ch.length ;i++){
            
          if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' ||
        ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
        // it's a vowel
                System.out.println("thise is a vowels :"+ch[i]);
              }
            }


            //next code formate simple way
            for (char c : ch) {
                if ("aeiou".indexOf(Character.toLowerCase(c)) != -1) { // Check if the character is a vowel (case insensitive)
                    System.out.println("This is a vowel: " + c);
                }
            }
        }
}
