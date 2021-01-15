package structural.decorator;

public class NotificationByTelegram extends NotificationDecorator{
    public NotificationByTelegram(Notification notification) {
        super(notification);
    }

    public void notificationByTelegram() {
        System.out.println("Notify by telegram");
    }

    @Override
    public void notification() {
        super.notification();
        notificationByTelegram();
    }
}
