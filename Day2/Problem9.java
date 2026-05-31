import java.util.Scanner;

public class Problem9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = sc.nextInt();
        int amount = sc.nextInt();

        if (amount % 100 == 0 && (balance - amount) >= 1000) {
            System.out.println("Withdrawal Successful");
        } else {
            System.out.println("Withdrawal Failed");
        }
    }
}