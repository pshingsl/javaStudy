package study.ch07;

public class Ex7_3 {
    public static void main(String[] args) {
        MyPoint mp = new MyPoint();
        mp.x = 3;
        mp.y = 2;
        mp.z = 4;
        System.out.println(mp.getLocation());

        System.out.println("ObjectClass Method");
        MyPoin2 mp2 = new MyPoin2();
        mp2.x = 3;
        mp2.y = 2;
        // 오브젝트 클래스를 사용하면 이렇게 바꿀 수 있다.
        System.out.println(mp2);
    }
}

class Point {
    int x;
    int y;

    String getLocation() {
        return "x:" + x + ", y:" + y;
    }
}

class MyPoint extends Point {
    int z;

    // 오버라이딩을 하기위해서 부모 또는 조상의 메서드를 가져옴
    String getLocation() {
        return "x:" + x + ", y:" + y +", z: " +z;
    }
}

// 오브젝트 클래스 실습
class Point2 {
    int x;
    int y;

    // Object클래스의 toString()을 오버라이딩
    public String toString() {
        return "x:" + x + ", y:" + y;
    }
}

class MyPoin2 extends Point2 {
    int z;

    // 오버라이딩을 하기위해서 부모 또는 조상의 메서드를 가져옴
    String getLocation() {
        return "x:" + x + ", y:" + y +", z: " +z;
    }
}

