public class CarTest1 {
    public static void main(String[] args) {
        Car1 car1 = new Car1("Mercedes", 1990, 350000);
        car1.carDetails();
        System.out.println();
        Car1 car2 = new Car1("Porsche", 2002, 500000);
        car2.carDetails();
        System.out.println();
        Car1 car3 = new Car1("BMW", 2017, -150000);
        car3.carDetails();
        System.out.println();
        Car1 car4 = new Car1("Ferrari");
        car4.carDetails();
        System.out.println();
    }
}
