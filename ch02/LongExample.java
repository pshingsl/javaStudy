package javaStudy.ch02;

public class LongExample {
    public static void main(String[] arg) {
        long v1 = 10;
        long v2 = 20L;
        // long v3 = 1000000000; // 컴파일러는 int로 간주하기 때문에 에러 발생
        long v4 = 10000000000L;
        System.out.println(v1);   // 10
        System.out.println(v2);   // 20
        System.out.println(v4);   // 100000000000
    }
}
