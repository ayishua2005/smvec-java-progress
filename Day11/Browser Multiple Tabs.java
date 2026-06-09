import java.util.*;

public class MultiTabBrowser {

    public static void main(String[] args) {

        LinkedList<String> tabs = new LinkedList<>();
        Stack<String> history = new Stack<>();

        tabs.add("Google");
        tabs.add("YouTube");
        tabs.add("ChatGPT");

        history.push("Google");
        history.push("YouTube");
        history.push("ChatGPT");

        System.out.println("Open Tabs:");
        System.out.println(tabs);

        history.pop();

        System.out.println("After Back:");
        System.out.println("Current Page: " + history.peek());
    }
}