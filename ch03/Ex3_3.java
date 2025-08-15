package javaStudy.ch03;

public class Ex3_3 {
    public static void main(String[] args) {
        // &&(AND 연산자)
        int a = 5, b = 8;
        System.out.println(a > 3 && b < 10); // true && true → true
        System.out.println(a < 3 && b < 10); // false && true → false

        // ||(OR 연산자)
        int x = 10, y = 20;
        System.out.println(x > 5 || y < 15); // true || false → true
        System.out.println(x < 5 || y < 15); // false || false → false

        // 단축평가
        int d = 5;
        if (d > 0 && ++d > 5) {
            // ++a는 실행되지 않음, a는 그대로 5
        }
    }
}
