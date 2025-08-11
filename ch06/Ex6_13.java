package study.ch06;

public class Ex6_13 {
    public static void main(String[] args) {
        Dat1 d1 = new Dat1();
        //Dat2 d2 = new Dat2(); // error : cannot resolve symbol -> 이름에 문제 -> 인식 안됨
        Dat2 d2 = new Dat2(2); // 아래 클래스에 생성자 정의하면 이렇게 처리하면 에러 안 생김

        // 매개변수 생성자 출력
        School s = new School("sesak", 2025, "영등포구");
        System.out.println(s.address);
    }
}

class Dat1 {
    int value;
}

class Dat2 {
    int age;

    // Dat2() {} 기본 생성자 -> 원래는 기본 생성자는 만들어야 한다.
    Dat2(int x) {
        age = x;
    }
}

// 매개변수가 있는 생성자
class School {
    String name;
    int age;
    String address;

    School(String n, int a, String add) {
        name = n;
        age = a;
        address = add;
    }
}
