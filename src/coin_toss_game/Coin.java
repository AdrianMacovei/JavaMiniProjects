package coin_toss_game;

import java.util.Random;

public class Coin {

    private static final String[] SIDES = new String[] {"HEAD", "TAIL"};

    public static String flip() {

        Random rand = new Random();
        return SIDES[rand.nextInt(SIDES.length)];
    }
}
