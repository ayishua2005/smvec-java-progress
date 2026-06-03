class Employee {
    private int salary;

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}

public class Problem3{
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setSalary(50000);
        System.out.println("Salary: " + e.getSalary());
    }
}