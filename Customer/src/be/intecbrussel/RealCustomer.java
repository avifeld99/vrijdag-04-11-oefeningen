package be.intecbrussel;

public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        super.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return "welcome: " + name;
    }
}
