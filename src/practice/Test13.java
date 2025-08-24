package practice;

import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력: A
        // 출력: 65
        // 조건: 문자 입력시 아스키코드를 이용해 숫자 변환 -> 형변환 이해도

        char a = sc.next().charAt(0);
        int d = (int) a;
        System.out.println(d);
    }
}
