package study.ch06;

public class Ex6_4 {
    public static void main(String[] args) {
        Car1 car1 = new Car1();
        car1.color = "검정";
        car1.speed = 100;

        car1.drive();
        car1.stop();
    }
}

class Car1 {
    String color;
    int speed;
    
    void drive(){
        System.out.println("운전 중...");
    }
    
    void stop(){
        System.out.println("정지");
    }
}
