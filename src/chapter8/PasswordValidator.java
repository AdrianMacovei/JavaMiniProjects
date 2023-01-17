package chapter8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    private static String password;
    private static String newPassword;

    private static String userName;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter you user name: ");
        userName = scanner.nextLine();

        System.out.println("Please enter you old password: ");
        password = scanner.nextLine();

        System.out.println("Please enter your new password: ");
        newPassword = scanner.nextLine();

        if (containsEightCharacters(newPassword) && containsAnUpperCaseLetter(newPassword) &&
                containsSpecialCharacter(newPassword) && notContainsUserName(newPassword)
        && notSameAsOldPassword(newPassword)) {
            password = newPassword;
            System.out.println("Password was valid and was updated. Now your password is " + password);
        }else if(!containsEightCharacters(newPassword)){
            System.out.println("New password need to have at least 8 characters");
        } else if(!containsAnUpperCaseLetter(newPassword)) {
            System.out.println("New password need to have at least one Uppercase letter");
        } else if (!containsSpecialCharacter(newPassword)) {
            System.out.println("New password need to contain a special character");
        } else if (!notContainsUserName(newPassword)) {
            System.out.println("New password need to not contain user name");
        } else {
            System.out.println("New password need to be different than old password");
        }
    }

    public static boolean containsEightCharacters(String text) {

        return text.length() >= 8;
    }

    public static boolean containsAnUpperCaseLetter(String text) {
        for(int i = 0; i < text.length(); i++) {
            if(Character.isUpperCase(text.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsSpecialCharacter(String text) {
        Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
        Matcher match = special.matcher(text);
        return match.find();
    }

    public static boolean notContainsUserName(String text) {

        return !text.contains(userName);
    }

    public static boolean notSameAsOldPassword(String text) {
        return !(text.equals(password));
    }

}
