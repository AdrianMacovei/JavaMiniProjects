package coin_toss_game;

public class Player {

    private String name;
    private String guess;

    private int points;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }

    public String getGuess() {
        return guess;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = this.points + points;
    }
}
