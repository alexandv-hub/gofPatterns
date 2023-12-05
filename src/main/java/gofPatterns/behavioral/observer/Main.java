package gofPatterns.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        JiraTask jiraTask = new JiraTask("New Super Feature");

        Developer developer1 = new Developer("Victor");
        Developer developer2 = new Developer("Alex");

        jiraTask.addObserver(developer1);
        jiraTask.addObserver(developer2);

        jiraTask.changeTaskState("In Progress");
    }
}
