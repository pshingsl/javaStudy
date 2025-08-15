package study.ch07;

public class Ex7_12 {
    public static void main(String[] args) {
        // 매개변수의 다형성: buy() 메소드의 매개변수 Product타입
        // Product 자손 컴퓨터, 티비, 오디오 객체에 전달
        Buyer b = new Buyer();
        b.buy(new Computer());
        b.buy(new Audi());
        b.buy(new Tv1());

        // b.buy(new Computer());
        // > Product p = new Computer(); p.buy(p)랑 같음
        System.out.println();

        System.out.println("현재 남은 돈: " + b.money + "만원");
        System.out.println("현재 보너스 점수: " + b.bonusPoint + "점");
    }
}

class Product {
    int price;
    int bonusPoint;

    public Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv1 extends Product {
    Tv1() {
        // 조상의 생성자 int price 호출
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Audi extends Product {
    Audi() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;

        // 위의 자손 클래스들 출력을 위해 오버라이딩함
        System.out.println(p + "을/를 구매했습니다."); // p는 p.toString()와 같음
    }
}