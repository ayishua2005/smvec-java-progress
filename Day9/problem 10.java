interface Exam {
    void evaluate();
}

class MCQExam implements Exam {
    public void evaluate() {
        System.out.println("Evaluating MCQ Exam.");
    }
}

class CodingExam implements Exam {
    public void evaluate() {
        System.out.println("Evaluating Coding Exam.");
    }
}

class VivaExam implements Exam {
    public void evaluate() {
        System.out.println("Evaluating Viva Exam.");
    }
}

public class Problem10 {
    public static void main(String[] args) {
        Exam e;

        e = new MCQExam();
        e.evaluate();

        e = new CodingExam();
        e.evaluate();

        e = new VivaExam();
        e.evaluate();
    }
}