package study.ch07;

public class Ex7_11 {
    public static void main(String[] args) {
        FireEngine2 f2 = new FireEngine2();

        // instaceOf 연산자 실습
        if (f2 instanceof FireEngine2) {
            System.out.println("f2는 FireEngine의 인스턴스입니다.");
        }

        if(f2 instanceof Car2){
            System.out.println("f2는 Car2의 인스턴스입니다.");
        }

        if(f2 instanceof Object){
            System.out.println("f2는 Object의 인스턴스입니다.");
        }
    }
}

class Car2 {
    private int door;
    private String color;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    void run() {
        System.out.println("fast run!");
    }

    void stop() {
        System.out.println("stop!");
    }
}

class FireEngine2 extends Car2 {


    void flash() {
        System.out.println("flash");
    }
}