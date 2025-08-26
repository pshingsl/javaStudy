package practice;

import java.util.Scanner;

public class Test23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력: 정수 1개가 입력된다. -2147483648
        // 출력: minus even
        // 조건: 입력된 정수에 대해 첫 줄에 minus 나 plus 를 출력하고,두 번째 줄에 odd 나 even 을 출력한다.

        // 입력이 1개라서 변수 1개선언
        int a = sc.nextInt();

        // 마이너스/플러스 구분
        if (a < 0) {
            System.out.println("minus");
        } else {
            System.out.println("plus");
        }

        // 짝/홀 구분
        if (a % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
