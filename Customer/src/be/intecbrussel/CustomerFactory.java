package be.intecbrussel;

public class CustomerFactory {

    //public final String[] NAMES = new String[7];

    public static final String[] NAMES = {"Avi", "Quinten", "Joey"};

    public static AbstractCustomer getCustomer(String name) {
        /*for (int index = 0; index > NAMES.length; index++) {
            System.out.println(NAMES[index]);
        }*/
        for (String a : NAMES) {
            // System.out.println(a);
            if (name.equals(a)) {
                return new RealCustomer(name);
            }

        }
        return new NullCustomer();
    }
}
