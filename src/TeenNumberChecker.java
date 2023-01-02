public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.print(hasTeen(23, 13, 12));
    }
    public static boolean hasTeen(int num1, int num2, int num3) {
        return isTeen(num1) || isTeen(num2) || isTeen(num3);
    }

    public static boolean isTeen(int number) {
        return number >= 13 && number <= 19;
    }
}
