import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        while (i < 4) {
            System.out.println("Type a number: ");
            int userInput = input.nextInt();
            checkNumber(userInput);
            i++;
        }
    }
    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("The number " + number + " is positive.");
        } else if (number < 0) {
            System.out.println("The number " + number + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }

}
