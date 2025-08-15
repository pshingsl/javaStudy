package javaStudy.ch03;

public class Ex3_5 {
    public static void main(String[] args) {
        int x = 5;

        x += 3;
        System.out.println(x); // x = 8
        x *= 2;
        System.out.println(x); // x = 16
        x %= 7;
        System.out.println(x); // x = 2

        String msg = "Hello ";
        msg += "World!";
        System.out.println(msg); // "Hello World!"
    }
}
