package study.ch04;

public class Ex4_8 {
    public static void main(String[] args) {
        // while 2 연습
        int z = 0;
        int sum = 0;

        while (z < 101) {
            ++z;
            sum += z;
            if (sum > 100) {
                System.out.println(sum);
                break;
            }
        }
    }
}
