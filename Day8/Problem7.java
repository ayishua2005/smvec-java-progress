class Product {
    double price;
    static double gst = 0.18;

    Product(double price) {
        this.price = price;
    }

    double total() {
        return price;
    }
}

class DiscountedProduct extends Product {
    DiscountedProduct(double price) {
        super(price);
    }

    double total() {
        return price - 100;
    }
}

public class Problem7{
    public static void main(String[] args) {
        Product p = new DiscountedProduct(1000);
        System.out.println(p.total());
    }
}