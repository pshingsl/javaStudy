package javaStudy.ch03;

public class Ex3_4 {
    public static void main(String[] args) {
        // 조건 연산자
        int score = 85;
        String result = (score >= 60) ? "합격" : "불합격";
        System.out.println(result); // 합격

        int a = 10, b = 20;
        int max = (a > b) ? a : b;
        System.out.println(max); // 20
    }
}
