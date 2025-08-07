package javaStudy.ch03;

public class Ex3_4 {
    public static void main(String[] args) {
        long result = Math.round(4.52); // 5에서 반올림함
        double pi = 3.141592;
        double v2 = Math.round(pi*1000) / 1000.0;
        System.out.println(v2); // 3.146

        // 위 실행 순서
        System.out.println(pi);
        System.out.println(pi*1000);
        System.out.println(Math.round(pi*1000));
        System.out.println(Math.round(pi*1000) / 1000.0);
    }
}
