package ClassesProject;

public class Main {
    public static void main(String[] args) {
        BankAccount defaultAccount = new BankAccount();
        System.out.println(defaultAccount.getAccountBalance());
        System.out.println(defaultAccount.getEmail());
        defaultAccount.setEmail("adrian@gmail.com");
        System.out.println(defaultAccount.getEmail());
        BankAccount.methodClass();
    }
}
