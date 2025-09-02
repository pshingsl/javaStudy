package javaStudy.src.practice;

import java.util.Scanner;

public class Test29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력: 문자들이 1개씩 계속해서 입력된다.
        // 출력: q 종료
        // 'q'가 입력될 때까지 입력된 문자를 줄을 바꿔 한 줄씩 출력한다.



        while (true) {
            String s = sc.next();
            System.out.println(s);
            if(s.equals("q")){
                break;
            }
        }
    }
}
