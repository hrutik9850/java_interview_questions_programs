import java.util.*;
public class Secand_and_Thard {
    public int threed_last(int [] arr){
        Arrays.sort(arr);
       int n = arr.length;
        return arr[n-3];

    }
    public int secand_last(int [] arr){
        Arrays.sort(arr);
       int n = arr.length;
        return arr[n-2];


    }
    public static void main(String args[]){
        int[] arr = {2,33,44,2,12,43,54,33};
        for(int i : arr){
            System.out.print(i+" ");
        }
        Secand_and_Thard th = new Secand_and_Thard();
        System.out.println("thard max :"+ th.threed_last(arr));
        System.out.println( "secand max :"+th.secand_last(arr));

    }
}