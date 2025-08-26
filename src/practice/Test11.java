package practice;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력: 정수 1개가 입력된다.
        // 조건: (단, 입력되는 정수의 범위는 0 ~ 4294967295 이다.)
        // 출력: 2147483648

        long a = sc.nextLong();
        System.out.println(a);
    }
}
