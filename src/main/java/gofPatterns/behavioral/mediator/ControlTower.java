package gofPatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ControlTower implements FlightControlMediator {
    private List<Colleague> colleagues;

    public ControlTower() {
        this.colleagues = new ArrayList<>();
    }

    @Override
    public void registerColleague(Colleague colleague) {
        this.colleagues.add(colleague);
    }

    @Override
    public void sendMessage(String message, Colleague originator) {
        for (Colleague colleague : colleagues) {
            // Отправляет сообщение всем, кроме отправителя
            if (colleague != originator) {
                colleague.receive(message);
            }
        }
    }
}
