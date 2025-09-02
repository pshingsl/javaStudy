package chDI;

public class SNSNotificationService implements NotificationService{
    @Override
    public void send() {
        System.out.println("Sending sns notification : Your order has Processed");
    }
}
