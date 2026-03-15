import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Inventory myInventory = new Inventory();

        System.out.println("=== Motor Part Shop System ===");

        try {
            System.out.print("Enter Part ID: ");
            String id = input.nextLine();
            System.out.print("Enter Part Name: ");
            String name = input.nextLine();
            System.out.print("Enter Price: ");
            double price = Double.parseDouble(input.nextLine());

            EnginePart newPart = new EnginePart(id, name, price, 12);
            myInventory.addPart(newPart);
            myInventory.displayParts();

        } catch (NumberFormatException e) {
            // This satisfies the Exception Handling requirement
            System.out.println("ERROR: Please enter a numeric value for the price.");
        } finally {
            // This satisfies the 'finally' requirement
            input.close();
            System.out.println("Session closed.");
        }
    }
}import java.util.Scanner;
