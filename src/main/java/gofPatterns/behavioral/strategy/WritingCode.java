package gofPatterns.behavioral.strategy;

public class WritingCode implements TaskActivity {

    @Override
    public void workOnTask() {
        System.out.println("Developer is writing code...");
    }
}
