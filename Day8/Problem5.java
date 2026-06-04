class Shape {
    double area() {
        return 0;
    }
}

class Circle extends Shape {
    double r = 5;

    double area() {
        return 3.14 * r * r;
    }
}

public class Problem5{
    public static void main(String[] args) {
        Shape s = new Circle();
        System.out.println(s.area());
    }
}