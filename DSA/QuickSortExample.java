package DSA;

public class QuickSortExample {
    
    // Main function to test the QuickSort
    public static void main(String[] args) {
        int[] arr = { 35, 10, 55, 20, 5, 90, 70 };
        System.out.println("Before sorting:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println(arr.length - 1);
        System.out.println("After sorting:");
        printArray(arr);
    }

    // QuickSort function
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Find pivot index after partitioning
            int pivotIndex = partition(arr, low, high);

            // Recursively sort the two subarrays
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Partition function
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // choosing the last element as pivot
        int i = low - 1; // pointer for smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                System.out.println(temp);
                arr[i] = arr[j];
                System.out.println(arr[i]);

                arr[j] = temp;
                System.out.println(arr[j]);

            }
        }

        // swap arr[i+1] and pivot (arr[high])
        int temp = arr[i + 1];
        System.out.println(temp);

        arr[i + 1] = arr[high];
        System.out.println( arr[i + 1]);

        arr[high] = temp;
        System.out.println( arr[high]);


        return i + 1; // return the partitioning index
    }

    // Utility function to print array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

    

