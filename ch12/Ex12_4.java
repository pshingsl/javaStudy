package javaStudy.ch12;

public class Ex12_4 {
    public static void main(String[] args) {
        Calculator<Integer> c1 = new Calculator<>(5, 10);
        System.out.println(c1.add());

        Calculator<Double> c2 = new Calculator<>(5.0, 4.75);
        System.out.println(c2.add());
    }
}

class Calculator<T extends Number> {
    private T num1;
    private T num2;

    public Calculator(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return num1.doubleValue() + num2.doubleValue();
    }
}
