import java.util.Map;
import java.util.HashMap;


public class CountFrequency_element {

     public static void main(String[] args){
        System.out.println("Count Frequency of each element in an array");
        int arr[] ; 
           arr = new int[]{1,2,3,4,5,4,3,2,2,1,1,2,3,2,3,2,3,2};
       
        CountFrequency_element.countFrequency(arr);

    }
    public static void countFrequency(int arr[]){
        int n = arr.length;
        Map<Integer,Integer> frequencMap = new HashMap<>();
        for(int i : arr){
            if(frequencMap.containsKey(i)!= true){
                frequencMap.put(i, 0);
            }
            else{
                frequencMap.put(i,frequencMap.get(i)+1);
            }
       
    }
    for(Map.Entry<Integer,Integer> entry : frequencMap.entrySet()){
        System.out.println("Key :"+ entry.getKey()+" values :"+entry.getValue());

    }
        
    }
        // for (int i :arr){
        //     frequencMap.put(i, frequencMap.getOrDefault(i, 0)+1);

        // }
        // for(Map.Entry<Integer,Integer> entry: frequencMap.entrySet()){
        //     System.out.println("Element: " + entry.getKey() + " Frequency: " + entry.getValue());
        // }

   // }
}
