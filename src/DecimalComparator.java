public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.1756, 3.1757));
    }
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        return (int)(num1 * 1000) == (int) (num2 * 1000);
    }
}
