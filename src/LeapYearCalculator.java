public class LeapYearCalculator {
    public static void main(String[] args) {
        System.out.println(isLeapYear(400));
    }
    public static boolean isLeapYear(int year){
        boolean isLeapYear  = false;
        if (year < 1 || year > 9999);
        else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            isLeapYear = true;
        }
        return isLeapYear;
    }
}
