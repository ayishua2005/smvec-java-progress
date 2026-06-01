import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctPassword = "admin123";

        for (int i = 1; i <= 3; i++) {
            String password = sc.next();

            if (password.equals(correctPassword)) {
                System.out.println("Login Successful");
                return;
            }
        }

        System.out.println("Account Locked");
    }
}