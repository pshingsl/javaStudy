package javaStudy.ch07;

public class Ex7_14 {
    public static void main(String[] args) {
       // AudioPlayer ap = new AudioPlayer();
        // AudioPlayer ap = new AudioPlayer(); Player ap = new AudioPlayer(); 랑 똑같은거다.
        Player ap = new AudioPlayer();
        //실행되는 이유는 Player 타입의 참조 변수가 AudioPlayer 객체를 가리킴
        ap.play(3);
        ap.stop();
    }
}

// 추상 클래스는 상속을 통해 완성해야 객체 가능
abstract class Player {
 abstract  void play(int pos);
 abstract void stop();
}

// 왼성된 클래스 -> 인스턴스 생성 가능
class AudioPlayer extends Player {
    void play(int pos) {
        System.out.println(pos+" 재생");
    }
    void stop() {
        System.out.println("재생을 멈춘다.");
    }
}
