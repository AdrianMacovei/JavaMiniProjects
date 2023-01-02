public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int numberOfMegaBytes = kiloBytes / 1024;
        int reminderKiloBytes = kiloBytes % 1024;
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + numberOfMegaBytes + " MB and "
                    + reminderKiloBytes + " KB");
        }
    }
}
