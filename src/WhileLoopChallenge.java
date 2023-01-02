public class WhileLoopChallenge {
    public static void main(String[] args) {
        int number = 4;
        int counterEven  = 0;
        int counterOdd = 0;
        while (number <= 20) {
            number++;
            if (!isEvenNumber(number)) {
                counterOdd ++;
               continue;
            }
            counterEven++;
            System.out.println("Number " + number + " is even.");
            if (counterEven == 5) {
                break;
            }

        }
        System.out.println("Number of even = " + counterEven);
        System.out.println("Number of odd = " + counterOdd);
    }
    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
