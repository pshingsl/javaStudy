package javaStudy.ch06;

public class Ex6_2 {
    public static void main(String[] args) {
        Tv tv = new Tv(); // Tv 인스턴스를 참조하기 위한 변수 tv 선언 및 생성
        tv.channel = 8;   // Tv 인스턴스의 멤버변수 channel의 값을 7로한다
        tv.channelDown(); // Tv인스턴스의 메서드 channeldowh() 호출

        System.out.println("현재 채널은 " + tv.channel + "입니다.");
    }
}

class Tv {
    String color;
    boolean power;
    int channel;

    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}