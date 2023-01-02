public class NatoAlphabet {
    public static void main(String[] args) {
        char letter = 'X';
        System.out.println(changeCharToWord(letter));
    }

    public static String changeCharToWord(char letter) {
        switch (letter) {
            case 'A':
                return "The word for letter " + letter + " is Able.";
            case 'B':
                return "The word for letter " + letter + " is Baker.";
            case 'C':
                return "The word for letter " + letter + " is Charlie.";
            case 'D':
                return "The word for letter " + letter + " is Dog.";
            case 'E':
                return "The word for letter " + letter + " is Easy.";
            default:
                return "The letter " + letter + " was not found in the switch.";
        }
    }
}