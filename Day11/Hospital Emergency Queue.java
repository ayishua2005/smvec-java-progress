import java.util.*;

class Patient {
    String name;
    int severity;

    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}

public class HospitalEmergencyQueue {
    public static void main(String[] args) {

        PriorityQueue<Patient> queue =
                new PriorityQueue<>((p1, p2) -> p2.severity - p1.severity);

        queue.add(new Patient("Arun", 3));
        queue.add(new Patient("Divya", 9));
        queue.add(new Patient("Kavin", 5));

        while(!queue.isEmpty()) {
            Patient p = queue.poll();
            System.out.println(p.name + " Severity: " + p.severity);
        }
    }
}