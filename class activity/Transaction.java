import java.util.ArrayList;

public class Transaction implements Sellable, Discountable {

    private String transactionID;
    private ArrayList<Part> purchasedParts;
    private double totalAmount;

    public Transaction(String transactionID) {
        this.transactionID = transactionID;
        purchasedParts = new ArrayList<>();
        totalAmount = 0;
    }

    public void addPart(Part part) {
        purchasedParts.add(part);
        totalAmount = totalAmount + part.getPrice();
    }

    @Override
    public double calculateTax() {
        double tax = totalAmount * 0.16;
        return tax;
    }

    @Override
    public double applyDiscount(double percentage) {
        double discount = totalAmount * percentage / 100;
        totalAmount = totalAmount - discount;
        return totalAmount;
    }

    @Override
    public void generateReceipt() {

        System.out.println("  RECEIPT  ");
        System.out.println("Transaction ID: " + transactionID);

        for (int i = 0; i < purchasedParts.size(); i++) {
            System.out.println(purchasedParts.get(i).getDetails());
        }

        System.out.println("Total: " + totalAmount);

        double tax = calculateTax();
        System.out.println("Tax (16%): " + tax);

        System.out.println("Final Amount: " + (totalAmount + tax));
        System.out.println(" --- ");
    }
}
