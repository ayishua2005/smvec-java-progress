import java.util.*;

class Order {
    String orderId;
    int distance;

    Order(String orderId, int distance) {
        this.orderId = orderId;
        this.distance = distance;
    }
}

public class DeliveryScheduling {

    public static void main(String[] args) {

        PriorityQueue<Order> orders =
                new PriorityQueue<>(Comparator.comparingInt(o -> o.distance));

        orders.add(new Order("ORD101", 10));
        orders.add(new Order("ORD102", 5));
        orders.add(new Order("ORD103", 20));

        while(!orders.isEmpty()) {
            Order o = orders.poll();

            System.out.println(
                    o.orderId + " Distance: " + o.distance);
        }
    }
}