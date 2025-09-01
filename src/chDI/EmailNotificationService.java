package chDI;

public class EmailNotificationService implements NotificationService{
    @Override
    public void send() {
        System.out.println("Sending email notification : Your order has Processed");
    }
}
