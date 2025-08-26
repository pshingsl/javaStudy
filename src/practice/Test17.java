package practice;

import java.util.Scanner;

public class Test17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력: 1 1 -> 1 또는 0의 값만 가지는 2개의 정수가 공백을 두고 입력
        // 출력: 0
        // 조건: 참/거짓이 서로 다를 때에만 1을 출력하고, 그 외의 경우에는 0을 출력한다.

        // 입력이 2개라서 변수 2개선언
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 참/거짓이 서로 다를 때 1출력 0 1-> 1, 1 0-> 1 0 0 ->-0 1 1->0
        if (a == 1 && b == 1) {
            System.out.println(0);
        } else if (a == 0 && b == 0) {
            System.out.println(0);
        } else{
            System.out.println(1);
        }
    }
}
