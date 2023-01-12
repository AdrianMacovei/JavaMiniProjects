package encapsulation_challenge;

public class Main {
    public static void main(String[] args) {
        Printer myPrinter = new Printer(100);
        myPrinter.addToner(100);
        myPrinter.printPages(5, true);
//        myPrinter.printPages(250, true);
        System.out.println(myPrinter.getPaperPrinted());
    }
}
