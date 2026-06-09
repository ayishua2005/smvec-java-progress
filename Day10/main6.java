class Vehicle {
    void toll() {
        System.out.println("Vehicle Toll");
    }
}

class Car extends Vehicle {
    void toll() {
        System.out.println("Car Toll = Rs.50");
    }
}

class Bus extends Vehicle {
    void toll() {
        System.out.println("Bus Toll = Rs.100");
    }
}

class Truck extends Vehicle {
    void toll() {
        System.out.println("Truck Toll = Rs.150");
    }
}

public class main6 {
    public static void main(String[] args) {
        Vehicle v;

        v = new Car();
        v.toll();

        v = new Bus();
        v.toll();

        v = new Truck();
        v.toll();
    }
}