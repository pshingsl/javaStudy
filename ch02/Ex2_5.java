package javaStudy.ch02;

public class Ex2_5 {
    public static void main(String[] args) {
        // 자동 타입 형변환
        int v1= 10;
        byte v2= (byte)v1;
        System.out.println("v2: "+v2);

        double v3 = 3;
        float v4 = (float)v3;
        System.out.println("v4: "+v4);

        double v5 = 4.2;
        int v6 = (int)v5;
        System.out.println("v6: "+v6);

        int a = 100;
    }
}
