package javaStudy.ch07;

public class Ex7_17 {
    public static void main(String[] args) {
        A a = new A();
        a.method(new B()); // A가 B를 사용
    }
}

class A {
    public void method(B b) {
        b.method();
    }
}

class B {
    public void method(){
        System.out.println("B클래스 메소드");
    }
}
