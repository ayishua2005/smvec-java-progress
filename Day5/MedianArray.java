import java.util.Arrays;

public class MedianArray {
    public static void main(String[] args) {
        int a[] = {7, 2, 5, 1, 9};

        Arrays.sort(a);

        int n = a.length;

        if (n % 2 == 1)
            System.out.println("Median = " + a[n / 2]);
        else
            System.out.println("Median = " + (a[n / 2 - 1] + a[n / 2]) / 2.0);
    }
}