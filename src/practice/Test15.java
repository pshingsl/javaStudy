package practice;

import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력: 정수 1개가 입력된다
        // 출력: 1입력시 0 0입력시 1출력
        // 조건: 단, 0 또는 1 만 입력된다.

        int a = sc.nextInt();
        switch (a) {
            case 0:
                System.out.println(1);
                break;
            case 1:
                System.out.println(0);
                break;
            default:
                System.out.println("잘못 입력하셨습니다.");
        }
    }
}
