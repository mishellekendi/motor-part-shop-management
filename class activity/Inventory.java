import java.util.ArrayList;

public class Inventory {

    private ArrayList<Part> partsList;
    private static int totalStock = 0;  

    public Inventory() {
        partsList = new ArrayList<>();
    }

    public void addPart(Part part) {
        partsList.add(part);
        totalStock++;
    }

    public void displayParts() {
        System.out.println("  Inventory Parts  ");

        for (int i = 0; i < partsList.size(); i++) {
            System.out.println(partsList.get(i).getDetails());
        }
    }
    public static int getTotalStock() {
        return totalStock;
    }
}