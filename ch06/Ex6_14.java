package javaStudy.ch06;

public class Ex6_14 {
    public static void main(String[] args) {
        // this 생성자
        Car2 c2 = new Car2("red", "G80", 100);
        System.out.println(c2.name);
        c2.run();
    }
}

class Car2{
    String color;   // 인스턴스 변수(iv) this.color
    String name;    // 인스턴스 변수(iv this.name
    int speed;      // 인스턴스 변수(iv) this.speed

    // 생성자
    Car2(String color, String name, int speed){
        // this가 있어야 인스턴스 변수로 간주한다.
        this.color = color;
        this.name = name;
        this.speed = speed;
    }
    
    // 인스턴스 메서드
    void run() {
        System.out.println("달립니다.");
    }

    Car2(){
        this("white", "auto", 100);
    }
}
