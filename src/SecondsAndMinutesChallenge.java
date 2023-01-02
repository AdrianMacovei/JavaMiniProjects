public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(22455));
        System.out.println(getDurationString(60, 60));
    }
    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value " + seconds + " for seconds. Must be positive value.";
        }
        int seconds1 = seconds % 60;
        int minutes = seconds / 60;
        int hours = minutes / 60;
        minutes = minutes % 60;
        return hours + "h " + minutes + "m " + seconds1 + 's';
    }
    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            return "Invalid value " + minutes + " for minutes. Must be positive value.";
        } else if (seconds < 0) {
            return "Invalid value " + seconds + " for seconds. Must be positive value.";
        }
        seconds = minutes * 60 + seconds;
        return getDurationString(seconds);
    }
}
