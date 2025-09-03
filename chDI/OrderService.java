package javaStudy.chDI;

public class OrderService {
    private NotificationService notificationService;
    // 생성자
    public OrderService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    // setter
    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    // 생성자 주입 -> 인터페이스로 생성자 만듬 -> 인터페이스(sns, email) 연결 ->
    // 해당 클래스 메소드를 가짐

    public void processOrder() {
        System.out.println("Order processed successfully");
        notificationService.service();
    }
}
