import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {
        double minNumber = 0;
        double maxNumber = 0;
        int loopCounter = 0;
        while (true) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number or any character to exit: ");
            try {
                double number = Double.parseDouble(scanner.nextLine());
                if (loopCounter == 0 || number < minNumber) {
                    minNumber = number;
                }
                if (loopCounter == 0 || number > maxNumber) {
                    maxNumber = number;
                }
                loopCounter++;
            } catch (NumberFormatException e) {
                System.out.println("String data type entered");
                break;
            }
        }
        if (loopCounter > 0) {
            System.out.println("Minimum number is " + minNumber + " and maximum number is " + maxNumber);

        } else {
            System.out.println("No valid data entered");
        }
    }
}
