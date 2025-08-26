package practice;

import java.util.Scanner;

public class Test21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력: 세 정수 a, b, c 가 공백을 두고 입력된다. 1 2 4
        // 출력: 2 4
        // 조건: 짝수만 순서대로 줄을 바꿔 출력한다.

        // 입력이 3개라서 변수 3개선언
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println(a);
        }

        if(b%2==0){
            System.out.println(b);
        }

        if(c%2==0){
            System.out.println(c);
        }
    }
}
