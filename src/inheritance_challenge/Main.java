package inheritance_challenge;

public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "15/04/1988",
                "24/08/2015");

        tim.terminate("26/09/2018");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge(2023));
        System.out.println("Pay = " + tim.collectPay());
        System.out.println("_______________");

        SalariedEmployee joe = new SalariedEmployee("Joe", "15/04/1988",
                "24/08/2015", 35000);
        System.out.println(joe);
        System.out.println("Joe's Paycheck = $" + joe.collectPay());
        joe.retire();
        System.out.println("Joe's Pension check = $" + joe.collectPay());
        System.out.println("_______________");

        HourlyEmployee adrian = new HourlyEmployee("Adrian", "15/04/1980",
                "24/08/2018", 15);
        System.out.println(adrian);
        System.out.println("Adrian's Paycheck = $" + adrian.collectPay());
        System.out.println("Adrian's Holiday Pay = $" + adrian.getDoublePay());
        System.out.println("_______________");
    }
}
