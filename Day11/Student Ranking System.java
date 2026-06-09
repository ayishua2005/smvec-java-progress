import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class StudentRankingSystem {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Arun", 85));
        students.add(new Student("Divya", 95));
        students.add(new Student("Kavin", 75));
        students.add(new Student("Priya", 90));

        Collections.sort(students, (s1, s2) -> s2.marks - s1.marks);

        System.out.println("Student Rankings:");

        int rank = 1;
        for(Student s : students) {
            System.out.println(rank + ". " + s.name + " - " + s.marks);
            rank++;
        }
    }
}