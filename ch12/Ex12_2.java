package javaStudy.ch12;

public class Ex12_2 {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.setItem(1);
        box.setItem(2);
        System.out.println(box.getItem()); // 많이 만들어도 배열형태가 아니라 마지막에 추가한걸로 출력

        // 타입 Car로 받는 이유 T에 올 수 있는 타입의 인터페이스 구현한 모든 클래스이다.
        // Car는 Moveable 인터페이스의 하위 타입이 되며, T extends Moveable이라는 제네릭 제한 조건을 만족
        // 제네릭 타입은 아무타입이나 오지 못한다. 특정 클래스(카)를 상속받거나, 특정 인터페이스를 구현한 타입으로 제한한다.

        /*
         *   Moveable
         *      ㄴ car
         *  이러한 구조이므로 위 조건 3번째에 조건이 해당 되어서 Car로 받아온다.
         * */
        Container<Car> carContainer = new Container<>(new Car());
        carContainer.makeItMove();
    }
}

// 제네릭 제한된 타입 -> 상속
class Box<T extends Number> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

interface Moveable {
    // 인터페이스는 추상 메소드 생성과 상수 선언할 때 사용
    abstract void move();
}

class Container<T extends Moveable> {
    private T item;

    public Container(T item) {
        this.item = item;
    }

    public void makeItMove() {
        item.move(); // Movable 인터페이스의 추상 메소드
    }
}

/*
*   Moveable
*      ㄴ car
* */
class Car implements Moveable {
    @Override
    public void move() {
        System.out.println("전진");
    }
}