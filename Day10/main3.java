class Employee {
    void salary() {
        System.out.println("Employee Salary");
    }
}

class FullTimeEmployee extends Employee {
    void salary() {
        System.out.println("Salary = Rs.50000");
    }
}

class PartTimeEmployee extends Employee {
    void salary() {
        System.out.println("Salary = Rs.20000");
    }
}

class Intern extends Employee {
    void salary() {
        System.out.println("Salary = Rs.10000");
    }
}

public class main3 {
    public static void main(String[] args) {
        Employee e;

        e = new FullTimeEmployee();
        e.salary();

        e = new PartTimeEmployee();
        e.salary();

        e = new Intern();
        e.salary();
    }
}
