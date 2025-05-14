import java.util.Arrays;

public class MinMaxFinder {
    public static void main(String[] args) {
        int arr[] = {23, 44, 55, 2, 5, 66, 77, 1};

        int n = arr.length;
        int maxvalue = arr[0];
        int minvalue = arr[0]; // Fixed the typo from "minvaliue" to "minvalue"

        // Iterate through the array once
        for (int i = 1; i < n; i++) {
            maxvalue = Math.max(maxvalue, arr[i]);
            minvalue = Math.min(minvalue, arr[i]);
        }

        System.out.println("The min value is " + minvalue);
        System.out.println("The max value is " + maxvalue);





        // Using Java 8 Streams to find min and max

        int min = Arrays.stream(arr).min().orElseThrow(); // Finds min
        int max = Arrays.stream(arr).max().orElseThrow(); // Finds max

        System.out.println("Min: " + min); // Output: Min: 1
        System.out.println("Max: " + max); // Output: Max: 77
    
    }
}
