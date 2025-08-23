package javaStudy.ch03;

public class Ex3_2 {
    public static void main(String[] args) {
        String st1 = "java";
        String str2 = "java";
        String str3 = new String("java");

        System.out.println(st1 == str2); // true
        System.out.println(st1 == str3); // false
    }
}
