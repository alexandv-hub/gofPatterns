package gofPatterns.behavioral.mediator;

public interface FlightControlMediator {
    void sendMessage(String message, Colleague colleague);
    void registerColleague(Colleague colleague);
}
