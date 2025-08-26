package practice;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력: 3.14159265359
        // 출력: 3.14159265359
        // 조건:
        // (단, 입력되는 실수의 범위는 +- 1.7*10-308 ~ +- 1.7*10308 이다.)
        // 입력된 실수를 소수점 이하 11자리까지 반올림하여 출력한다.

        double d = sc.nextDouble();
        System.out.println(d);
    }
}
