class Person {
    String name;
    static String school = "ABC";

    Person(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Person: " + name);
    }
}

class Student extends Person {
    Student(String name) {
        super(name);
    }

    void show() {
        System.out.println("Student: " + name + " " + school);
    }
}

public class Problem1{
    public static void main(String[] args) {
        Person p = new Student("Arun");
        p.show();
    }
}