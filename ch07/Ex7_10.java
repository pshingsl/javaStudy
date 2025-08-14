package study.ch07;

public class Ex7_10 {
    public static void main(String[] args) {
        // 업 캐스팅
        FireEngine fe = new FireEngine(4, "red");
        Car c = (Car) fe;
        System.out.println("생성자로 생긴 문: " + c.getDoor());
        c.setDoor(2);
        System.out.println("새로운 문: " + c.getDoor());
        c.drive();
        c.stop();
        // c.water(); 업캐스팅을 인해 부모 클래스에서 정의된것만 사용 가능합니다.
        System.out.println();
        
        // 다운 캐스팅
        System.out.println("다운 캐스팅");
        FireEngine fe2 = (FireEngine) c;

        System.out.println("다운 캐스팅 문: " + fe2.getDoor());
        fe2.setDoor(2);
        System.out.println("추가된 문의 수: " + fe2.getDoor());
        System.out.println();

        fe2.setColor("green");
        System.out.println("바뀐 색상: " + fe2.getColor());
        fe2.drive();
        fe2.stop();
        fe2.water();

    }
}

class Car {
    private int door;
    private String color;

    public Car(int door, String color) {
        this.door = door;
        this.color = color;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void drive() {
        System.out.println("drive~!");
    }

    void stop() {
        System.out.println("stop");
    }
}

class FireEngine extends Car {
    FireEngine(int door, String color) {
        super(door, color);
    }

    void water() {
        System.out.println("물을 뿌립니다");
    }
}