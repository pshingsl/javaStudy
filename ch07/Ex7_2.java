package javaStudy.ch07;

public class Ex7_2 {
    public static void main(String[] args) {
        System.out.println("==상속==");
        // Circle은 Mpoint의 필드(x, y)를 물려받아 직접 사용
        Circle c = new Circle();
        c.x = 1;
        c.y = 3;
        c.r = 2;
        System.out.println("x:" + c.x);
        System.out.println("y:" + c.y);
        System.out.println("r:" + c.r);

        // Circle2는 Mpoint 객체를 필드로 포함하여 사용
        System.out.println("==포함==");
        Circle2 c2 = new Circle2();
        c2.mp.x = 2;
        c2.mp.y = 2;
        System.out.println("c2.mp.x:" + c2.mp.x);
        System.out.println("c2.mp.y:" + c2.mp.y);
    }
}

class Mpoint {
    int x;
    int y;
}

// 상속
class Circle extends Mpoint {
    int r;
}

// 포함
class Circle2 {
    Mpoint mp = new Mpoint(); // 이걸 여기서 초기화를 안해주면 생성자를 통해 초기화 해야함

//    Circle2(){
//        mp = new Mpoint();
//    }

    //  Circle2의 고유의 멤버 변수
    int r;
}
