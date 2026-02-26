public class SalesPerson extends Employee {

    public SalesPerson(String ID, String name) {
        super(ID, name);
    }

    @Override
    public void performDuty() {
        System.out.println(name + " is helping customers.");
    }
}