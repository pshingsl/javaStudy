package study.ch07;

public class Ex7_13 {
    public static void main(String[] args) {
        Buy2 b2 = new Buy2();

        b2.buy(new Computer2());
        b2.buy(new Audio2());
        b2.buy(new Tv2());
        b2.summary();
    }
}

class Product2 {
    int price;
    int bonusPoint;

    Product2(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }

    //Product2(){}
}

class Tv2 extends Product2 {
    Tv2() {
        super(100);
    }

    @Override
    public String toString() {
        return "Tv";
    }
}

class Computer2 extends Product2 {
    Computer2() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Audio2 extends Product2 {
    Audio2() {
        super(50);
    }

    @Override
    public String toString() {
        return "Audio";
    }
}

class Buy2 {
    int money = 1000;   // 현재 금액
    int bonusPoint = 0; // 현재 보너스
    Product2[] cart = new Product2[10]; // 여러 물건들을 담을 배열
    int i = 0;

    void buy(Product2 p) {
        if (money < p.price) {
            System.out.println("잔액이 부족");
            return;
        }
        System.out.println("현재금액: "+money);

        money -= p.price;
        bonusPoint += p.bonusPoint;
        cart[i++] = p;
        System.out.println(p+"을/를 구매했습니다.");
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        for (int i = 0; i < cart.length; i++) {
            if (cart[i] == null) break;
            sum += cart[i].price;
            itemList += cart[i] + ", ";
        }
        System.out.println("구입하신 물품의 금액은 " + sum + "만원");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }

}
