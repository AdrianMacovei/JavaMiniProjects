package handle_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {

        numbersExceptionHandling();
    }

    public static void numbersExceptionHandling() {
        File file = new File("resources/numbers.txt");
        // Java will automatically close the fileReader after the block is finished / like with on Python
        try(Scanner fileReader = new Scanner(file)){
            while (fileReader.hasNext()) {
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        }catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        }
    }
}
