package structural.decorator;

public class NotificationByNumber implements Notification{

    public void notificationByNumber() {
        System.out.println("Notify by number");
    }

    @Override
    public void notification() {
        notificationByNumber();
    }
}
