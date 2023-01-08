package smart_kitchen;

public class SmartKitchen {
    private CoffeeMaker coffeeMaker;
    private Refrigerator refrigerator;
    private DishWasher dishWasher;

    public SmartKitchen() {
        coffeeMaker = new CoffeeMaker();
        refrigerator = new Refrigerator();
        dishWasher = new DishWasher();
    }

    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag,
                                boolean dishWasherFlag) {
        coffeeMaker.setHasWorkToDo(coffeeFlag);
        refrigerator.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
    }

    public void doKitchenWork() {
        coffeeMaker.brewCoffee();
        refrigerator.orderFood();
        dishWasher.doDishes();
    }


    public void addWater() {
        System.out.println("");
    }

    public void pourMilk() {
        System.out.println("");
    }

    public void loadDishWasher() {
        System.out.println("");
    }

}

class CoffeeMaker {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("Brewing Coffee");
            hasWorkToDo = false;
        }
    }

}

class DishWasher {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Washing Dishes");
            hasWorkToDo = false;
        }
    }
}

class Refrigerator {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Ordering Food");
            hasWorkToDo = false;
        }
    }

}
