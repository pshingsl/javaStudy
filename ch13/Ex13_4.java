package javaStudy.ch13;

public class Ex13_4 {

    // 인터페이스 LamFunction을 매개변수 타입으로  지정
    static void execute(LamFunction l){
        l.run();
    }

    // 인터페이스 LamFunction인 메소드
    static LamFunction getLamFunction() {
        LamFunction lamFunction = () -> System.out.println("3번째 출발");
        return lamFunction;
    }

    public static void main(String[] args) {
        // 람다식 LamFunction의 run()을 구현
        LamFunction lf1 = () -> System.out.println("f1.run()");

        LamFunction lf2 = new LamFunction() { // 익명 클래스 run()구현
            @Override
            public void run() { // public을 붙어여함 -> 접근제한자가 낮아서이다.
                System.out.println("f2.run()");
            }
        };

        lf1.run();
        lf2.run();
    }
}

@FunctionalInterface
interface LamFunction {
    void run(); // public abstract 생략가능
}