import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = sc.next();

        boolean upper = false;
        boolean digit = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                upper = true;
            }

            if (Character.isDigit(ch)) {
                digit = true;
            }
        }

        if (password.length() >= 8 && upper && digit) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
}