package car_polymorphism_challenge;

public class Main {
    public static void main(String[] args) {
        Car myCar = new GasPoweredCar("VW", 7, 5);
        myCar.startEngine();
        myCar.drive();
        System.out.println("_".repeat(10));
        Car myCarTwo = new ElectricCar("Tesla");
        myCarTwo.startEngine();
        myCarTwo.drive();
        System.out.println("_".repeat(10));
        Car myCarThree = new HybridCar("Toyota");
        myCarThree.startEngine();
        myCarThree.drive();
        System.out.println("_".repeat(10));
    }
}
