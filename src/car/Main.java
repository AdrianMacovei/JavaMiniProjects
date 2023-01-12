package car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Mitsubishi(4, "XC45");
        System.out.println(car1.startEngine());
        System.out.println(car1.brake());
        System.out.println(car1.accelerate());
        System.out.println("_".repeat(10));

        Car car2 = new Ford(5, "F453");
        System.out.println(car2.startEngine());
        System.out.println(car2.brake());
        System.out.println(car2.accelerate());
        System.out.println("_".repeat(10));

        Car car3 = new Holden(6, "G343");
        System.out.println(car3.startEngine());
        System.out.println(car3.brake());
        System.out.println(car3.accelerate());
        System.out.println("_".repeat(10));
    }
}
