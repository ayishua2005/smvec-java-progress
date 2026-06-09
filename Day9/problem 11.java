interface Rentable {
    void rent();
    void returnVehicle();
}

class Bike implements Rentable {
    public void rent() {
        System.out.println("Bike rented.");
    }

    public void returnVehicle() {
        System.out.println("Bike returned.");
    }
}

class Car implements Rentable {
    public void rent() {
        System.out.println("Car rented.");
    }

    public void returnVehicle() {
        System.out.println("Car returned.");
    }
}

class Van implements Rentable {
    public void rent() {
        System.out.println("Van rented.");
    }

    public void returnVehicle() {
        System.out.println("Van returned.");
    }
}

public class Problem11 {
    public static void main(String[] args) {
        Rentable r;

        r = new Bike();
        r.rent();
        r.returnVehicle();

        r = new Car();
        r.rent();
        r.returnVehicle();

        r = new Van();
        r.rent();
        r.returnVehicle();
    }
}