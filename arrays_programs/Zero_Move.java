public class Zero_Move {
    //Move eand of array all the elements to the eand of array;
    public int[] shipEandOf(int[] array , int value ){
       int[] temp = new  int[array.length];
       int  n = array.length;
       int j = 0; // to take how many number of data will be store 
       
        for(int num =0 ;num < array.length ;num++){
            //cop the other value in to temp array 
            if (array[num]!= value) {
                temp[j++] = array[num];
              //  System.out.println(array[num]);

            }
            
        }
        // and the add the last of value which are move to the last 
        while (j < n ){
            temp [j++] = value;

        }
        for(int num = 0 ; num < temp.length ; num++ ){
            array[num] = temp[num];
        }
        return array;
    }
    public static void main(String args[]){

        Zero_Move zm = new Zero_Move();
        int value =0;
        int[] array = {12,34,0,0,54,3,5,0};
        int[] newArray = zm.shipEandOf(array,value);
       for(int num = 0 ; num < newArray.length ; num++ ){
        System.out.print(newArray[num]+" ");
       }
    }
}
