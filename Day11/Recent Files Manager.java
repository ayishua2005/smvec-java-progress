import java.util.Stack;

public class RecentFilesManager {

    public static void main(String[] args) {

        Stack<String> files = new Stack<>();

        files.push("Main.java");
        files.push("Student.java");
        files.push("Project.java");

        System.out.println("Recently Closed File:");
        System.out.println(files.pop());

        System.out.println("Restore File:");
        System.out.println(files.peek());
    }
}