package LeedCode;

import java.util.HashMap;
import java.util.Arrays;
public class Add_TwoNumber_Array_Sum_target {
    public static int[] addtoSumm(int[] numm , int taget){
        int[] newnumm = new int[2];
        HashMap<Integer ,Integer > map = new HashMap();
         Arrays.sort(numm); // sort the array to use two-pointer technique
        int n = numm.length;
        for( int i =0 ; i < numm.length; i++){
            while(true){
                int complement = taget - numm[i]; // calculate the complement of the current number
                if (map.containsKey(complement)) { // check if the complement exists in the map
                    newnumm[0] = map.get(complement); // get the index of the complement from the map
                    newnumm[1] = i; // store the index of the current number
                    return newnumm; // return the indices of the two numbers that add up to target
                }
                map.put(numm[i], i); // store the index of the current number in the map

            }
             // store the index of the current number in the map
        }
        return newnumm;
    }
    public static void main(String[] args) {
        int[] numm = {2, 7, 11, 15};
        int taget = 9;
        int[] result = addtoSumm(numm, taget);
        System.out.println("Result: " + Arrays.toString(result)); // Output: [0, 1]
        
    }
    
}
