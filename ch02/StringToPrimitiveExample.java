package javaStudy.ch02;

public class StringToPrimitiveExample {
    public static void main(String[] args) {
        // 문자열 -> int
        String str1 = "100";
        int v1 = Integer.parseInt(str1);
        System.out.println("int value: " + v1);  // 100

        int v2 = Integer.parseInt("102");
        System.out.println("int value: " + v2);  // 100

        // 문자열 -> double
        String str2 = "3.14";
        double v3 = Double.parseDouble(str2);
        System.out.println("double value: " + v3);  // 3.14

        double v4 = Double.parseDouble("3");
        System.out.println("double value: " + v4);  // 3.00

        // 문자열 -> boolean
        String str3 = "true";
        boolean v5 = Boolean.parseBoolean(str3);
        System.out.println("boolean value: " + v5);  // true

        boolean v6 = Boolean.parseBoolean("false");
        System.out.println("boolean value: " + v6);  // false
    }
}
