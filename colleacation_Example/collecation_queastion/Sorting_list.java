package colleacation_Example.collecation_queastion;
import java.util.*;

public class Sorting_list {
    
    public static void main(String[] args){
    List <String> list  = new ArrayList();
    list.add("mohit");
    list.add("karan");
    list.add("sachin");
    list .add("shubham");
    list.add("kartika");
    list.add("Ankusha");
    list.add("Arpitya");

    System.out.println("Before sorting :"+list);

        Collections.sort(list);
        System.out.println("After sorting :"+list);
        


    }
}
