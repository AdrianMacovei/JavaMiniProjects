package chapter7;

import java.util.Scanner;

public class Grade {

    private static int grades[];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How many grades would you like to enter? ");
        grades = new int[scanner.nextInt()];

        getGrades();

        System.out.printf("Average: %.2f;%n", calculateAverage());
        System.out.printf("Highest: %d;%n", getHighest());
        System.out.printf("Lowest: %d;%n", getLowest());

    }

    public static void getGrades() {

        for (int i = 0; i < grades.length; i++) {

            System.out.println("Enter grade #" + (i + 1));
            grades[i] = scanner.nextInt();
        }
    }

    public static int calculateSum() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum;
    }

    public static double calculateAverage() {
        return (calculateSum()/grades.length);
    }

    public static int getHighest() {

        int highest = grades[0];

        for(int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }

        return highest;
    }

    public static int getLowest() {

        int lowest = grades[0];

        for(int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }

        return lowest;
    }
}
