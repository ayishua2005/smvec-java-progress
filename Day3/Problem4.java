import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salary = sc.nextDouble();
        int experience = sc.nextInt();

        double bonus;

        if (experience > 5) {
            bonus = salary * 0.20;
        } else {
            bonus = salary * 0.10;
        }

        double finalSalary = salary + bonus;

        System.out.println(finalSalary);
    }
}