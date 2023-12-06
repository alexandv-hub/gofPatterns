package gofPatterns.behavioral.mediator;

public class AirportApp {
    public static void main(String[] args) {
        FlightControlMediator mediator = new ControlTower();

        Airplane flightA = new Airplane(mediator, "Flight A");
        Airplane flightB = new Airplane(mediator, "Flight B");
        Airplane flightC = new Airplane(mediator, "Flight C");

        mediator.registerColleague(flightA);
        mediator.registerColleague(flightB);
        mediator.registerColleague(flightC);

        flightA.send("Requesting permission to land.");
        flightB.send("Requesting permission to take off.");
    }
}
