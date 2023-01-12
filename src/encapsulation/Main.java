package encapsulation;

public class Main {
    public static void main(String[] args) {

        Player player = new Player();
        player.health = 200;
        System.out.println("Health = " + player.health);

        EnhancedPlayer adrian = new EnhancedPlayer("Adrian", 200, "Sword");

        System.out.println("Initial health is " + adrian.healthRemaining());
        System.out.println(adrian.getWeapon());
    }
}