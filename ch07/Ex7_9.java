package study.ch07;

public class Ex7_9 {
    public static void main(String[] args) {
        // 타입 일치 실습
        SmartTv s = new SmartTv();
        System.out.println("현재 전원은 :"+s.isPower());
        s.setPower();
        System.out.println("지금 전원은 :"+s.isPower());
        System.out.println();

        System.out.println("현재 채널은 " + s.getChannel());
        s.setUpChannel();
        s.setUpChannel();
        System.out.println("지금은 채널은 " + s.getChannel());

        s.setDownChannel();
        System.out.println("다시 바뀐 채널은 " + s.getChannel());
        System.out.println();

        s.text = "무한도전";
        System.out.println("현재 방송은" + s.text);
        System.out.println();

        System.out.println("타입 불일치 실습입니다.");
        // 타입 불일치
        Tv t = new SmartTv();
        System.out.println("현재 전원은 :"+t.isPower());
        t.setPower();
        System.out.println("지금 전원은 :"+t.isPower());
        System.out.println();

        System.out.println("현재 채널은 " + t.getChannel());
        t.setUpChannel();
        t.setUpChannel();
        System.out.println("지금은 채널은 " + t.getChannel());
        System.out.println();

        t.setDownChannel();
        System.out.println("다시 바뀐 채널은 " + t.getChannel());
        System.out.println();

        // t.text = "무한도전"; 참조변수가 불일치해서 오류가 납니다.
        // 부모에 정의 된건만 사용 가능합니다.
        // 자식에서 만든 멤버는 사용 불가능합니다.
        System.out.println("현재 방송은" + s.text);
        System.out.println();

    }
}

class Tv {
    private boolean power;
    private int channel;

    public boolean isPower() {
        return power;
    }

    public void setPower() {
        power = !power;
    }

    public int getChannel() {
        return channel;
    }

    public void setUpChannel() {
        ++channel;
    }

    public void setDownChannel() {
        --channel;
    }
}

class SmartTv extends Tv {
    String text;

    void caption() {}
}