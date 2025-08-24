package practice;

import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력: 65 입력 10진 정수 1개(0 ~ 255 범위)가 입력된다.
        // 출력: A
        // 조건: 숫자 입력시 아스키문자 변환 -> 형변환 이해도

        int a = sc.nextInt();
        char d = (char) a;
        System.out.println(d);
    }

}
