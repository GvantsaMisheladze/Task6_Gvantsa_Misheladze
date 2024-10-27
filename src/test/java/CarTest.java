public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("Mercedes", 2002, 300000);
        car1.displayCarDetails();
        System.out.println();
        Car car2 = new Car("Porsche", 1999, 450000);
        car2.displayCarDetails();
        System.out.println();
        Car car3 = new Car("BMW", 2019, -175000);
        car3.displayCarDetails();
        System.out.println();
    }
}
