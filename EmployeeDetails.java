public class EmployeeDetails {
    private String name;
    private int id;
    private int salary;

    public EmployeeDetails(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void displayDetails() {
        System.out.println("Employee Details: ");
        System.out.println("Name "+ name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        // Creating an Employee object
        EmployeeDetails employee = new EmployeeDetails("Yagyata", 211, 50000);

        // Displaying employee details
        employee.displayDetails();
    }
}
