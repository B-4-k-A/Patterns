package structural.decorator;

public class NotificationByVk extends NotificationDecorator{
    public NotificationByVk(Notification notification) {
        super(notification);
    }

    public void notificationByVk() {
        System.out.println("Notify by VK");
    }

    @Override
    public void notification() {
        super.notification();
        notificationByVk();
    }
}

