
public class Secand_larg {

    public int max(int[] array){
        int max = 0;

       for(int i = 0 ;i < array.length -1 ;i++){
        if (array[i] >= max) {
            max = array[i];
   
        }
        
    }
  
       return max;

    }
   public  int smax(int[] array){
   int smax = 0;

    for(int i = 0 ;i < array.length -1 ;i++){
        if (array[i] < max(array)) {
          
            if (array[i] >= smax) {
                smax = array[i];
                
            }
 
        }
       
    }
    return smax;
   }


    public static void main(String args[]){
        int[] array ={3,2,4,1,2,3,'a',2,3,110,2,3};
        Secand_larg sl = new Secand_larg();
      System.out.println("secand smax value find :"+ sl.smax(array));


    }
    
}
