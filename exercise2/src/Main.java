public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car("Mercedes Benz", "GLE", 2020);
        Car car3 = new Car("Mercedes Benz", "GLA", 2021, "Red", 25000.0);

        System.out.println("Car 1:");
        car1.displayCarInfo();

        System.out.println("Car 2:");
        car2.displayCarInfo();

        System.out.println("Car 3:");
        car3.displayCarInfo();
    }
}