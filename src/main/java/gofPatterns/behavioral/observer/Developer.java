package gofPatterns.behavioral.observer;

public class Developer implements Observer {
    private String name;

    public Developer(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Dear " + name + ", the Jira task you are subscribed to has updates: " + message);
    }
}
