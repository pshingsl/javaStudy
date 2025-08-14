package study.ch07;

public class Ex7_7 {
    public static void main(String[] args) {
        Audio a = new Audio();
        // 생성자의 저장된 0을 가져옴
        System.out.println(a.currentPos);

        a.currentPos = 10;
        System.out.println("인스턴스 값 수정: " + a.currentPos); // 10출력
        System.out.println();

        System.out.println("추상 메소드 출력");
        a.play(10);
        a.stop();
    }
}

abstract class Play {
    boolean pause;
    int currentPos;

    public Play() {
        pause = false;
        currentPos = 0;
    }

    abstract void play(int pos);

    abstract void stop();

    void pause() {
        if (!pause) {
            pause = true;
            System.out.println("일시 정지");
        }
    }
}

class Audio extends Play {
    @Override
        // 오버라이딩해야함 -> 추상 클래스에 있는 메서드와 매개변수 모두 다 작성해야한다.
    void play(int pos) {
        System.out.println(pos + " 오디오 재생");
    }

    @Override
    void stop() {
        System.out.println("오디오 멈춤");
    }
}
