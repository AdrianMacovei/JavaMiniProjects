package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;
    public static void main(String[] args) {
        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }

    public static int[] generateNumbers() {

        int[] ticket = new int[LENGTH];

        Random rand = new Random();

        for (int i = 0; i < ticket.length; i++) {
            int randomNumber;
            do{
                randomNumber = rand.nextInt(MAX_TICKET_NUMBER);

            } while(search(ticket, randomNumber));
            ticket[i] = randomNumber;
        }

        return ticket;
    }

    public static void printTicket(int[] ticket) {
        for(int number:ticket) {
            System.out.print(number + " | ");
        }
    }

    /**
     * Does a sequential search on the array to find a value
     * @param array Array to search through
     * @param number Value to search for
     * @return true if found, false otherwise
     */
    public static boolean search(int[] array, int number) {
        for(int value : array) {
            if (value == number) {
                return true;
            }
        }
        //If this point is reached, the entire array was searched
        return false;
    }

    public static boolean binarySearch(int[] array, int number) {
        //Array must be sorted
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, number);

        return index >= 0;
    }
}
