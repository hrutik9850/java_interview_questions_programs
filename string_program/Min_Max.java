package string_program;

public class Min_Max {
    public static int  max(int [] arry){ // This method finds the maximum value in the array
        int max = arry[0]; // Initialize max with the first element of the array;
        for( int i =0 ;i <= arry.length -1 ;i++){
            if (arry[i] > max ){
                max = arry[i];
              
            }
          
            
        }
      return max; // Return the maximum value found in the array
        
    }
    public static int min(int [] arry){// This method finds the minimum value in the array
        int min = arry[0];  // Initialize min with the first element of the array
        for(int i =0 ; i <= arry.length -1 ;i++){
            if( arry[i] <= min){
                min = arry[i];
            }
           
        }
       return min; // Return the minimum value found in the array   
    }
    
          
  public static void main(String[] args) {
        int[] arry  ={22,4,5,3,4,-2,5,2,3,192,1};
        System.out.println("Max value is : " + Min_Max.max(arry)); // Call the max method to find the maximum value in the array
        System.out.println("Min value is : " + Min_Max.min(arry)); // Call the min method to find the minimum value in the array
      }
}
