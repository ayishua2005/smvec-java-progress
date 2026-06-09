class Ride {
    void fare() {
        System.out.println("Ride Fare");
    }
}

class BikeRide extends Ride {
    void fare() {
        System.out.println("Bike Fare = Rs.50");
    }
}

class AutoRide extends Ride {
    void fare() {
        System.out.println("Auto Fare = Rs.100");
    }
}

class CabRide extends Ride {
    void fare() {
        System.out.println("Cab Fare = Rs.200");
    }
}

public class main10 {
    public static void main(String[] args) {
        Ride r;

        r = new BikeRide();
        r.fare();

        r = new AutoRide();
        r.fare();

        r = new CabRide();
        r.fare();
    }
}