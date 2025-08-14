package study.ch07;

public class Ex7_6 {
    public static void main(String[] args) {
        FinalCard fc = new FinalCard(4, "heart");
        fc.print();
    }
}

final class FinalCard {
    final int NUMBER; // 값을 할당 안하면 오류 뜸 -> 생성자로 초기화, 선언과 초기화 해서 오류 해결하기
    final String KIND;
    static int width = 100;
    static int height = 100;

    public FinalCard(int NUMBER, String KIND) {
        this.NUMBER = NUMBER;
        this.KIND = KIND;
    }

    final void print() {
        System.out.println(KIND + ", " + NUMBER);
    }
}
