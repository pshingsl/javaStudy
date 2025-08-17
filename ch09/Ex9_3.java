package javaStudy.ch09;

import java.util.Objects;

public class Ex9_3 {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();

        // equals: 두 객체가 같은지 비교하는데 사용 Object 클래스의 equals()는 주소값을 비교
        System.out.println(c1.equals(c2));

        // hash
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

        System.out.println(c1.toString()); // 오버라이딩 전 javaStudy.ch09.Card@2f4d3709 이렇게 출력
        System.out.println(c2.toString()); // 오버라이딩 전 javaStudy.ch09.Card@2f4d3709
    }
}

class Card {
    int num;
    String kind;

    Card() {
        this("SPADE", 1);
    }

    Card(String kind, int num) {
        this.kind = kind;
        this.num = num;
    }

    // 오버라이딩을 안하면 주소값이 나옴
    // Object클래스의 toString()을 오버라이딩
    public String toString() {
        return "kind: " + kind + ", num " + num;
    }

    // equals를 오버라이딩을 할 때 Object의 선언부를 맞춰야 한다.
    public boolean equals(Object obj) {
        if (!(obj instanceof Card))
            return false;

        Card c = (Card) obj;
        return this.kind.equals( c.kind ) && this.num == c.num;
    }

    // equals()를 오버라이딩하면 hashCode()도 오버라이딩 해야함
    // 이유: equals() 메소드를 이용한 비교 결과가 true인 두 객체는 반드시 동일한 해시코드로 변환해야한다.
    // equals()와 hashCode() 두 메소드는 동일성을 정의하는 데 있어 뗴려야 뗼 수 없는 관계
    public int hashCode() {
        return Objects.hash(kind, num);
    }
}
