package structural.decorator;

public class Notify {
    public static void main(String[] args) {
        Notification notification = new NotificationByFacebook(new NotificationByNumber());




        notification.notification();
    }
}
