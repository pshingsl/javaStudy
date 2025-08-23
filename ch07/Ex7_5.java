package javaStudy.ch07;

public class Ex7_5 {
    public static void main(String[] args) {
        // 클래스 메서드와 클래스 변수 출력
        System.out.println("클래스 메서드: "+ Card.max(3,5));
        System.out.println("클래스 변수: "+ Card.width);
        System.out.println("클래스 변수 static 블럭 초기화: "+ Card.heigth);
        System.out.println();

        System.out.println(" 객체 출력 ");
        Card c = new Card();
        c.kind = "Diamond";
        c.number = 10;
        System.out.println("카드 숫자는 " + c.number + "이고 종류는 " + c.kind+ " 입니다.");
    }
}

class Card {
    int number;
    String kind;

    static int width = 200;
    static int heigth = 200;

    static {
        heigth = 350;
    }

    static int max(int a, int b) { // 클래스 메서드(static메서드)
        return a > b ? a : b;
    }
}
