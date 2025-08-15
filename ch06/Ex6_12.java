package study.ch06;

public class Ex6_12 {
    public static void main(String[] args) {
        Math2 m2 = new Math2();
        System.out.println("정수 연산: " + m2.add(2, 3));

        System.out.println("소수 연산: " + m2.add(2.1, 3.0));

        int[] a = {100, 200, 300};
        System.out.println(m2.sum(a));
    }
}

class Math2 {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
