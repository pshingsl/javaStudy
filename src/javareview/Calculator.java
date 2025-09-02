package javareview;

public class Calculator {
    public static void main(String[] args) {
        Calc c = new Calc();
        System.out.println(c.add(1,2));
        System.out.println(c.add(1,2,3));
        System.out.println(c.add(1,2,3,4));
        System.out.println(c.add(1.0,3.3));
    }
}

// 메소드 오버로딩
// 메소드명은 같아야 하며 파라미터는 순서, 타입 달리 할 수 있다.
class Calc {
    public int add(int x, int y) {
        return x + y;
    }

    public int add(int x, int y, int z) {
        return x + y + z;
    }

    public int add(int y, int z, int x, int k) {
        return y + z + x + k;
    }

    public double add(double x, double y) {
        return x + y;
    }
}
