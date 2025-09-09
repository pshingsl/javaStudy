package javaStudy.javareview;

public class AnimalEx {
    Dog dog = new Dog();
    dog.sound();
}

class Dog implements Animal{

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}

class Cat implements Animal{

    @Override
    public void sound() {
        System.out.println("야옹");
    }
}

public interface Animal {
    void sound();
}