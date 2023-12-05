package gofPatterns.behavioral.strategy;

public class Task {
    TaskActivity activity;

    public void setActivity(TaskActivity activity) {
        this.activity = activity;
    }

    public void workOnTask() {
        activity.workOnTask();
    }
}
