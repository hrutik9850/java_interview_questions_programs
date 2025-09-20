package java_8_Featachaer;

public class CharacterFrequency {
    public static void main(String[]args){
        String str = "java is a programming language";
        char traget = 'a';
        long count = str.chars()
                .filter(ch -> ch == traget)
                .count();
        System.out.println("the character "+ traget + " is present in the string : " + count + " times");
    }
    
}
