package javaStudy.ch06;

public class Ex6_8 {
    public static void main(String[] args) {
        // 기본형 매개변수
        Data d = new Data(); // 객체 생성
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        // 여기 d.x는 다른 주소(지역변수)에 저장이 되어 위 10이 아니고 1000이 된다.
        change(d.x);
        // 호출되면 지역변수에 저장된 1000으로 저장된 값 출력 후 지역변수 소멸
        System.out.println("After change(d.x)");

        // 지역변수가 소멸되 원래 값 10이 다시 출력
        System.out.println("main() : x = " +d.x);
    }

    // 인스턴스 변수 값 10 지역변수에 저장
    static void change(int x) {
        x = 1000;
        System.out.println("change() : x = " + x);
    }
}

class Data {
    int x;
}