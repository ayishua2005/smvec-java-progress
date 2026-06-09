import java.util.*;

class Product {
    String name;
    double price;
    int quantity;

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}

public class ProductInventorySystem {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("Laptop", 55000, 10));
        products.add(new Product("Mouse", 500, 50));
        products.add(new Product("Keyboard", 1200, 20));

        System.out.println("Sort By Price:");

        products.sort(Comparator.comparingDouble(p -> p.price));

        for(Product p : products) {
            System.out.println(p.name + " " + p.price);
        }

        System.out.println("\nSort By Quantity:");

        products.sort(Comparator.comparingInt(p -> p.quantity));

        for(Product p : products) {
            System.out.println(p.name + " " + p.quantity);
        }
    }
}