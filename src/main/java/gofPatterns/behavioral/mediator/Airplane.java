package gofPatterns.behavioral.mediator;

public class Airplane extends Colleague {
    private String identifier;

    public Airplane(FlightControlMediator mediator, String identifier) {
        super(mediator);
        this.identifier = identifier;
    }

    @Override
    public void send(String message) {
        System.out.println(identifier + " sends message: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(identifier + " received message: " + message);
    }
}
