import java.util.Random;

public class IfElseIfElseConditions {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println("Your score is " +
                calculateScore(true, 0, r.nextInt(25), 100) + "!");
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            score += (levelCompleted * bonus);
        }
        return score;
    }
}