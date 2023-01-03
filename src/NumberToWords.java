public class NumberToWords {
    public static void main(String[] args) {
//        System.out.println(getDigitCount(3));
        System.out.println(reverse(-2521));
//        numberToWords(345);
    }
    public static void numberToWords(int number) {
        int digitNumber = getDigitCount(number);
        if (digitNumber == -1) {
            System.out.println("Invalid Value");
        }
        number = reverse(number);
        for (int i = digitNumber; i > 0; i--) {
            int digit = number % 10;
            number /= 10;
            if (digit == 0) {
                System.out.println("Zero");
            } else if (digit == 1) {
                System.out.println("One");
            } else if (digit == 2) {
                System.out.println("Two");
            } else if (digit == 3) {
                System.out.println("Three");
            } else if (digit == 4) {
                System.out.println("Four");
            } else if (digit == 5) {
                System.out.println("Five");
            } else if (digit == 6) {
                System.out.println("Six");
            } else if (digit == 7) {
                System.out.println("Seven");
            } else if (digit == 8) {
                System.out.println("Eight");
            } else {
                System.out.println("Nine");
            }
        }
    }
    public static  int getDigitCount(int number) {
        int numberOfDigits = 0;
        if (number < 0) {
            return -1;
        }
        for (int i = number; i >= 10; i /= 10) {
            numberOfDigits ++;
        }
        return numberOfDigits + 1;
    }
//    456
    public static int reverse (int number) {
        boolean isNumberNegative = false;
        if (number < 0) {
            number *= -1;
            isNumberNegative = true;
        }
        int numberOfDigits = 1;
        for (int i = number; i >= 10; i /= 10) {
            numberOfDigits++;
        }
        int reverse = 0;
        while (numberOfDigits > 0) {
            int numberPower = 1;
            int digit;
            for (int i = (numberOfDigits -1); i != 0; i--) {
                numberPower *= 10;
            }
            digit = number % 10;
            reverse += (digit * numberPower);
            numberOfDigits--;
            number /= 10;
        }
        if (isNumberNegative) {
            return reverse * -1;
        }
        return reverse;
     }
//    public static int getPowerNumber(int number, int numberPower) {
//        int result = 1;
//        for (int i = numberPower; i > 0; i--) {
//            result *= number;
//        }
//        return result;
//    }

}
