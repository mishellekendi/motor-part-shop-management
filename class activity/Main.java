public class Main {

    public static void main(String[] args) {

        // Create inventory
        Inventory inventory = new Inventory();

        // Create parts
        EnginePart engine = new EnginePart("E1", "Engine", 50000, 12);
        BodyPart door = new BodyPart("B1", "Door", 15000, "Steel");

        // Add parts to inventory
        inventory.addPart(engine);
        inventory.addPart(door);

        // inventory
        inventory.displayParts();
        System.out.println("Total Stock: " + Inventory.getTotalStock());
       // transaction
        Transaction transaction = new Transaction("T1")

        transaction.addPart(engine);
        transaction.addPart(door);

        transaction.applyDiscount(10);
        transaction.generateReceipt();

        // employee
        SalesPerson sp = new SalesPerson("EMP1", "John");
        sp.performDuty();
    }
}