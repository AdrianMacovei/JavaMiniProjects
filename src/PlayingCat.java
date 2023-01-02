public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 25));
        System.out.println(isCatPlaying(false, 25));
        System.out.println(isCatPlaying(false, 10));
        System.out.println(isCatPlaying(false, 36));

    }
    public static boolean isCatPlaying(boolean isSummer, int temperature) {
        if (isSummer) {
            return temperature >= 25 && temperature <= 45;
        } else if (!isSummer) {
            return temperature >= 25 && temperature <= 35;
        } else {
            return false;
        }
    }
}
