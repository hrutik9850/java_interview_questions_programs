
import java.util.Arrays;
public class sort_Without {
    
    public static void main(String[] args) {
        int[] al = new int[]{50, 4, 3, 44, 3, 24, 2, 33, 42};

        int n = al.length;
        // Bubble Sort logic
        for (int i = 0; i < n - 1; i++) {  // Number of passes
            for (int j = 0; j < n - i - 1; j++) {  // Compare adjacent elements
                if (al[j] > al[j + 1]) {
                    // Swap elements
                    int temp = al[j];
                    al[j] = al[j + 1];
                    al[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        for (int i : al) {
            System.out.println(i);
        }
       
    }
}
    

