package practice;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력: 주민번호 앞 6자리와 뒷 7자리가 '-'로 구분되어 입력
        // 출력: 000907-1121112 ->  0009071121112
        // 조건: '-'를 제외한 주민번호 13자리를 모두 붙여 출력한다.


        String a = sc.next();
        String[] arr = a.split("[-]"); // []  생략하면 모든글자를 뜻한다 따라서 구분하기 위해서 [] 이나 \\ 써야한다.
        // int s1 = Integer.valueOf(arr[0]); int로 쓰면 0을 생략됨 -> String으로 써야 000 작성가능
        String s1 = arr[0];
        String s2 = arr[1];
        System.out.printf("%s%s", s1, s2);
    }
}
