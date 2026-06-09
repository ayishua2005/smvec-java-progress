class Account {
    void interest() {
        System.out.println("Account Interest");
    }
}

class SavingsAccount extends Account {
    void interest() {
        System.out.println("Interest = 5%");
    }
}

class CurrentAccount extends Account {
    void interest() {
        System.out.println("Interest = 3%");
    }
}

public class main9{
    public static void main(String[] args) {
        Account a;

        a = new SavingsAccount();
        a.interest();

        a = new CurrentAccount();
        a.interest();
    }
}