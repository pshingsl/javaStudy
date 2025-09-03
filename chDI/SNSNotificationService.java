package javaStudy.chDI;

public class SNSNotificationService implements NotificationService{
    @Override
    public void service() {
        System.out.println("Sending sns notification: Your Order has been processed");
    }
}
