import java.util.Scanner;

public class ReadUserInputChallenge {
    public static void main(String[] args) {
        System.out.println(getSumNumberUserInput());
    }

    public static String getSumNumberUserInput() {
        int numberCounter = 1;
        double sum = 0;
        while (numberCounter <= 5) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number " + numberCounter + ":");
            try {
                double number = Double.parseDouble(scanner.nextLine());
                numberCounter++;
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
            }
        }
        return "The sum of all five numbers = " + sum;
    }
}
