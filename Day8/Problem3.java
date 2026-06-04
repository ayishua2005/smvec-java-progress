class Vehicle {
    String model;
    static String showroom = "Royal";

    Vehicle(String model) {
        this.model = model;
    }

    void show() {
        System.out.println("Vehicle: " + model);
    }
}

class Car extends Vehicle {
    Car(String model) {
        super(model);
    }

    void show() {
        System.out.println("Car: " + model + " " + showroom);
    }
}

public class Problem3{
    public static void main(String[] args) {
        Vehicle v = new Car("BMW");
        v.show();
    }
}