package practice;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력: 시(hour)와 분(minute)이 ":" 으로 구분되어 입력된다..
        // 출력: 3:16 문자열로 이루어짐
        // 조건: 입력받은 시간을 "시:분" 형식으로 출력한다.

        String a = sc.next();
        String[] arr = a.split("[:]"); // []  생략하면 모든글자를 뜻한다 따라서 구분하기 위해서 [] 이나 \\ 써야한다.
        int y = Integer.valueOf(arr[0]);
        int m = Integer.valueOf(arr[1]);
        System.out.printf("%d:%d", y, m);    }
}
