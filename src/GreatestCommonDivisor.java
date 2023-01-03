public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12, 30));
    }
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int greatestNumber = first < second? second : first;
        int greatestDivisor = 0;
        for (int i = 1; i <= greatestNumber; i++) {
            if (first % i == 0 && second % i == 0) {
                greatestDivisor = i;
            }
        }
        return greatestDivisor;
    }
}
