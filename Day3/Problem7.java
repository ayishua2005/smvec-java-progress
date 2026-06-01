import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if (age < 5) {
            System.out.println("Free Entry");
        } else if (age <= 18) {
            System.out.println("Child Ticket - 100");
        } else {
            System.out.println("Adult Ticket - 200");
        }
    }
}