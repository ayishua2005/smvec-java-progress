import java.util.Stack;

public class TextEditor {

    public static void main(String[] args) {

        Stack<String> text = new Stack<>();

        text.push("Hello");
        text.push("Hello World");
        text.push("Hello World Java");

        System.out.println("Current Text:");
        System.out.println(text.peek());

        text.pop();

        System.out.println("After Undo:");
        System.out.println(text.peek());
    }
}