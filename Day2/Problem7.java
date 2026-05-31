import java.util.Scanner;

public class Problem7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        double avg = (m1 + m2 + m3) / 3.0;

        if (m1 >= 35 && m2 >= 35 && m3 >= 35 && avg >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}