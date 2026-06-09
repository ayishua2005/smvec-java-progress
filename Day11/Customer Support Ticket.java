import java.util.*;

class Ticket {
    String customer;
    int priority;

    Ticket(String customer, int priority) {
        this.customer = customer;
        this.priority = priority;
    }
}

public class CustomerSupportSystem {

    public static void main(String[] args) {

        PriorityQueue<Ticket> tickets =
                new PriorityQueue<>((t1, t2) -> t2.priority - t1.priority);

        tickets.add(new Ticket("Arun", 1));
        tickets.add(new Ticket("Divya", 5));
        tickets.add(new Ticket("Kavin", 3));

        while(!tickets.isEmpty()) {
            Ticket t = tickets.poll();
            System.out.println("Processing: " +
                    t.customer + " Priority: " + t.priority);
        }
    }
}