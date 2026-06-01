Square Odd Numbers:


import java.util.*;
public class Main {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++) {
            int odd = 1;

            for(int j = 1; j <= n; j++) {
                System.out.print(odd + " ");
                odd += 2;
            }

            System.out.println();
        }
    }
}