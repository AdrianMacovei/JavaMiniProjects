public class OddSum {
    public static void main(String[] args) {

    }

    public static boolean isOdd(int number) {
        return (number > 0 && number % 2 != 0);
    }
    public static int sumOdd(int startNumber, int endNumber) {
        int sumOfOdd = 0;
        if (startNumber <= endNumber && startNumber > 0) {
            for (int i = startNumber; i <= endNumber; i++) {
                if (isOdd(i)) {
                    sumOfOdd += i;
                }
            }
            return sumOfOdd;
        } else {
            return -1;
        }

    }
}