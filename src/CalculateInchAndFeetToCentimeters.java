public class CalculateInchAndFeetToCentimeters {
    public static void main(String[] args) {
        System.out.println("5ft, 8in = " + convertToCentimeters(5, 8) + "cm");
        System.out.println("10in = " + convertToCentimeters(10) + "cm");
    }
    public static double convertToCentimeters(int heightInches) {
        return heightInches * 2.54;
    }
//    Overloading Methods
    public static double convertToCentimeters (int heightFeet, int heightInches) {
        int valueInInches = heightFeet * 12 + heightInches;
        return convertToCentimeters(valueInInches);
    }
}
