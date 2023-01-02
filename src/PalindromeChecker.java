public class PalindromeChecker {
    public static void main(String[] args) {
        System.out.println(isPalindrome(0));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }
    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number *= -1;
        }
        int reverse = 0;
        int numberToCheck = number;
        while (numberToCheck != 0) {
            int lastDigit = numberToCheck % 10;
            reverse = reverse * 10 + lastDigit;
            numberToCheck /= 10;
        }
        return reverse == number;
    }
}
