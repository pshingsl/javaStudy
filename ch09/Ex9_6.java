package javaStudy.ch09;

public class Ex9_6 {
    public static void main(String[] args) {
        // 16문자를 담을 수 있는 버퍼 인스턴스 생성
        // StringBuffer 변수명 = new StringBuffer()
        StringBuffer sb = new StringBuffer();

        // 지정된 개수 문자열을 가짐
        //  StringBuffer 변수명 = new StringBuffer(개수);
        StringBuffer sb1 = new StringBuffer(10);

        // 문자열 값을 갖는 인스턴스를 생성
        StringBuffer sb2 = new StringBuffer("Hi"); // Hi

        // 매개변수 문자열로 변환 후 문자열 뒤에 붙인다
        // append()
        StringBuffer sb3 = new StringBuffer("test");
        StringBuffer sb4 = sb3.append(100); // test100
        sb3.append('d').append("10.1f");     // test100d10.1f

        // 버퍼크기 반환: 버퍼에 담긴 문자열의 길이로 알려줌
        // capacity(), length()
        StringBuffer sb5 = new StringBuffer(100);
        sb5.append("test2");
        int bufferSize = sb5.capacity();
        int stringSize = sb5.length();

        // 지정된 위치 문자를 반환
        // charAt();
        StringBuffer sb6 = new StringBuffer("abc");
        char c= sb6.charAt(1); // b

        // 문자 시작(지정위치)과 끝(지정위치) 사이에 문자를 제거. 단 끝 위치의 문자는 제외
        // delete()
        StringBuffer sb7 = new StringBuffer("0123456789");
        sb7.delete(3, 7); // 012789

        // 지정된 문자 삭제
        // deleteCharAt()
        StringBuffer sb8 = new StringBuffer("0123456");
        sb8.deleteCharAt(5); // 012346

        // 두 번째 매개변수로 받은 값을 문자열 변환하여 지정된 위치에 추가  0부터시작
        StringBuffer sb9 = new StringBuffer("01234567");
        sb9.insert(8 ,','); // 01234567,

        // 문자열 변경 시작~끝
        StringBuffer s = new StringBuffer("0123456");
        s.replace(3,6, "44"); // 012446 시작부터 마지막-1까지 범위
        System.out.println(s);

        // 문자열 거꾸로
        StringBuffer s1 = new StringBuffer("0123456");
        s1.reverse(); // 6543210

    }
}
