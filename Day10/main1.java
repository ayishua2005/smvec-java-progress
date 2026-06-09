
class Book {
    void rules() {
        System.out.println("General Borrowing Rules");
    }
}

class PrintedBook extends Book {
    void rules() {
        System.out.println("Return within 15 days");
    }
}

class EBook extends Book {
    void rules() {
        System.out.println("Access for 30 days");
    }
}

public class main1 {
    public static void main(String[] args) {
        Book b;

        b = new PrintedBook();
        b.rules();

        b = new EBook();
        b.rules();
    }
}
