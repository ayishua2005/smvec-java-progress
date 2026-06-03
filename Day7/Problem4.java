class Car {
    String brand = "Toyota";

    void show() {
        System.out.println("Brand: " + brand);
    }
}

public class Problem4{
    public static void main(String[] args) {
        Car c = new Car();
        c.show();
    }
}