package javaStudy.src.practice;

import java.util.Scanner;

public class Test28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수 1개가 입력된다. (1 ~ 100)
        // 출력: 5 -> 6
        // 조건: 1부터 입력된 수까지 짝수의 합을 출력한다


        int a = sc.nextInt();
        int sum = 0;

        for (int i = 1; i < a; i++) { // 1 2 3 4 5 5입력
            if (i % 2 == 0) {
                sum += a;
            }
        }
        System.out.println(sum);
    }
}
