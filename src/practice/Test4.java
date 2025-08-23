package practice;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력: 연, 월, 일이 ".(닷)"으로 구분되어 입력된다.
        // 출력: 2013.8.5 -> 문자열
        // 조건: 입력받은 연, 월, 일을 yyyy.mm.dd 형식으로 출력한다

        String a = sc.next();
        String[] arr = a.split("[.]"); // []  생략하면 모든글자를 뜻한다 따라서 구분하기 위해서 [] 이나 \\ 써야한다.
        int y = Integer.valueOf(arr[0]);
        int m = Integer.valueOf(arr[1]);
        int d = Integer.valueOf(arr[2]);

        System.out.printf("%04d %02d %02d", y, m, d);
    }
}
