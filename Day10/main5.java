class Patient {
    void bill() {
        System.out.println("Patient Bill");
    }
}

class InPatient extends Patient {
    void bill() {
        System.out.println("Bill = Rs.5000");
    }
}

class OutPatient extends Patient {
    void bill() {
        System.out.println("Bill = Rs.500");
    }
}

public class main5 {
    public static void main(String[] args) {
        Patient p;

        p = new InPatient();
        p.bill();

        p = new OutPatient();
        p.bill();
    }
}