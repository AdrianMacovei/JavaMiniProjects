package class_composition_exercise;

import java.util.Scanner;

public class Lamp {

    private int batteryLv;
    private String style;
    private boolean battery;
    private int globRating;

    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
        if (battery) {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("What is the battery lv of the lamp (0-100): ");
                try {
                    this.batteryLv = Integer.parseInt(scanner.nextLine());
                    if (batteryLv >= 0 && batteryLv <= 100) {
                        break;
                    } else {
                        System.out.println("Only value between 0 and 100 is valid");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Only integer numbers accepted!");
                }
            }
        }
    }


    public void turnOn() {
        if ((this.batteryLv > 0) && (this.battery == true)) {
            System.out.println("Lamp is On");
            return;
        } else if (this.battery == true && (this.batteryLv == 0)) {
            System.out.println("Lamp battery exhausted");
            return;
        } else {
            System.out.println("Lamp is On");
        }
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }

}
