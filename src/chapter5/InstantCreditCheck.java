package chapter5;

import java.util.Scanner;


public class InstantCreditCheck {

    static double requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double salary = getSalary();
        int creditScore = getCreditScore();
        boolean qualified = isUserQualified(salary, creditScore);
        notifyUser(qualified);
        scanner.close();
    }

    public static double getSalary() {
        System.out.println("Enter your salary: ");
        try {
            double salary = scanner.nextDouble();;
            return salary;
        }catch(Exception e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }

    public static int getCreditScore() {
        System.out.println("Enter your credit score: ");
        try {
            int creditScore = scanner.nextInt();
            return creditScore;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return -1;
        }

    }

    public static boolean isUserQualified(double salary, int creditScore) {

        return (creditScore >= requiredCreditScore && salary >= requiredSalary);
    }

    public static void notifyUser(boolean qualified) {
        if(qualified) {
            System.out.println("You are qualified to get a credit.");
        }else{
            System.out.println("You are not qualified to get a credit.");
        }
    }
}
