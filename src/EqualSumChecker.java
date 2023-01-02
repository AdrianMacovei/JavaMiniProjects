public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 2));
    }
    public static boolean hasEqualSum(int num1, int num2, int num3) {
        return num1 + num2 == num3;
    }
}
