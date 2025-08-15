package javaStudy.ch06;

public class Ex6_9 {
    public static void main(String[] args) {
        // 참조형 매개변수 연습
        Data2 d2 = new Data2();
        d2.x = 20;
        System.out.println("main() : x = " + d2.x);

        // 참조 매개변수에 저장된 1000 호출
        change2(d2);
        System.out.println("After change(d2.x)");

        // 기본 매개변수와 달리 지역변수가 소멸되지 않는다.
        // 참조형 매개변수이면 객체의 주소를 넘길 수 있다.
        System.out.println("main() : x = " + d2.x);
    }

    // 매개변수타입 참조변수이면 그 객체를 읽고 쓰기 가능핟.
    static void change2(Data2 d2){
        d2.x = 1000;
        System.out.println("change2() : x = " + d2.x);
    }
}

class Data2 {
    int x;
}