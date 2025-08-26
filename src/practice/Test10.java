package practice;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력: 2014.07.15
        // 출력: 15-07-2014
        // 조건: 년월일이 '.'(닷)으로 구분되어 입력된다. 일월년으로 바꾸어 '-'(대쉬, 마이너스)로 구분해 출력한다.

        String s = sc.next(); // 2014.07.15
        String[] arr = s.split("\\."); // ["2014", "07", ""15]
        System.out.println(arr[2] + "-" + arr[1] + "-" + arr[0]);
    }
}
