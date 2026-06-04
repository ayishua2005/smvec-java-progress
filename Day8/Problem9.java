class Patient {
    double bill;

    Patient(double bill) {
        this.bill = bill;
    }

    double total() {
        return bill;
    }
}

class InPatient extends Patient {
    InPatient(double bill) {
        super(bill);
    }

    double total() {
        return bill + 500;
    }
}

public class Problem9{
    public static void main(String[] args) {
        Patient p = new InPatient(1000);
        System.out.println(p.total());
    }
}