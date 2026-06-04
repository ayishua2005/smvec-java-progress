class Book {
    String name;
    static String library = "City";

    Book(String name) {
        this.name = name;
    }

    void show() {
        System.out.println(name);
    }
}

class EBook extends Book {
    EBook(String name) {
        super(name);
    }

    void show() {
        System.out.println(name + " " + library);
    }
}

public class Problem6{
    public static void main(String[] args) {
        Book b = new EBook("Java");
        b.show();
    }
}