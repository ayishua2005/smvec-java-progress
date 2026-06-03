class Student {
    String name;
    int rollNo;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

public class Problem1{
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "John";
        s.rollNo = 101;
        s.display();
    }
}