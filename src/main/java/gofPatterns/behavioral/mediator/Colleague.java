package gofPatterns.behavioral.mediator;

public abstract class Colleague {
    protected FlightControlMediator mediator;

    public Colleague(FlightControlMediator mediator) {
        this.mediator = mediator;
    }

    public abstract void send(String message);
    public abstract void receive(String message);
}
