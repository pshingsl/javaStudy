package practice;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력: 단어(영어) 하나를 입력받는다. -> 문자열로 나옴
        // 출력: 'B''o''y'
        // 조건: 단어의 문자(영어)를 하나씩 나누어 한 줄에 한 개씩' '로 묶어서 출력한다.

        String s = sc.next(); // Boy
        String[] arr = s.split(""); // 문자열을 빈 문자열 기준으로 자른다 -> 한글자씩 쪼개진 배열
        for (int i = 0; i < arr.length; i++) {
            System.out.println("'" + arr[i] + "'");
        }
    }
}
