import java.util.Random;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello, Tim!");
//        boolean isAlien = false;
//        if (isAlien == false) {
//            System.out.println("It is not an alien!");
//            System.out.println("And I am scared of aliens");
//        }
//        Random rand = new Random();
//        int topScore = rand.nextInt(101);
//        if (topScore < 50) {
//            System.out.println("You got the high score!");
//        }
//        System.out.println(topScore);
//
//        int secondScore = 40;
//        if ((topScore > secondScore) && (topScore < 100)) {
//            System.out.println("Greater than second score and less than 100.");
//        }
//        if ((topScore > 90) || (secondScore > 50)) {
//            System.out.println("You win!");
//        }
////        Scanner input = new Scanner(System.in);
////        System.out.println("Give a number between 0-100: ");
////        int newValue = input.nextInt();
////        if (newValue <= 50) {
////            System.out.println("This is an error!");
////        }
//        boolean isCar = false;
//        if (!isCar) {
//            System.out.println("This is not suppose to happen");
//        }
//        String makeOfCar = "Volkswagen";
//        int isDomestic = (makeOfCar == "Volkswagen") ? 2 : 3;
//        System.out.println(isDomestic);
//

        double firstDouble = 20.00d;
        double secondDouble = 80.00d;
        double remainderValue = ((firstDouble + secondDouble) * 100.00d) % 40d;

        boolean isRemainderZero = remainderValue == 0;

        System.out.println(isRemainderZero);
        System.out.println(remainderValue);

        if (!isRemainderZero) {
            System.out.println("Got some reminder!");
        } else {
            System.out.println("Remainder is zero!");
        }
    }
}
