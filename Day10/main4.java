class Payment {
    void process() {
        System.out.println("Payment Processing");
    }
}

class CreditCardPayment extends Payment {
    void process() {
        System.out.println("Credit Card Payment");
    }
}

class UpiPayment extends Payment {
    void process() {
        System.out.println("UPI Payment");
    }
}

class NetBankingPayment extends Payment {
    void process() {
        System.out.println("Net Banking Payment");
    }
}

public class main4 {
    public static void main(String[] args) {
        Payment p;

        p = new CreditCardPayment();
        p.process();

        p = new UpiPayment();
        p.process();

        p = new NetBankingPayment();
        p.process();
    }
}