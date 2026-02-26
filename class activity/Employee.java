public abstract class Employee {

    protected String ID;
    protected String name;

    public Employee(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public abstract void performDuty();
}
    
