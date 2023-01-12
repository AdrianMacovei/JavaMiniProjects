import java.util.Arrays;
import java.util.Random;

public class MergeSortAlgo {

    public static void mergeSort(int[] array) {
        if (array.length > 1) {
            // Split the array in half
            int[] left = Arrays.copyOfRange(array, 0, array.length / 2);
            int[] right = Arrays.copyOfRange(array, array.length / 2, array.length);

            // Sort each half
            mergeSort(left);
            mergeSort(right);

            // Merge the halves back together
            merge(array, left, right);
        }
    }

    private static void merge(int[] array, int[] left, int[] right) {
        // Initialize the indices for the left and right arrays
        int leftIndex = 0;
        int rightIndex = 0;

        // Initialize the index for the merged array
        int mergeIndex = 0;

        // Compare the elements in the left and right arrays, and add the smaller
        // element to the merged array
        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] < right[rightIndex]) {
                array[mergeIndex] = left[leftIndex];
                leftIndex++;
            } else {
                array[mergeIndex] = right[rightIndex];
                rightIndex++;
            }
            mergeIndex++;
        }

        // Add any remaining elements from the left array to the merged array
        while (leftIndex < left.length) {
            array[mergeIndex] = left[leftIndex];
            leftIndex++;
            mergeIndex++;
        }

        // Add any remaining elements from the right array to the merged array
        while (rightIndex < right.length) {
            array[mergeIndex] = right[rightIndex];
            rightIndex++;
            mergeIndex++;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        Random rand = new Random();
        for (int i = 0; i < array.length -1; i++) {
            array[i] = rand.nextInt(100);
        }

        mergeSort(array);
        System.out.println(Arrays.toString(array));
        // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}
