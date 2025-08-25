package practice;

import java.util.Scanner;

public class Test22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력: 세 정수 a, b, c 가 공백을 두고 입력된다. 1 2 4
        // 출력: odd even even
        // 조건: 입력된 순서대로 짝(even)/홀(odd)을 줄을 바꿔 출력한다.

        // 입력이 3개라서 변수 3개선언
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        if(b%2==0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        if(c%2==0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
