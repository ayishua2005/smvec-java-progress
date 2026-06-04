class Course {
    String name;
    static String platform = "Udemy";

    Course(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Course: " + name);
    }
}

class OnlineCourse extends Course {
    OnlineCourse(String name) {
        super(name);
    }

    void show() {
        System.out.println("Online Course: " + name + " " + platform);
    }
}

public class Problem10{
    public static void main(String[] args) {
        Course c = new OnlineCourse("Java");
        c.show();
    }
}