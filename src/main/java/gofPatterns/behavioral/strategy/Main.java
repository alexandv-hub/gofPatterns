package gofPatterns.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        Task task = new Task();

        task.setActivity(new ClarifyingRequirements());
        task.workOnTask();

        task.setActivity(new DesigningSolution());
        task.workOnTask();

        task.setActivity(new WritingCode());
        task.workOnTask();

        task.setActivity(new Testing());
        task.workOnTask();

        task.setActivity(new ProductionDeployment());
        task.workOnTask();
    }
}
