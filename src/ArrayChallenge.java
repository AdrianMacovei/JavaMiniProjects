import java.util.Arrays;
import java.util.Random;

public class ArrayChallenge {
    public static void main(String[] args) {
        int[] newArray = createRandomArray(10);
        for (int i = 0; i < newArray.length; i++) {
            int minIndex = i;

            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j] < newArray[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = newArray[i];
            newArray[i] = newArray[minIndex];
            newArray[minIndex] = temp;
        }

        int[] reverseNewArray = new int[newArray.length];
        int counter = 0;
        for (int i = (newArray.length - 1); i >= 0; i--) {
            reverseNewArray[counter] = newArray[i];
            counter++;
        }

        System.out.println(Arrays.toString(newArray));
        System.out.println(Arrays.toString(reverseNewArray));

    }

    public static int[] createRandomArray(int len) {
        Random random = new Random();
        int[] array = new int[len];
        for (int i = 0; i < len - 1; i++) {
            array[i] = random.nextInt(100);
        }

        return array;
    }
}
