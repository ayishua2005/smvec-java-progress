import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double p = sc.nextDouble();
        double r = sc.nextDouble();
        int t = sc.nextInt();

        double amount = p * Math.pow((1 + r / 100), t);

        System.out.println(amount);
    }
}