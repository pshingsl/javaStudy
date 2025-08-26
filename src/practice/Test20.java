package practice;

import java.util.Scanner;

public class Test20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력: 3개의 정수가 공백으로 구분되어 입력된다. 3 -1 5
        // 출력: -1
        // 조건: 가장 작은 값을 출력한다.

        // 입력이 3개라서 변수 3개선언
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 삼항 연산자
        // (3<-1 b=-1) < 5 ? (3<-1 ? 3: -1) : 5
        int result = (a < b ? a : b) < c ? (a < b ? a : b) : c;
        System.out.println(result);
    }
}
