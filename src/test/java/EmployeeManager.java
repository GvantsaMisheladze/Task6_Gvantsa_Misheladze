public class EmployeeManager {
    public static void main(String[] args) {
        Employee employee = new Employee("Gvantsa", 5000);
        employee.displayDetails();
        System.out.println();

        Manager manager = new Manager("Mariami", 7000, "Quality Assurance");
        manager.displayDetails();
    }
}
