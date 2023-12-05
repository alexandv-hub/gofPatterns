package gofPatterns.structural.decorator;

public class TelegramNotification implements Notification {

    private Notification notification;

    public TelegramNotification() {
    }

    public TelegramNotification(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void send() {
        if (notification != null) {
            notification.send();
        }
        System.out.println("Telegram notification sent.");
    }
}
