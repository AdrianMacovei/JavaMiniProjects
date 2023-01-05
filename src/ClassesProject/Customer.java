package ClassesProject;

public class Customer {
    private final String name;
    private final double creditLimit;
    private final String email;

    static String something;
    public Customer() {
        this("Default Name","default@gmail.com");
    }

    public Customer(String name, String email) {
        this(name, 0, email);
    }

    public Customer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
