interface InterestCalculator {
    void calculateInterest(double amount);
}

class SavingsAccount implements InterestCalculator {
    public void calculateInterest(double amount) {
        double interest = amount * 0.04;
        System.out.println("Savings Account Interest = Rs." + interest);
    }
}

class FixedDeposit implements InterestCalculator {
    public void calculateInterest(double amount) {
        double interest = amount * 0.07;
        System.out.println("Fixed Deposit Interest = Rs." + interest);
    }
}

class RecurringDeposit implements InterestCalculator {
    public void calculateInterest(double amount) {
        double interest = amount * 0.06;
        System.out.println("Recurring Deposit Interest = Rs." + interest);
    }
}

public class Problem8 {
    public static void main(String[] args) {
        InterestCalculator acc;

        acc = new SavingsAccount();
        acc.calculateInterest(100000);

        acc = new FixedDeposit();
        acc.calculateInterest(100000);

        acc = new RecurringDeposit();
        acc.calculateInterest(100000);
    }
}