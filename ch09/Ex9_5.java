package javaStudy.ch09;

public class Ex9_5 {
    public static void main(String[] args) {
        int i = 100;
        String s = String.valueOf(i); // int를 String으로 변환

        double d = 200.0;
        String s2 = String.valueOf(d);

        double sum = Integer.valueOf("+" + s) + Double.valueOf(s2);
        double sum2 = Integer.valueOf(s) + Double.valueOf(s2);

        //
        System.out.println(String.join("", s, "+",s2,"=")+sum);
        System.out.println(s + "+"+s2+"="+sum2);
    }
}
