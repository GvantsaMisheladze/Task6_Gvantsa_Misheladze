public class Car {
    private String model;
    private int year;
    private double price;

    public Car(String model, int year, double price){
        this.model = model;
        if (year < 2000 || year > 2024){
            System.out.println("Error. Year must be between 2000 and 2024! Provided year: " + year);
            this.year = 0;
        } else {
            this.year = year;
        }
        if (price < 0){
            System.out.println("Error. Price can't be negative! Provided price: " + price);
            this.price = 0;
        } else {
            this.price = price;
        }
    }
    public void displayDetails(){
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
    }
}
