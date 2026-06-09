interface Sellable {
    void sell();
}

class ECommerceProduct implements Sellable {
    private String productName;
    private double productPrice;

    ECommerceProduct(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public void sell() {
        System.out.println(productName +
                " sold for Rs." + productPrice);
    }
}

public class Problem14 {
    public static void main(String[] args) {

        ECommerceProduct p1 =
                new ECommerceProduct("Laptop", 65000);

        ECommerceProduct p2 =
                new ECommerceProduct("Mobile", 25000);

        p1.sell();
        p2.sell();
    }
}