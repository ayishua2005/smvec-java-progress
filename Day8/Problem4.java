class Account {
    double balance;
    static String bank = "SBI";

    Account(double balance) {
        this.balance = balance;
    }

    double interest() {
        return 0;
    }
}

class SavingsAccount extends Account {
    SavingsAccount(double balance) {
        super(balance);
    }

    double interest() {
        return balance * 0.05;
    }
}

public class Problem4{
    public static void main(String[] args) {
        Account a = new SavingsAccount(1000);
        System.out.println(a.interest());
    }
}