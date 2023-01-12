package smart_kitchen;

public class Main {
    public static void main(String[] args) {

        SmartKitchen kitchen = new SmartKitchen();
//
//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getRefrigerator().setHasWorkToDo(true);
//        kitchen.getCoffeeMaker().setHasWorkToDo(true);
//
//        kitchen.getDishWasher().doDishes();
//        kitchen.getRefrigerator().orderFood();
//        kitchen.getCoffeeMaker().brewCoffee();

        kitchen.setKitchenState(true, false, true);
        kitchen.doKitchenWork();
    }

}