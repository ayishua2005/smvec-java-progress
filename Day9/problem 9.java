interface Ticket {
    void bookTicket();
}

class BusTicket implements Ticket {
    public void bookTicket() {
        System.out.println("Bus ticket booked.");
    }
}

class TrainTicket implements Ticket {
    public void bookTicket() {
        System.out.println("Train ticket booked.");
    }
}

class FlightTicket implements Ticket {
    public void bookTicket() {
        System.out.println("Flight ticket booked.");
    }
}

public class Problem9 {
    public static void main(String[] args) {
        Ticket t;

        t = new BusTicket();
        t.bookTicket();

        t = new TrainTicket();
        t.bookTicket();

        t = new FlightTicket();
        t.bookTicket();
    }
}