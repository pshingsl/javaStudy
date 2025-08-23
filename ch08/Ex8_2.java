package javaStudy.ch08;

public class Ex8_2 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try{
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("예외: " + e.getMessage());
        }

        System.out.println("종료");
    }
}
