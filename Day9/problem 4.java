interface Payment {
    void processPayment(double amount);
}

class UPI implements Payment {
    public void processPayment(double amount) {
        System.out.println("UPI Payment of Rs." + amount + " processed.");
    }
}

class CreditCard implements Payment {
    public void processPayment(double amount) {
        System.out.println("Credit Card Payment of Rs." + amount + " processed.");
    }
}

class Wallet implements Payment {
    public void processPayment(double amount) {
        System.out.println("Wallet Payment of Rs." + amount + " processed.");
    }
}

public class Problem4 {
    public static void main(String[] args) {
        Payment p;

        p = new UPI();
        p.processPayment(1000);

        p = new CreditCard();
        p.processPayment(2500);

        p = new Wallet();
        p.processPayment(500);
    }
}