package encapsulation_challenge;

import java.util.Scanner;

public class Printer {

    private int tonerLevel;
    private int paperPrinted;
    private boolean duplex;

    private int whitePaperNumber;

    public Printer(int tonerLevel) {
        this.tonerLevel = tonerLevel < 0 ? 0 : (tonerLevel > 100 ? 100 : tonerLevel);
        this.paperPrinted = 0;
        this.whitePaperNumber = 300;
    }

    public int getPaperPrinted() {
        return paperPrinted;
    }

    public void addToner(int tonerAmount) {
        if (tonerAmount < 0) {
            System.out.println("Invalid value");
            return;
        }

        if (this.tonerLevel + tonerAmount <= 100) {
            this.tonerLevel += tonerAmount;
            System.out.printf("Successful operation! Your toner level is %d", this.tonerLevel);
        } else if (this.tonerLevel == 100) {
            System.out.println("Full capacity");
        } else {
            System.out.printf("You want to introduce too much toner. Acceptable amount is equal or less than %d", (100 - tonerLevel));
        }
    }

    public void printPages(int pageNumbers, boolean wantDuplex) {
        this.duplex = wantDuplex;
        int initialPageNumbers = pageNumbers;
        if (pageNumbers <= 0) {
            System.out.println("Invalid value");
            return;
        }

        while (pageToPrintRemain(pageNumbers) > 0) {
            int value = pageToPrintRemain(pageNumbers);
            System.out.println("");
            paperPrinted += whitePaperNumber;
            whitePaperNumber = 0;
            refillWhitePaperAlert();
            refillWhitePaper();
            pageNumbers = value;
        }

        if (duplex) {
            whitePaperNumber -= pageNumbers / 2;
            paperPrinted += (pageNumbers / 2 + (pageNumbers % 2));
            System.out.println("Finish to print " + initialPageNumbers + " duplex pages.");
        } else {
            whitePaperNumber -= pageNumbers;
            paperPrinted += pageNumbers;
            System.out.println("Finish to print " + initialPageNumbers + " pages.");
        }

    }

    private int pageToPrintRemain(int pageNumbersToPrint){
        if (duplex) {
            if ((pageNumbersToPrint / 2) > whitePaperNumber) {
                return (pageNumbersToPrint / 2 - whitePaperNumber);
            }
        }  else {
            if (pageNumbersToPrint > whitePaperNumber) {
                return (pageNumbersToPrint - whitePaperNumber);
            }
        }
        return 0;
    }

    private void refillWhitePaperAlert() {
            System.out.println("Refill white paper tank!");
    }

    private void refillWhitePaper() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Please introduce amount of white paper (1-300): ");
            try {
                int paperAmount = Integer.parseInt(scanner.nextLine());
                if (paperAmount <= 0 || paperAmount > 300) {
                    System.out.println("Invalid value, please introduce an amount between 1 - 300");
                } else {
                    this.whitePaperNumber = paperAmount;
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Character not allowed, only numeric value");
            }
        }
    }
}
