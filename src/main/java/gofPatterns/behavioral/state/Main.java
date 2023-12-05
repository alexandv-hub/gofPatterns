package gofPatterns.behavioral.state;

public class Main {
    public static void main(String[] args) {
        TaskActivity activity = new ClarifyingRequirements();
        Task task = new Task();

        task.setActivity(activity);

        for (int i = 0; i < 15; i++) {
            task.workOnTask();
            task.changeActivity();
        }
    }
}
