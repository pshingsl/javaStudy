package javaStudy.ch04;

import java.util.Scanner;

public class Ex4_3 {
    // if-else if
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요.");
        int num = sc.nextInt();

        if (num > 10) {
            System.out.println("10보다 큽니다..");
        } else if (num == 10) {
            System.out.println("10 입니다.");
        } else {
            System.out.println("10 작습니다.");
        }
    }
}
