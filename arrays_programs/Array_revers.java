import java.util.Arrays;
import java.lang.reflect.Array;
public class Array_revers  {
    // Function to reverse an array
    // public void reverseArray( int[] arr) {
    //     if (arr == null || arr.length== 0) {
    //         throw  new  IllegalArgumentException("Array cannot be null or empty");
            
    //     }
    //     Integer[] reversedArray = new Integer[arr.length];
    //     int j = arr.length - 1;
    //     for (int  i =0 ; i < arr.length; i++){
    //         reversedArray[i] = arr[j];
    //         j--;
    //     }
    //     for(int i :  reversedArray){
    //         System.out.println(i);
    //     }
        public static <T> T[] reverseArray(T[] array) {
            if (array == null || array.length == 0) {
                throw new IllegalArgumentException("Array cannot be null or empty");
            }
    
            @SuppressWarnings("unchecked")
            T[] reversedArray = (T[]) Array.newInstance(array.getClass().getComponentType(), array.length);
            
            for (int i = 0; i < array.length; i++) {
                reversedArray[i] = array[array.length - 1 - i];
            }
    
            return reversedArray;
        }
       
         
        public static void main(String []args){
        Integer[] arr = {1, 2, 3, 4, 5};
        Array_revers obj = new Array_revers();
        Integer[]  newarray = obj.reverseArray(arr);
        for (int i : newarray) {
            System.out.println(i);
        }
        String[] strArr = {"Apple", "Banana", "Cherry"};
        String[] reversedStrArr = reverseArray(strArr);
        for (String s : reversedStrArr) {
            System.out.println(s);
        }

    }
}