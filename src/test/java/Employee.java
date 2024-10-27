public class Employee {
    private String name;
    private double salary;
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public void displayDetails(){
        System.out.println("Employee's name: " + name);
        System.out.println("Salary: " + salary);
    }
}
