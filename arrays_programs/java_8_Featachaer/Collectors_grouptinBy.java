
package java_8_Featachaer;
import java.util.*;
import java.util.stream.Collectors;
import java.util.List;
class Collectors_grouptinBy{
	public static void main(String[]args){
	List <String> items = Arrays.asList("apple","bat" , "cat" ,"banana");
	Map< Integer,List<String>> group  = items.stream()
			.collect(Collectors.groupingBy(String::length));
	System.out.println(group);
 	}
}