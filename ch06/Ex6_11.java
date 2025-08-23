package javaStudy.ch06;

public class Ex6_11 {
    public static void main(String[] args) {
        // 인스턴스 변수를 사용하지 않을때 클래스 메소드 사용하면 된다.
        System.out.println("클래스 메소드: " + Mat.add(1,2));

        // 인스턴스(객체)를 사용하려면 객체를 만들어줘야한다.
        Mat m = new Mat();
        m.x = 10;
        m.y = 30;
        System.out.println("인스턴스 메소드: " + m.add());
    }
}

class Mat {
    // 인스턴스(객체) 변수
    int x, y;

    // 인스턴스(객체) 메소드 인스턴스 변수 사용
    int add() {
        return x + y;
    }

    // 클래스 메소드 static안에 변수를 선언하면 지역변수로 선언
    static int add(int x, int y) {
        return x + y;
    }
}
