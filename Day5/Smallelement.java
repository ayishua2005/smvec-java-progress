public class Smallelement {
    public static void main(String[] args) {
        int a[] = {10, 25, 8, 50, 30};
        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }

        System.out.println("Largest = " + max);
    }
}