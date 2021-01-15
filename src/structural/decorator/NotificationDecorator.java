package structural.decorator;

public class NotificationDecorator implements Notification{
    Notification notification;

    public NotificationDecorator(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void notification() {
        notification.notification();
    }
}
