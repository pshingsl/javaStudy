package javaStudy.ch08;

public class Ex8_1 {
    public static void main(String[] args) {
        // 예외
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0 / 0);
            System.out.println(4);
        } catch (ArithmeticException e) { // 산술연산 에러
            if(e instanceof ArithmeticException)
                System.out.println("true");
            System.out.println("0으로나눌 수 없습니다.");
        } catch (Exception e){ // 모든 예외의 최고조상
            System.out.println("예외 발생");
        }
        System.out.println("종료");
    }
}
