package javaStudy.ch05;

public class Ex5_1 {
    public static void main(String[] args) {
        // 배열
        //int[] score; // 배열 생성(참조변수)
        //score = new int[5];
        // [] 생략하면 Array initializer is not allowed here 에러 발생

        int[] score = new int[5];
        score[3] = 100;
        System.out.println("score[0]" + score[0]);
        System.out.println("score[1]" + score[1]);
        System.out.println("score[2]" + score[2]);
        System.out.println("score[3]" + score[3]);
        System.out.println("score[4]" + score[4]);

    }
}
