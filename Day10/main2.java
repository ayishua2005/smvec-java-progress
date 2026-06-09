class FoodItem {
    void bill() {
        System.out.println("Food Bill");
    }
}

class Pizza extends FoodItem {
    void bill() {
        System.out.println("Pizza = Rs.250");
    }
}

class Burger extends FoodItem {
    void bill() {
        System.out.println("Burger = Rs.150");
    }
}

class Dessert extends FoodItem {
    void bill() {
        System.out.println("Dessert = Rs.100");
    }
}

public class main2 {
    public static void main(String[] args) {
        FoodItem f;

        f = new Pizza();
        f.bill();

        f = new Burger();
        f.bill();

        f = new Dessert();
        f.bill();
    }
}
