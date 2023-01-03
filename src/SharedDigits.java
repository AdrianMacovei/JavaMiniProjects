public class SharedDigits {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(12, 333333333));
    }

//    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
//        if (firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99) {
//            return false;
//        }
//
//        return ((firstNumber % 10 == secondNumber / 10) || (firstNumber / 10 == secondNumber % 10) ||
//                (firstNumber % 10 == secondNumber % 10) || ((firstNumber / 10) % 10) == ((secondNumber / 10) % 10));
//    }

    public static boolean hasSharedDigit(int n1, int n2) {
        if (n1 < 10 || n2 < 10) return false;
        for (int i = n1; i > 0; i /= 10) {
            int n1_digit = i % 10;
            for (int j = n2; j > 0; j /= 10) {
                int n2_digit = j % 10;
                if  (n1_digit == n2_digit) {
                    return true;
                }
            }
        }
        return false;
    }
}
