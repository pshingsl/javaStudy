package javaStudy.ch03;

public class Ex3_6 {
    public static void main(String[] args) {
        // 논리 연산자, 논리 부정 연산자
        //&& (AND 연산자)
        int a = 5, b = 8;
        System.out.println(a > 3 && b < 10); // true && true → true
        System.out.println(a < 3 && b < 10); // false && true → false

        // || (OR 연산자)
        int x = 10, y = 20;
        System.out.println(x > 5 || y < 15); // true || false → true
        System.out.println(x < 5 || y < 15); // false || false → false

        // 논리 부정 연산자 (!)
        boolean isAdult = false;
        System.out.println(!isAdult); // true
    }
}
