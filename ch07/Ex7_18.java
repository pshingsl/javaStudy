package javaStudy.ch07;

public class Ex7_18 {
    // 내부 클래스
    public static void main(String[] args) {
       A3 a= new A3();
       a.b.method();
    }
}

class A3 { // A3는 B3의 외부 클래스
    int i;
    B3 b = new B3();

    class B3 { /// B3는 A3의 내부 클래스
        void method() {
//            A3 a = new A3();
//            System.out.println(a.i);
            System.out.println(i); // 객체 생성없이 외부 클래스의 멤버 접근 가능
        }
    }
}

//class B3 {
//    void method(){
//        A3 a = new A3();
//        System.out.println(a.i);
//    }
//}

class C3 {
    //  B3 b = new B3(); 에러
}