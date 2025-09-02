package javaStudy.src.practice;

import java.util.Scanner;

public class Test30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력: 정수 1개입력
        // 출력: 55 -> 10
        // 1, 2, 3, 4, 5 ... 를 순서대로 계속 더해 합을 만들어가다가,
        //입력된 정수와 같거나 커졌을 때, 마지막에 더한 정수를 출력한다.

        int a = sc.nextInt();
        int sum = 0;

        for(int i= 1; i<=a; i++){
            sum += i; //  1 2 3 4 합
            if(sum>= a){
                System.out.println(i);
                break;
            }
        }
    }
}
