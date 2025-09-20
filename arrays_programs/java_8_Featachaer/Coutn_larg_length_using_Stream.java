package java_8_Featachaer;
import java.util.stream.*;
import java.util.Arrays;
import java.util.List;
public class Coutn_larg_length_using_Stream{
	public static void main(String[]args){
		List< String > data = Arrays.asList("the" , "some"," which ", "something ", " application");
		long count = data.stream()
			.filter(s -> s.length() > 5)
			.count();
		System.out.println("how mumch element that length gether the 5 :  "+ count);

	}
}