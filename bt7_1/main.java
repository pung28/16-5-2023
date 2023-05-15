package homework.bt7_1;

public class main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John Doe", "premium");
        Visit visit1 = new Visit(customer1, 100.0, 50.0);
        System.out.println("Customer: " + customer1.getName());
        System.out.println("Total bill: $" + visit1.getTotalBill());

        Customer customer2 = new Customer("Jane Smith", "gold");
        Visit visit2 = new Visit(customer2, 200.0, 75.0);
        System.out.println("Customer: " + customer2.getName());
        System.out.println("Total bill: $" + visit2.getTotalBill());

        Customer customer3 = new Customer("Bob Johnson", "silver");
        Visit visit3 = new Visit(customer3, 150.0, 60.0);
        System.out.println("Customer: " + customer3.getName());
        System.out.println("Total bill: $" + visit3.getTotalBill());

        Customer customer4 = new Customer("Alice Brown", "none");
        Visit visit4 = new Visit(customer4, 120.0, 40.0);
        System.out.println("Customer: " + customer4.getName());
        System.out.println("Total bill: $" + visit4.getTotalBill());
    }
}
