package javaStudy.ch03;

public class Ex3_5 {
    public static void main(String[] args) {
        // 비교를 위해 변수 2개 생성
        int a = 10, b= 20;
        System.out.println(a > b);  // false
        System.out.println(a < b);  // true
        System.out.println(a >= b); // false
        System.out.println(a <= b); // true
        System.out.println(a != b); // true
        System.out.println(a == b); // false

        // 문자열 비교를 위해 변수 2개 생성
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println(str1 == str2);                   // true 같은 리터럴 값
        System.out.println(str1 == str3);                   // false new객체 생성으로 메모리 번지가 달라서 거짓
        System.out.println(str1.equals(str2));              // true
        System.out.println(str1.equalsIgnoreCase(str2));    // true
        System.out.println(str1.equalsIgnoreCase(str3));    // true
    }
}
