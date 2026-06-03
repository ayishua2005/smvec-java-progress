class Rectangle {
    int length = 10;
    int width = 5;

    void area() {
        System.out.println("Area = " + (length * width));
    }
}

public class Problem2{
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.area();
    }
}