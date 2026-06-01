import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean server = sc.nextBoolean();
        boolean database = sc.nextBoolean();

        if (!server) {
            System.out.println("Critical Error");
        } else if (!database) {
            System.out.println("Database Error");
        } else {
            System.out.println("System Running Normally");
        }
    }
}