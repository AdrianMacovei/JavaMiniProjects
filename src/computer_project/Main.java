package computer_project;

public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208", "Dell",
                "240");

        Monitor theMonitor = new Monitor("27inc Beast", "Acer",
                27, "2540 x 1440");

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus",
                4, 6, "v.2.45");

        PersonalComputer myComputer = new PersonalComputer("2208", "Dell",
                theCase, theMonitor, theMotherboard);

//        myComputer.getMonitor().drawPixelAt(3, 4, "black");
//        myComputer.getMotherboard().loadProgram("Windows XP");
//        myComputer.getComputerCase().pressPowerButton();

        myComputer.powerUp();


    }
}
