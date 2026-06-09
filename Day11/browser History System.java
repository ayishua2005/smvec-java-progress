import java.util.Stack;

public class BrowserHistory {

    public static void main(String[] args) {

        Stack<String> history = new Stack<>();

        history.push("Google");
        history.push("YouTube");
        history.push("ChatGPT");

        System.out.println("Current Page: " + history.peek());

        history.pop();

        System.out.println("After Back:");
        System.out.println("Current Page: " + history.peek());
    }
}