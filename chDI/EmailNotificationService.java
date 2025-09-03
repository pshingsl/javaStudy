package javaStudy.chDI;

public class EmailNotificationService implements NotificationService{
    @Override
    public void service() {
        System.out.println("Sending email notification: Your Order has been processed");
    }
}
