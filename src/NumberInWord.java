public class NumberInWord {
    public static void main(String[] args) {

    }
    public static void printNumberInWord(int number) {
        String wordNumber = switch(number) {
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "OTHER";
        };
    }
    public static void printNumberInWordTwo(int number) {
        String wordNumber;
        switch(number) {
            case 0: {
                 wordNumber = "ZERO";
                 break;
            }
            case 1: {
                wordNumber = "ONE";
                break;
            }
            case 2: {
                wordNumber = "TWO";
                break;
            }
            case 3: {
                wordNumber = "THREE";
                break;
            }
            case 4: {
                wordNumber = "FOUR";
                break;
            }
            case 5: {
                wordNumber = "FIVE";
                break;
            }
            case 6: {
                wordNumber = "SIX";
                break;
            }
            case 7: {
                wordNumber = "SEVEN";
                break;
            }
            case 8: {
                wordNumber = "EIGHT";
                break;
            }
            case 9: {
                wordNumber = "NINE";
                break;
            }
            default: {
                wordNumber = "OTHER";
                break;
            }
        }
        System.out.println(wordNumber);
    }
}
