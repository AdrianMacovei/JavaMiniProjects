package chapter7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DaysOfWeek {

    public static void main(String[] args) {

        String[] days = new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

        boolean isNotValid = true;
        while (isNotValid) {
            System.out.println("Please introduce a number between 1 - 7: ");
            try {
                Scanner scanner = new Scanner(System.in);
                int userInput = scanner.nextInt();
                if (userInput > 0 && userInput <= 7) {
                    System.out.printf("The day corresponding to number %d is %s", userInput, days[userInput - 1]);
                    isNotValid = false;
                }
            }catch (InputMismatchException e) {
                System.out.println("Invalid value, only numbers allowed!");
            }
        }

    }
}
