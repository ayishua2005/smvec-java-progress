interface FoodOrder {
    void placeOrder();
}

class Pizza implements FoodOrder {
    public void placeOrder() {
        System.out.println("Pizza order placed.");
    }
}

class Burger implements FoodOrder {
    public void placeOrder() {
        System.out.println("Burger order placed.");
    }
}

class Beverage implements FoodOrder {
    public void placeOrder() {
        System.out.println("Beverage order placed.");
    }
}

public class Problem6 {
    public static void main(String[] args) {
        FoodOrder order;

        order = new Pizza();
        order.placeOrder();

        order = new Burger();
        order.placeOrder();

        order = new Beverage();
        order.placeOrder();
    }
}