package coin_toss_game;

import java.util.Scanner;

public class CoinTossGame {

    private static final Scanner scanner = new Scanner(System.in);
    public static Player playerOne;
    public static Player playerTwo;

    public static void main(String[] args) {

        setPlayersName();
        boolean keepPlaying = true;

        do {
            getPlayerOneAnswer();
            getPlayerTwoAnswer();


            String result = Coin.flip();
            System.out.println("The correct answer is " + result);
            getTheResult(result);

            if(!doYouWantToContinue()) {
                keepPlaying = false;
            }

        } while (keepPlaying);

        if(playerOne.getPoints() == playerTwo.getPoints()) {
            System.out.println("Both of you have a score equal to " + playerOne.getPoints() + ".It's a draw!");
        } else if (playerOne.getPoints() > playerTwo.getPoints()) {
            System.out.println(playerOne.getName() + " win the game! Congrats!");
        } else {
            System.out.println(playerTwo.getName() + " win the game! Congrats!");
        }
    }

    private static void getTheResult(String result){
        if(result.equals(playerOne.getGuess()) && result.equals(playerTwo.getGuess())) {
            System.out.println("This round is a draw!");
            playerOne.setPoints(1);
            playerTwo.setPoints(1);
        }else if (result.equals(playerOne.getGuess())) {
            System.out.printf("Congrats, %s! You win this round!%n", playerOne.getName());
            playerOne.setPoints(1);
        }else if (result.equals(playerTwo.getGuess())) {
            System.out.printf("Congrats, %s! You win this round%n", playerTwo.getName());
            playerTwo.setPoints(1);
        }else{
            System.out.println("Both of you choose wrong!");
        }
    }

    private static void setPlayersName() {
        System.out.println("Set the name for first player: ");
        playerOne = new Player(scanner.nextLine());

        System.out.println("Set the name for second player: ");
        playerTwo = new Player(scanner.nextLine());
    }

    private static void getPlayerOneAnswer() {
        while (true) {
            System.out.printf("%s -> Chose one face of coin (HEAD or TAIL): %n", playerOne.getName());
            String playerOneAnswer = scanner.nextLine().toUpperCase();
            if (playerOneAnswer.equalsIgnoreCase("HEAD") ||
                    playerOneAnswer.equalsIgnoreCase("TAIL")) {
                playerOne.setGuess(playerOneAnswer);
                break;
            }else {
                System.out.println("Invalid answer, need to be TAIL or HEAD!");
            }
        }
    }

    private static void getPlayerTwoAnswer() {
        while (true) {
            System.out.printf("%s -> Chose one face of coin (HEAD or TAIL): %n", playerTwo.getName());
            String playerTwoAnswer = scanner.nextLine().toUpperCase();
            if (playerTwoAnswer.equals("HEAD") ||
                    playerTwoAnswer.equals("TAIL")) {
                playerTwo.setGuess(playerTwoAnswer);
                break;
            }else {
                System.out.println("Invalid answer, need to be TAIL or HEAD!");
            }
        }
    }

    private static boolean doYouWantToContinue() {
        while (true) {
            System.out.println("Do you want to continue to play? (yes/no): ");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("yes")){
                return true;
            } else if (answer.equalsIgnoreCase("no")) {
                return false;
            } else {
                System.out.println("Invalid answer! Try again");
            }
        }
    }
}
