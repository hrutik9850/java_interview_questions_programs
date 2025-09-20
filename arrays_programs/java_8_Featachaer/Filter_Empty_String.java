package java_8_Featachaer;
import java.util.stream.*;
import java.util.Arrays;
import java.util.List;
public class Filter_Empty_String{
	public static void main(String[]args){
		List<String >data = Arrays.asList("abc" ," " , "xyz" ," " ,"sbi");
		List<String > filterEmpty  = data .stream()
				.filter(s -> !s.isEmpty())
				.collect(Collectors.toList());
		System.out.println("find the empty string and remove the string ");
		for( String str : filterEmpty){
			System.out.print(str+ "\t");
		}
	}
}