interface Attendable {
    void markAttendance();
}

class StudentAttendance implements Attendable {
    public void markAttendance() {
        System.out.println("Student attendance marked.");
    }
}

class FacultyAttendance implements Attendable {
    public void markAttendance() {
        System.out.println("Faculty attendance marked.");
    }
}

public class Problem13 {
    public static void main(String[] args) {
        Attendable a;

        a = new StudentAttendance();
        a.markAttendance();

        a = new FacultyAttendance();
        a.markAttendance();
    }
}