package DSA;




/**  Worst Case Complexity:
 In each step, the array is divided by 2
 Max comparisons = log₂(n) = log₂(8) = 3 steps
 Hence, worst-case time complexity = O(log n)
*/

public class BinarySearchExample {
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            System.out.println("Checking index: " + mid + ", value: " + arr[mid]);

            if (arr[mid] == target) {
                return mid; // target found
            } else if (arr[mid] < target) {
                low = mid + 1; // search right half
            } else {
                high = mid - 1; // search left half
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        int[] numbers = {5, 8, 12, 15, 19, 23, 27, 31};
        int target = 23;

        int result = binarySearch(numbers, target);

        if (result != -1) {
            System.out.println("Element " + target + " found at index: " + result);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
