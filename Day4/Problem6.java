Square Even Numbers:

import java.util.*;
public class Main {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++) {
            int even = 2;

            for(int j = 1; j <= n; j++) {
                System.out.print(even + " ");
                even += 2;
            }

            System.out.println();
        }
    }
}