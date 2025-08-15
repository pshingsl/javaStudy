package javaStudy.ch06;

public class Ex6_10 {
    public static void main(String[] args) {
        // 참조형 반환타입
        Data3 d = new Data3();
        d.x = 10;

        // d2는 main메소드의 에 저장
        Data3 d2 = copy(d);
        System.out.println("d.x = " + d.x);
        System.out.println("d2.x =" + d2.x);
    }

    // 여기 d는 copy라는 곳에 저장
    // 반환 타입이 참조형이면 객체의 주소(tmp)를 반환한다.
    static Data3 copy(Data3 d) {
        Data3 tmp = new Data3();

        tmp.x = d.x;

        return tmp;
    }
}

class Data3 {
    int x;
}
