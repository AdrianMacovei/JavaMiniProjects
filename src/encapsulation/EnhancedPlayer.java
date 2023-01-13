package encapsulation;

public class EnhancedPlayer {

    private String fullName;
    private int healthPercentage;
    private String weapon;

    public EnhancedPlayer(String name) {
        this(name, 100, "Sword");
    }

    public EnhancedPlayer(String name, int health, String weapon) {
        this.fullName = name;
        // control of healthPercentage field
        this.healthPercentage = health <= 0 ? 1 : (health > 100 ? 100 : health);
        this.weapon = switch (weapon.toLowerCase()) {
            case "sword" -> "sword";
            case "gun" -> "gun";
            default -> "Unknown";
        };
    }

    public String getWeapon() {
        return weapon;
    }

    public  void loseHealth(int damage) {
        healthPercentage = healthPercentage - damage;
        if (healthPercentage <= 0) {
            System.out.println("Player knocked out of game");
        }
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void restoreHealth(int extraHealth) {
        healthPercentage = healthPercentage + extraHealth;
        if (healthPercentage > 100) {
            System.out.println("Player restored to 100%");
            healthPercentage = 100;
        }
    }


}
