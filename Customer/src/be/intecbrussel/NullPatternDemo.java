package be.intecbrussel;

public class NullPatternDemo {
    public static void main(String[] args) {

        AbstractCustomer customer1 = CustomerFactory.getCustomer("Avi");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Quinten");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Joeydfqs");
        System.out.println("customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
    }
}
