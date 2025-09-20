package java_8_Featachaer;
import java.util.*;
import java.util.stream.Collectors;
import java.util.List;

public class Secand_hight_number_Stream{
	public static void main(String [] args){
		List< Integer> num = Arrays.asList(2,3,44,3,2,4,32,21,32,43,2,34,23,14,53);
		Optional<Integer> filter = num .stream()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst();
		System.out.println(filter.orElse(null));
	}	
}