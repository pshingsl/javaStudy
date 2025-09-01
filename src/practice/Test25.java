package javaStudy.src.practice;

import java.util.Scanner;

public class Test25 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // n개의 정수가 순서대로 입력된다.
            // 출력: 5 1 2 3 4 5
            // 조건: n개의 정수를 한 개씩 줄을 바꿔 출력한다.


            int a = sc.nextInt();

            for(int i=0; i<a ; i++){
                int n = sc.nextInt();
                System.out.println(n);
            }
        }
    }
