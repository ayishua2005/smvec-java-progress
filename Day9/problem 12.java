interface TaxPayer {
    double calculateTax();
}

class SalariedEmployee implements TaxPayer {
    double salary;

    SalariedEmployee(double salary) {
        this.salary = salary;
    }

    public double calculateTax() {
        return salary * 0.10;
    }
}

class Freelancer implements TaxPayer {
    double income;

    Freelancer(double income) {
        this.income = income;
    }

    public double calculateTax() {
        return income * 0.15;
    }
}

class TaxReport {
    static void generateReport(TaxPayer tp) {
        System.out.println("Tax Amount = Rs." + tp.calculateTax());
    }
}

public class Problem12 {
    public static void main(String[] args) {
        TaxPayer t1 = new SalariedEmployee(500000);
        TaxPayer t2 = new Freelancer(300000);

        TaxReport.generateReport(t1);
        TaxReport.generateReport(t2);
    }
}