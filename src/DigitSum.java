public class DigitSum {
    public static void main(String[] args) {
        System.out.println("The sum of the digits in number 1234 is " + sumDigits(1234));
        System.out.println("The sum of the digits in number -1234 is " + sumDigits(-1234));
        System.out.println("The sum of the digits in number 4 is " + sumDigits(4));
        System.out.println("The sum of the digits in number 68764343 is " + sumDigits(32123));
        System.out.println(sumDigitsForLoop(1234));
    }
    public static int sumDigits(int number) {

        if (number < 0) {
            return -1;
        }

        int digitSum = 0;
        while (number > 9) {
            digitSum += (number % 10);
            number /= 10;
        }
        digitSum += number;
        return digitSum;
    }

    public static int sumDigitsForLoop( int number) {
        if (number < 0) {
            return -1;
        }

        int digitSum = 0;
        for (int i = number; i > 0; i /= 10) {
            if (i <= 9) {
                digitSum += i % 10;
                break;
            }
            digitSum += i % 10;
        }
        return digitSum;
    }
}
