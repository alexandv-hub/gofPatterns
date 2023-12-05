package gofPatterns.behavioral.state;

public class WritingCode implements TaskActivity {

    @Override
    public void workOnTask() {
        System.out.println("Developer is writing code...");
    }
}
