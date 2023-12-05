package gofPatterns.structural.decorator;

public class NotificationSenderApp {

    public static void main(String[] args) {
        Notification telegramNotification = new TelegramNotification(new SmsNotification(new EmailNotification()));
        sendNotification(telegramNotification);
    }

    private static void sendNotification(Notification notification) {
        notification.send();
    }
}
