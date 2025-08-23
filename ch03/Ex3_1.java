package javaStudy.ch03;

public class Ex3_1 {
    public static void main(String[] args) {
        long result = Math.round(4.52); // 5에서 반올림함
        double pi = 3.141592;
        double v2 = Math.round(pi * 1000) / 1000.0;
        System.out.println(v2); // 3.142
    }
}
