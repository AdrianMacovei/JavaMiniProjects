package array;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arrayOne = getRandomArray(10);
        System.out.println(Arrays.toString(arrayOne));
        Arrays.sort(arrayOne);
        System.out.println(Arrays.toString(arrayOne));

        int[] arrayTwo = new int[10];
        Arrays.fill(arrayTwo, 5);
        System.out.println(Arrays.toString(arrayTwo));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));
        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));
        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(fourthArray));

        int[] smallerArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallerArray));

        Object[] array = {1, 3.5, "something"};
        System.out.println(Arrays.toString(array));

    }

    public static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = random.nextInt(100);
        }

        return array;
    }
}
