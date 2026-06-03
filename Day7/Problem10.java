class Employee {
    String name;
    int id;

    Employee(String n, int i) {
        name = n;
        id = i;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

public class Problem10{
    public static void main(String[] args) {
        Employee e = new Employee("Rahul", 1001);
        e.display();
    }
}