import java.lang.Math;

public class SpeedConverter {
    public static void main(String[] args) {
        System.out.println(toMilesPerHour(95.75));
    }
    public static long toMilesPerHour(double kilometersPerHour) {
        long milesPerHour = 0;
        if (kilometersPerHour < 0) {
            milesPerHour = -1;
        } else {
            milesPerHour = Math.round(kilometersPerHour * 0.62137d);
        }
        return milesPerHour;
    }
    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }
        System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
    }

}
