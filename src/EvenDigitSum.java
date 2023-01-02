public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println("The sum of even digits of  number 3456 is " + getEvenDigitSum(2456));
        System.out.println("The sum of even digits of  number -3456 is " + getEvenDigitSum(-3456));
    }
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int evenDigitSum = 0;
        while (number >= 10) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evenDigitSum += digit;
            }
            number /= 10;
        }
        if (number % 2 == 0) {
            evenDigitSum += number;
        }
        return evenDigitSum;
    }
}
