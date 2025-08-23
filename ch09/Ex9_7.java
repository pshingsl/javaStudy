package javaStudy.ch09;

public class Ex9_7 {
    public static void main(String[] args) {
        // 오토박싱 (Autoboxing)
        int primitiveInt = 100;
        Integer wrapperInt = primitiveInt;

        //오토언박싱 (Auto-unboxing)
        Integer wrapperInt2 = 200;
        int primitiveInt2 = wrapperInt;
    }
}
