public class CircleArea {
    private double radius;

    //Constructor
    public CircleArea(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public void displayDetails() {
        System.out.println("Area of Circle : " + area());
        System.out.println("Circumference of Circle: " +circumference());
    }

    public static void main(String[] args) {
        // Creating a Circle object
        CircleArea circle = new CircleArea(4);

        // Displaying circle details
        circle.displayDetails();
    }
}

