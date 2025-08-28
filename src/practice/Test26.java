package javaStudy.src.practice;

import java.util.Scanner;

public class Test26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수 1개가 입력된다.
        // 출력: 5 -> 5 4 3 2 1
        // 조건: 1씩 줄이면서 한 줄에 하나씩 1이 될 때까지 출력한다


        int a = sc.nextInt();

        while(a>0){
            System.out.println(a--);
        }
    }
}
