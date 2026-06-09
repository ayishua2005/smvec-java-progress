class Course {
    void benefit() {
        System.out.println("Course Benefit");
    }
}

class LiveCourse extends Course {
    void benefit() {
        System.out.println("Live Interaction");
    }
}

class RecordedCourse extends Course {
    void benefit() {
        System.out.println("Learn Anytime");
    }
}

class CertificationCourse extends Course {
    void benefit() {
        System.out.println("Get Certificate");
    }
}

public class main7 {
    public static void main(String[] args) {
        Course c;

        c = new LiveCourse();
        c.benefit();

        c = new RecordedCourse();
        c.benefit();

        c = new CertificationCourse();
        c.benefit();
    }
}