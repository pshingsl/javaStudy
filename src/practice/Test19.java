package practice;

import java.util.Scanner;

public class Test19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력: 123 456 -> 두 정수가 공백을 두고 입력된다.
        // 출력: 456
        // 조건: 두 정수 중 큰 값을 10진수로 출력한다.

        // 입력이 2개라서 변수 2개선언
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 조건문 또는 삼항연산자로 풀기
        if(a>b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }

        // 삼항 연산자
        int result = a>b? a:b;
        System.out.println(result);
    }
}
