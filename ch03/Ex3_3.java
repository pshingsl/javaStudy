package javaStudy.ch03;

public class Ex3_3 {
    public static void main(String[] args) {
        int i  = 3, j  = 2;
        System.out.println("i+j =" + (i + j) );                 // 5
        System.out.println("i-j =" + (i - j) );                 // 2
        System.out.println("ixj =" + (i * j) );                 // 6
        System.out.println("i/j =" + (i / j) );                 // 1
        System.out.println("i/j =" + ((float)i / j));           // 1.5
        System.out.println("i/j =" + ((float)i / (float)j));    // 1.5

        int s = 1_000_000, n= 2_000_000;
        System.out.println(s * n );
        long c = (long)s *n;
        System.out.println("long산술변환:" + c );

        long result = Math.round(4.52); // 5에서 반올림함
        double pi = 3.14592;
        double v2 = Math.round(pi*1000) / 1000.0;
        System.out.println(v2);
    }
}
