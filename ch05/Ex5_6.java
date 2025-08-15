package study.ch05;

public class Ex5_6 {
    public static void main(String[] args) {
        // String 클래스
        String str = "문자열 클래스";
        char ch = str.charAt(4);
        System.out.println("charAt: " + ch); //결과:클 빈공백 포함하지 않고 다음 인덱스로 나옴

        String v1 = str.substring(1,3);
        System.out.println("substring: " +v1); //결과:자열 해당 인덱스부터 지정된 인덱스까지 출력

        String v2 = str.substring(1);
        System.out.println("substring2: " + v2); // 결과: 자열 클래스 해당 인덱스 부터 끝까지 출력
    }
}
