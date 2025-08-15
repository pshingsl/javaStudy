package study.ch06;

import java.util.Scanner;

public class Ex6_6 {
    public static void main(String[] args) {
        Calc calc = new Calc();

        // 여기 출력 안되는게 Scanner함수부터 수행되고 끝나도 여기를 인식안함
        // 11~12코드 출력하려면 스캐너 끝나고 밑에다 적어야한다.
        int add = calc.add(1, 3);
        System.out.println(add);

        Scanner sc = new Scanner(System.in);
        System.out.println("두 숫자를 입력해주세요");

        calc.a = sc.nextInt();
        calc.b = sc.nextInt();
        int result =  calc.a + calc.b;
        System.out.println("키보드 입력");
        System.out.println(result);

    }
}

class Calc {
    int a, b;
    int add(int a, int b) {
        int result = a + b;
        return result;
    }
}