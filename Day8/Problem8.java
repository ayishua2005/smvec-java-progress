class Ticket {
    double fare;

    Ticket(double fare) {
        this.fare = fare;
    }

    double cost() {
        return fare;
    }
}

class MovieTicket extends Ticket {
    MovieTicket(double fare) {
        super(fare);
    }

    double cost() {
        return fare + 50;
    }
}

public class Problem8{
    public static void main(String[] args) {
        Ticket t = new MovieTicket(200);
        System.out.println(t.cost());
    }
}