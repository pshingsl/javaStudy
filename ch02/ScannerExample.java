package javaStudy.ch02;

// Scannser를 사용하기 위해 import문 추가
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Scannser클래스의 객체 생성
        Scanner sc = new Scanner(System.in);

        // 입력
        System.out.println("입력:" ) ;

        // 문자열 입력
        String str = sc.nextLine();
        System.out.println("문자열 입력: " + str);
        
        // 정수 입력
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        int res = v1 + v2;
        System.out.println("정수 v1 입력: " + v1);
        System.out.println("정수 v2 입력: " + v2);
        System.out.println("덧셈 입력:" + res);
        // 실수 입력
        double v3 = sc.nextDouble();
        System.out.println("소수 입력: " + v3);
    }
}
