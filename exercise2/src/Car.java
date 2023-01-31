public class Car {
    private String make;
    private String model;
    private int year;
    private String color;
    private double price;

    public Car() {
        this.make = "";
        this.model = "";
        this.year = 0;
        this.color = "";
        this.price = 0.0;
    }

    public Car(String make, String model, int year) {
        this();
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Car(String make, String model, int year, String color, double price) {
        this(make, model, year);
        this.color = color;
        this.price = price;
    }

    public void displayCarInfo() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year + ", Color: " + color + ", Price: " + price);
    }
}
