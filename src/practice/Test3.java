package practice;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력: 실수 1개 입력
        // 출력: 실수 출력
        // 조건: 소숫점 세자리 반올림 출력
        double d = sc.nextDouble();
        System.out.printf("%.2f", d);
    }
}
