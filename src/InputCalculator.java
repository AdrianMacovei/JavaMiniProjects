import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage() {
        double sum = 0;
        double average= 0;
        int loopCounter = 0;
        while(true) {
            System.out.println("Enter a number, or character to exit: ");
            Scanner scanner = new Scanner(System.in);
            try {
               double number = Double.parseDouble(scanner.nextLine());
               sum += number;
               loopCounter++;
               average = sum / loopCounter;
            } catch (Exception e) {
                break;
            }
        }
        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}
