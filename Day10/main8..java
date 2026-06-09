class Product {
    void discount() {
        System.out.println("Product Discount");
    }
}

class Electronics extends Product {
    void discount() {
        System.out.println("10% Discount");
    }
}

class Clothing extends Product {
    void discount() {
        System.out.println("20% Discount");
    }
}

class Grocery extends Product {
    void discount() {
        System.out.println("5% Discount");
    }
}

public class main8 {
    public static void main(String[] args) {
        Product p;

        p = new Electronics();
        p.discount();

        p = new Clothing();
        p.discount();

        p = new Grocery();
        p.discount();
    }
}