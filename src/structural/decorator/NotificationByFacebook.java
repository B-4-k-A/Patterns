package structural.decorator;

public class NotificationByFacebook extends NotificationDecorator{

    public NotificationByFacebook(Notification notification) {
        super(notification);
    }

    public void notificationByFacebook() {
        System.out.println("Notify by facebook");
    }

    @Override
    public void notification() {
        super.notification();
        notificationByFacebook();
    }
}
