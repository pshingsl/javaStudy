package practice;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력: 75254
        // 출력: '[70000][5000][200][50][4]
        // 조건: 각 자리의 숫자를 분리해 한 줄에 하나씩 [ ]속에 넣어 출력한다.

        String s = sc.next(); // 75254
        char[] a = s.toCharArray(); //String 문자열을 char형 배열로 바꿔서 반환해주는 메서드
        System.out.println("[" + a[0] + "0000]");
        System.out.println("[" + a[1] + "000]");
        System.out.println("[" + a[2] + "00]");
        System.out.println("[" + a[3] + "0]");
        System.out.println("[" + a[4] + "]");
    }
}
