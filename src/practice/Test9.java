package practice;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력: 17:23:57
        // 출력: 23
        // 조건: 분만 출력한다.

        String s = sc.next(); // 17:23:57 -> : 분리 각각 꺼내서 사용 배열 사용
        String[] a = s.split("\\:"); //  [ "17", "23", "57" ]
        System.out.println(a[1]);
    }
}
