package javaStudy.ch06;

class Car {
    String name;
    int speed;

    void intro(){
        System.out.println("name: " + name );
    }

    void run(){
        System.out.println("speed: " + speed + "km로 달립니다." );
    }
}

public class Ex6_1 {
    public static void main(String[] args) {
        Car car  = new Car();
        car.name = "페라리";
        car.speed = 100;
        
        // 자바스크립트 처럼 함수를 호출하는식으로 해야함
        car.intro();
        car.run();
    }
}
