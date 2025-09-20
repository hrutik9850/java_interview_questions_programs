import java.util.Arrays;
import java.util.List;
class String_counting_with_Streme{
	public static void main(String[] args){
		   List<String > str = Arrays.asList("Appli", "Bannag","boole");
		long count  = str.stream()
         		.flatMapToInt(String::chars) 
		.filter(ch -> ch  == 'a' || ch == 'A')
		.count();
		System.out.println("how mucha time acurd in the "+ count );

	}
}