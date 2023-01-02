public class DividedByThreeAndFive {
    public static void main(String[] args) {
        int sumNumber = 0;
        int counter = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sumNumber += i;
                counter++;
                System.out.println("Number " + i + " is divisible by both 3 and 5.");
                if (counter == 5) {
                    break;
                }
            }
        }
        System.out.println("Sum of numbers are " + sumNumber);
    }
}
