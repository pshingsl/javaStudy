package javaStudy.ch13;

public class Ex13_2 {
    public static void main(String[] args) {
//        MyFunction mf = new MyFunction() {
//            @Override
//            public int max(int a, int b) {
//                return a > b ? a : b;
//            }
//        };

        // 람다식(익명객체)을 다루기 위한 참조변수의 타입은 함수형 인터페이스
        MyFunction mf = (a, b) -> a > b ? a : b; // 람다식

        int val = mf.max(3, 5);
        System.out.println("max: " + val);
    }
}

@FunctionalInterface // 함수형 인터페이스는 단 하나의 추상 메소드만 가져야한다.
interface MyFunction {
    public abstract int max(int a, int b);

    // public abstract int add(int a, int b); 하나만 존재해야한다.
}