public class MobilePhone {
    // Attributes
    private String brand;
    private String model;
    private double price;

    // Constructors
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        // Creating an object of MobilePhone
        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S23", 999.99);

        // Display phone details
        phone1.displayDetails();
    }
}
