public class MethodsChallenge {
    public static void main(String[] args) {
        int[] scoreValues = {1500, 1000, 500, 100, 25};
        String[] playerNames = {"Adrian", "Bogdan", "Ioana", "Mariana", "Cristina"};
        for (int i = 0; i < scoreValues.length; i++) {
            displayHighScorePosition(playerNames[i], calculateHighScorePosition(scoreValues[i]));
        }
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position "
                + playerPosition + " on the high score list.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;

    }
}
