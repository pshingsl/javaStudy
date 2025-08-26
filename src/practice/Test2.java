package practice;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 문자 1개 입력
        // 출력: 문자 출력
        // 조건: 대,소문자 및 숫자를 비롯한 아스키 코드로 표현
        char c = sc.next().charAt(0);
        System.out.println(c);
    }
}