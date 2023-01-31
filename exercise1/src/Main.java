public class Main {
    public static void main(String[] args) {

        Circle c1 = new Circle(2.0);
        Circle c2 = new Circle(12);
        Circle c3 = new Circle(24);

        System.out.println("Radius of Circle 1: " + c1.getRadius());
        System.out.println("Area of Circle 1: " + c1.getArea());

        System.out.println("Radius of Circle 2: " + c2.getRadius());
        System.out.println("Area of Circle 2: " + c2.getArea());

        System.out.println("Radius of Circle 3: " + c3.getRadius());
        System.out.println("Area of Circle 3: " + c3.getArea());
    }
}