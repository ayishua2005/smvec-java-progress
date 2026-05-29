
public class Problem1 {
    public static void main(String[] args) {
        /**
         * 1 *
         * 2 * *
         * 3 * * *
         * 4 * * * *
         */
        int n = 5;

        boolean isIncreasing = true;
        int count = 1;
        for (int i = 1; i <= 2 * n - 1; i++, System.out.println()) {
            if (isIncreasing) {
                for (int j = 1; j <= count; j++) {
                    if (j == 1 || j == count) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                if (count == n) {
                    isIncreasing = false;
                    continue;
                }
                count++;
            } else {
                count--;
                for (int j = 1; j <= count; j++) {
                    if (j == 1 || j == count) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
        }

    }
}
