// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class TargetElementSume {

    public void combinationSume(int[] arr , int target){
        List<Integer > curent  = new ArrayList();
        List<List<Integer>> result = new  ArrayList();
         this.backtrack(arr,  target,0 ,curent,result);
        for(List<Integer> n : result){
            System.out.println(n);
        }

        };

    public void backtrack(int[]arr,int target,int index, List<Integer> curent, List<List<Integer>> result){
        if(target == 0){
            result.add(new ArrayList<>(curent));
            return ;

        }
        if(target < 0 ||index == arr.length){
            return;
        }
        curent.add(arr[index]);
        backtrack(arr, target -arr[index], index+1, curent, result);
        curent.remove(curent.size()-1);
        backtrack(arr, target, index+1, curent, result);
    }


    // this is the 2 element some are comming in to the target 
    public static void arraysume(int[] aray ,int lent, int target){
    
      
      for(int i =0 ;i< lent;i++){
        int n =0;
    
        for (int j = i +1 ;j< lent; j++){
       
             n =aray[i] +aray[j];
       
            if(n == target){
                System.out.print(aray[i] +" "+aray[j]+" ");
        }
           
        }
        System.out.println();
        }
    }
    public static void main(String[] args) {
        TargetElementSume targetElementSume = new TargetElementSume();
     
        int[] arr = {3,2,3,4,1,4,6,};
        int lent = arr.length-1;
        targetElementSume.combinationSume(arr, 6);
     //   arraysume(arr,lent,6);
       
    }
}