public class TowArrayCommanFindComanElements{
    public char[] findCommonElements(char [] arr1, char[ ] arr2){
        char[] common = new char[arr2.length];
        int index =0 ;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i] == arr2[j]) {
                       common[index] = arr1[i];
                        index++;
                        // mark the character as counted by setting it to '\0'
                        
                    }
                    
                
               
            }
        }
        return common;
    }
public static void main(String[] args) {
    char[] arr1 = {'a', 'b', 'c', 'd', 'e'};
    char[] arr2 = {'c', 'd', 'a', 'f', 'g'};
    
    TowArrayCommanFindComanElements obj = new TowArrayCommanFindComanElements();
    char[] commonElements =  obj.findCommonElements(arr1, arr2);
    System.out.println("Common elements are: ");
    for (char c : commonElements) {
        if (c != '\0') { // print only non-null characters
            System.out.print(c + " ");
        }
    }
}
    
}
