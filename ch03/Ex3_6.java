package javaStudy.ch03;

public class Ex3_6 {
    public static void main(String[] args) {
        // 논리 연산자, 부정 연산자
        int a = 5, b= 10;

        //&& (AND 연산자)
        System.out.println(a>7 && b<11);
        System.out.println(a>3 && 6<b);

        // || (OR 연산자)
        System.out.println(a>7 || b<11);
        System.out.println(a>3 || 6<b);

        // 논리 부정 연산자(!)
        boolean r1= false;
        System.out.println(!r1);
    }
}
