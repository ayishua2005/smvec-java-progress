import java.util.Scanner;

public class Problem6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        double salary = sc.nextDouble();
        boolean activeLoan = sc.nextBoolean();

        if (age >= 21 && salary >= 30000 && !activeLoan) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
    }
}