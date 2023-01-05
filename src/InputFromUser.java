import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {
        System.out.println(getInputFromScanner(2023));
    }

    public static String getInputFromScanner(int currentYear) {
        int dateOfBirth;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hi, what's your name? ");
            String name = scanner.nextLine();

            System.out.println("Hi " + name + ", thanks for the input!");

            System.out.println("What year were born? ");
            dateOfBirth = scanner.nextInt();

        } while ((dateOfBirth >= currentYear) || (dateOfBirth < currentYear - 120));
        int age = currentYear - dateOfBirth;
        return "So you are " + age + " years old.";
    }
}
