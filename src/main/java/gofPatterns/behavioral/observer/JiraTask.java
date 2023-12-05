package gofPatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class JiraTask implements Observed {

    private List<Observer> observers = new ArrayList<>();
    private String taskName;

    public JiraTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void changeTaskState(String newState) {
        System.out.println("Task '" + taskName + "' state changed to: " + newState);
        notifyObservers(newState);
    }
}
