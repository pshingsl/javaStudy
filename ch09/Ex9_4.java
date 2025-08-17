package javaStudy.ch09;

import java.util.Locale;

public class Ex9_4 {
    public static void main(String[] args) {
        // 문자열(s) String 인스턴스 생성
        String s = new String("Hello"); // Hello

        // 문자열(value)을 갖는 String 인스턴스 생성
        char[] c = {'H', 'e', 'l', 'l', 'o'}; // Hello
        String s1 = new String(c);       // Hello

        // StringBuffer 인스턴스가 갖고 있는 문자열과 같은 내용의 String 인스턴스 생성
        StringBuffer sb = new StringBuffer("Hello");  // Hello
        String s2 = new String(sb);                   // Hello

        // 지정된 위치에 있는 문자를 알려준다
        char c1 = s.charAt(1); // Hello -> e를 반환

        // 문자열을 사전순서로 비교 같으면 0 사전순 이전 음수 사전순 이후 양수
        int i = "aaa".compareTo("aaa"); // 0
        int i2 = "aaa".compareTo("bbb"); // -1
        int i3 = "bbb".compareTo("aaa"); // 1

        // 문자열 결합
        String con = s.concat(" World"); // Hello World

        // 문자열 포함 검사 반환: true or false
        String s4 = "world";
        boolean b = s4.contains("rl"); // true

        // 문자열로 끝났는지 검사 반환: true or false
        boolean b2 = s4.endsWith("d"); // true

        // 문자열 비교 반환: true or false
        String s5 = "java";
        boolean b3 = s5.equals("java"); // true
        boolean b4 = s5.equals("Java"); // false

        //  문자열 비교(대소문자 구분x) 반환: true or false
        String s6 = "java";
        boolean b5 = s5.equalsIgnoreCase("java"); // true
        boolean b6 = s5.equalsIgnoreCase("Java"); // false

        // 문자 존재확인 반환: 해당 위치 알려줌
        String s7 = "Hello";
        int idx1 = s7.indexOf('l'); // 2 똑같은게 있으면 0번째부터 시작해서 가까운걸 반환
        int idx2 = s7.indexOf('H'); // 0

        // 문자열 존재확인 지정된 위치부터 확인하여 위치를 확인 반환: 1, -1
        String s8 = "Hello";
        int idx3 = s8.indexOf('e', 0); // 1 0번쨰 요소부터 시작
        int idx4 = s8.indexOf('e', 2); // -1

        // 지정 문자 존재확인 맨뒤에서 부터 탐색
        String s9 = "java.lang.object";
        int id = s9.lastIndexOf('.');   // 10 맨뒤에서 부터 탐색
        int id2 = s9.indexOf('.');          // . 맨앞에서 부터 탐색

        // 문자 분리
        String ani = "dog, cat, bear";
        String[] arr = ani.split(","); // arr[0] = "dog" arr[1] = "cat" arr[2] = "bear"

        // 지정된 문자 분리
        String ani2 = "dog, cat, bear";
        String[] arr2 = ani.split(",", 2); // arr[0] = "dog" arr[1] = "cat, bear"

        // 주어진 문자열로 시작하는지 검사 반환: true or false
        String q1 = "java.lang.object";
        boolean b7 = q1.startsWith("java"); // true -> 맨 앞에서부터 탐색
        boolean b8 = q1.startsWith("lang"); // false

        // 시작~끝 문자열 포함 여부
        String q2 = "java.lang.object";
        String c2 = q2.substring(10);  // object 10번째 부터 시작
        String c3 = q2.substring(5, 9);          //  lang 5번째부터 9-1까지 출력

        // 모든 문자열 소문자 변환
        String q3 = "Hello";
        String t1 = q3.toLowerCase(); // hello

        // 모든 문자열 대문자 변환
        String q4 = "Hello";
        String t2 = q4.toUpperCase(); // HELLO

        // 문자 공백 제거 -> 중간에 있는 공백은 제거 안됨
        String q5 = "Hello World";
        String t3 = q5.trim();  // Hello World

        String q6 = "HelloWorld ";
        String t4 = q6.trim(); // HelloWorld

        // 지정된 값 문자열로 변환
        String q7 = String.valueOf(10000); // "10000"
    }
}
