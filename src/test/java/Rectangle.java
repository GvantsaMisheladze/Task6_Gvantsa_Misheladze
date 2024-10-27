public class Rectangle extends Shape{
    private double length;
    private double width;
    public Rectangle(double length, double width){
        super("Rectangle");
        this.length = length;
        this.width = width;
    }
    public Rectangle(double side){
        this(side, side);
    }

    @Override
    public void area() {
        double area = length * width;
        if (length == width) {
            System.out.println("Area of Square: " + area);
        } else {
            System.out.println("Area of Rectangle: " + area);
        }
    }
}
