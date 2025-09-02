package chDI;

public class Main {
    public static void main(String[] args) {
        /**
         * NotificationService(이메일 메서드, sns메서드)가 있다
         * 오더 서비스(이메일, sns)있는데 이메일 사용을 위해 서비스 객체로 값으로 이메일 선택
         * 오더 서비스
         *  ㄴ 이메일, sns
         */
        NotificationService email = new EmailNotificationService();
        OrderService service = new OrderService(email);
        service.processOrder();
        System.out.println("===");

        NotificationService sns = new SNSNotificationService();
        service.setNotificationService(sns);
        service.processOrder();
        /**
         * 메인
         * ㄴ서비스
         *  ㄴ인터페이스
         *    ㄴ sns, email
         * */

    }
}
