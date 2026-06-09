import java.util.*;

class Course {
    String courseName;
    int seats;

    Course(String courseName, int seats) {
        this.courseName = courseName;
        this.seats = seats;
    }
}

public class UniversityCourseRegistration {

    public static void main(String[] args) {

        ArrayList<Course> courses = new ArrayList<>();

        courses.add(new Course("Java", 5));
        courses.add(new Course("Python", 2));
        courses.add(new Course("C++", 8));

        courses.sort(Comparator.comparingInt(c -> c.seats));

        System.out.println("Available Courses:");

        for(Course c : courses) {
            System.out.println(c.courseName +
                    " Seats: " + c.seats);
        }

        LinkedList<String> waitingList = new LinkedList<>();

        waitingList.add("Arun");
        waitingList.add("Divya");
        waitingList.add("Kavin");

        System.out.println("\nWaiting List:");
        System.out.println(waitingList);

        String enrolled = waitingList.removeFirst();

        System.out.println("\nEnrolled Student:");
        System.out.println(enrolled);
    }
}