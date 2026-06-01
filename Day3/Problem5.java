import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String color = sc.next();

        if (color.equalsIgnoreCase("red")) {
            System.out.println("STOP");
        } else if (color.equalsIgnoreCase("yellow")) {
            System.out.println("WAIT");
        } else if (color.equalsIgnoreCase("green")) {
            System.out.println("GO");
        } else {
            System.out.println("INVALID SIGNAL");
        }
    }
}