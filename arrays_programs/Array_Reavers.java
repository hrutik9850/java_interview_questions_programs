import java.util.ArrayList;

public class Array_Reavers {
     int[] Array_Reavers_Size(int [] arr , int size ){
      int[] temp = new int[arr.length];
        int n = arr.length;
        for (int i =0 ;i<arr.length;i++){
            temp[i] = arr[n-i-1];

        }
        return temp;
     }
    
    public static void main(String[] args){
        int[] arr = {23, 44, 55, 2, 5, 66, 77, 1};
        for ( int i : arr){
            System.out.print(i+" ");
        }
        System.out.println("\n===============================");

        int array_Reavers_size  = 2 ;
        Array_Reavers ar = new Array_Reavers();
      int[] newArray =  ar.Array_Reavers_Size(arr, array_Reavers_size);

      for ( int i : newArray){
        System.out.print(i+" ");
    }

    }
}
