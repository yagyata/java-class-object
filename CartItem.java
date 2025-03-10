public class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    public void addItem(int quantity) {
        if (quantity > 0) {
            this.quantity += quantity;
            System.out.println(quantity + " more " + itemName + "(s) added to the cart.");
        } else {
            System.out.println("Invalid quantity. Cannot add item.");
        }
    }

    // Method to remove items from the cart
    public void removeItem(int quantity) {
        if (quantity > 0 && quantity <= this.quantity) {
            this.quantity -= quantity;
            System.out.println(quantity + " " + itemName + "(s) removed from the cart.");
        } else if (quantity > this.quantity) {
            System.out.println("Cannot remove more than available quantity.");
        } else {
            System.out.println("Invalid quantity. Cannot remove item.");
        }
    }

    // Method to calculate and display total cost
    public void displayTotalCost() {
        double totalCost = price * quantity;
        System.out.println("Item: " + itemName);
        System.out.println("Price per unit: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: $" + totalCost);
    }

    // Main method to test the CartItem class
    public static void main(String[] args) {
        CartItem item1 = new CartItem("Laptop", 50000.0, 2);

        item1.displayTotalCost();
        item1.addItem(1);
        item1.removeItem(2);
        item1.displayTotalCost();
    }
}
