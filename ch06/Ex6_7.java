package study.ch06;

public class Ex6_7 {
    public static void main(String[] args) {
        Multy m = new Multy();
        m.muity(2);
    }
}

class Multy {
    void muity(int dan) {
        for (int j = 1; j < 10; j++) {
            System.out.print((dan * j + " "));
        }
        return;
    }
}
