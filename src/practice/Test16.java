package practice;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력: 정수 2개가 입력된다 -> 정수형 변수 2개 선언
        // 출력: 1 1 -> 1나옴
        // 조건: 둘 다 참(1)일 경우에만 1을 출력하고, 그 외의 경우에는 0을 출력

        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==1 && b==1){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
