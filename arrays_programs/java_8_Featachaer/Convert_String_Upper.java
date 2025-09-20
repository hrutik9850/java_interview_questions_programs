package java_8_Featachaer;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
 class Convert_String_Upper{
	public static void main(String [] args){
		
		List<String> name  = Arrays.asList(" java", "Stream", "api");
		List<String > upperString =  name  .stream()
					.map(String :: toUpperCase)
					.collect(Collectors.toList());
		System.out.println("converting the upper case String using Streams Api"+ upperString);
	}
}