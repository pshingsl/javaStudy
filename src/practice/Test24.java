package javaStudy.src.practice;

import java.util.Scanner;

public class Test24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 정수가 순서대로 입력된다.
        // 출력: 7 2 3 3
        // 조건: 입력된 정수를 줄을 바꿔 하나씩 출력하는데, 0이 입력되면 종료한다.

        while (true) {
            int a = sc.nextInt();
            if(a==0){
                break;
            }
            System.out.println(a);
        }
    }
}