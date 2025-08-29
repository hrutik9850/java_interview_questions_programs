package java_8_Featachaer;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StringAPI01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
            list.add("hello");
            list.add("world");
            list.add("java");
            list.add("java8");
            list.add("java9");
            list.add("java10");
       
        Stream<String> stream = list.stream();
        stream
        .filter(s -> s.startsWith("j"))
        .map(s -> s.toUpperCase())
        .forEach(System.out::println);

        int a = 10;
       Stream<Integer> stream1  = Stream.of(a);
        stream1 
        .filter(i -> i > 5)
        .map(i-> i.compareTo(10))
        .forEach(System.out::println);

        int [] arr ={20,30,40,50,60};
        IntStream stream2 = Arrays.stream(arr);
        stream2
        .filter(i -> i > 30)
        .map(i -> i -23)
        .filter(i -> i > 6)
        .forEach(System.out::println);

    }
    
}
