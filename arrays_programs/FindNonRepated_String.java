

// Find the non repeated string in a given string
public class FindNonRepated_String {

    public char[] findRepeatedString(String str) {
        char[] ch = str.toCharArray();
        char[] repeated = new char[ch.length];
        int index = 0;

        for (int i = 0; i < ch.length; i++) {
            int counter = 0;
            if (ch[i] != '\0') { // check if the character is not already counted
                // count the number of times the character appears in the string
                for (int j = i; j < ch.length; j++) {
                    if (ch[i] == ch[j]) {
                        counter++;
                    }
                }
                if (counter > 1) {
                    repeated[index] = ch[i];
                    index++;
                }
            }
        }
        return repeated;
    }

    public char[] findNoRepeatedString(String str) {
        char[] ch = str.toCharArray();
        char[] nonRepeated = new char[ch.length];
        int index = 0;

        for (int i = 0; i < ch.length; i++) {
            int counter = 0;
            if (ch[i] != '\0') { // check if the character is not already counted
                // count the number of times the character appears in the string
                for (int j = 0; j < ch.length; j++) {
                    if (ch[i] == ch[j]) {
                        counter++;
                    }
                }
                if (counter < 2) {
                    nonRepeated[index] = ch[i];
                    index++;
                }
            }
        }
        return nonRepeated;
    }


    public static void main(String[]args){
        FindNonRepated_String obj = new FindNonRepated_String();
        String str = "hello world hello";
       char[] repeated = obj.findRepeatedString(str);   
        System.out.println("Repeated characters are: ");
        for (char c : repeated) {
            if (c != '\0') { // print only non-null characters
                System.out.print(c + " ");
            }
        }
        System.out.println();
        char[] nonRepeated = obj.findNoRepeatedString(str);
        System.out.println("Non Repeated characters are: ");
        for (char c : nonRepeated) {
            if (c != '\0') { // print only non-null characters
                System.out.print(c + " ");
            }
        }
    }
    
}
