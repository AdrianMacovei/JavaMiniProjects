public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 0));

    }
    public static boolean shouldWakeUp(boolean isDogBarking, int hourOfDay) {
        return isDogBarking && ((hourOfDay >= 0 && hourOfDay < 8) || hourOfDay == 23);
    }

}
