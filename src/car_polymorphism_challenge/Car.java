package car_polymorphism_challenge;

public class Car {

    private String description;
    private boolean isEngineRunning;

    public Car(String description) {
        this.description = description;
        this.isEngineRunning = false;
    }

    public boolean isEngineRunning() {
        return isEngineRunning;
    }

    public void setEngineRunning(boolean engineRunning) {
        isEngineRunning = engineRunning;
    }

     public void startEngine() {
        System.out.println("The engine is started");
        isEngineRunning = true;
    }

    public void drive() {
        if (isEngineRunning) {
            System.out.println("The car is ready to drive");
            runEngine();
            System.out.println("Car -> driving, type is " + getClass().getSimpleName());
        } else {
            System.out.println("Need to start the engine first.");
        }
    }

     protected void runEngine() {
        if (isEngineRunning) {
            System.out.println("The engine run smoothly");
        } else {
            System.out.println("Engine is not running, need to start it first.");
        }
    }
}

class GasPoweredCar extends Car {

    private double avgKmPerLitre = 5;
    private int cylinders = 4;

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public GasPoweredCar(String description) {
        super(description);
    }

    @Override
    public void startEngine() {
        setEngineRunning(true);
        System.out.printf("All %d cylinders are fired up...Engine start, Vruuuum!%n", cylinders);
    }


    @Override
    public void runEngine() {
        if (isEngineRunning()) {
            System.out.printf("Vruuum, vruuum, vruuum....usage exceeds the average %.2f %n", avgKmPerLitre);
        } else {
            System.out.println("Need to start the engine first");
        }
    }
}

class ElectricCar extends Car {

    private double avgPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgPerCharge, int batterySize) {
        super(description);
        this.avgPerCharge = avgPerCharge;
        this.batterySize = batterySize;
    }

    public ElectricCar(String description) {
        super(description);
    }

    @Override
    public void startEngine() {
        setEngineRunning(true);
        System.out.println("Battery send electricity to engine...Ready to go");
    }


    @Override
    protected void runEngine() {
        if (isEngineRunning()) {
            System.out.println("The engine is silent, no noise made");
        } else {
            System.out.println("Need to start the engine first");
        }
    }
}

class HybridCar extends Car {

    private double avgKmPerLitre = 5.0;
    private int cylinders = 4;
    private int batterySize = 5;

    public HybridCar(String description, double avgKmPerLitre, int cylinders,
                     int batterySize) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    public HybridCar(String description) {
        super(description);
    }

    @Override
    public void startEngine() {
        setEngineRunning(true);
        System.out.printf("All %d cylinders are fired up...Engine start, Vruuuum!%n", cylinders);
    }

    @Override
    protected void runEngine() {
        if (isEngineRunning()) {
            System.out.printf("Vruuuum...usage exceeds the average %.2f%n", avgKmPerLitre);
        } else {
            System.out.println("Need to start the engine first");
        }
    }
}
