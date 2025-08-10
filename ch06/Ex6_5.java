package study.ch06;

public class Ex6_5 {
    public static void main(String[] args) {
        Card c1 = new Card();
        c1.kind = "Spade";
        c1.num = 4;

        Card c2 = new Card();
        c2.kind = "Diamond";
        c2.num = 7;

        System.out.println("c1 카드는 "+ c1.kind +", " + c1.num);
        System.out.println("높이: "+ Card.height);
        System.out.println("너비: "+ Card.width);

        System.out.println("== 두 번째 카드 ==");
        System.out.println("c2 카드는 "+ c2.kind +", " + c2.num);
        System.out.println("높이: "+ Card.height);
        System.out.println("너비: "+ Card.width);
    }
}

class Card {
    String kind;
    int num;
    static int width = 100;
    static int height = 200;

}