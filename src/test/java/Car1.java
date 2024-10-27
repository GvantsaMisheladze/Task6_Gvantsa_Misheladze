public class Car1 {
    private String model;
    private int year;
    private double price;

    public Car1(String model, int year, double price){
        this.model = model;
        if (year < 2000 || year > 2024){
            System.out.println("Error!");
        } else {
            this.year = year;
        }
        if (price < 0){
            System.out.println("Error!");
        }else {
            this.price = price;
        }
    }
    public Car1(String model){
        this(model, 2020, 275000);
    }
    public void carDetails(){
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
    }
}
