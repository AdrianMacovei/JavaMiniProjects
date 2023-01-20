package classes_project;

public class BankAccount {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public static void methodClass() {
        System.out.println("This is class method");
    }

    public BankAccount(String accountNumber, double accountBalance, String customerName,
                       String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public BankAccount() {
        // Constructor chains
        this("123456789", 0, "Default value", "Default value",
                "Default value");
        System.out.println("This is default constructor made by programmer");
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void depositMoney(double amount) {
        if (amount > 0) {
            this.accountBalance += amount;
            System.out.println("The operation was successful. Now your balance is $" + this.accountBalance);
        } else {
            System.out.println("Negative and zero value are invalid values! Try again!");
        }

    }

    public void withdrawMoney(double amount) {
        if (amount <= this.accountBalance && amount > 0) {
            this.accountBalance -= amount;
            System.out.println("The operation was successful. Now your balance is $" + this.accountBalance);


        } else if (amount <= 0) {
            System.out.println("Negative and zero value are invalid values! Try again!");
        } else {
            System.out.println("The amount that you want to withdraw is too big! Maximum amount is " +
                    this.accountBalance + " and you introduced " + amount);
        }

    }
}
