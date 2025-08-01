package study.ch02;

public class BooleanExample {
    public static void main(String[] arg) {
        boolean finish = true;
        if (finish) {
            System.out.println("끝났습니다.");
        } else {
            System.out.println("아직 안 끝났습니다.");
        }

        int score = 80;
        boolean a = score < 70;
        boolean b = score >= 80;
        System.out.println("result1: " + a);
        System.out.println("result2: " + b);
    }
}
