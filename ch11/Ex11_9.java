package javaStudy.ch11;

import java.util.HashSet;
import java.util.Objects;

public class Ex11_9 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc");
        set.add(new Person("JA", 10));
        set.add(new Person("JA", 10));

        System.out.println(set);
    }
}

// set.add(new Person("JA", 10)); 중복 제거 안됨 -> equals와 hashcode를 오버라이딩을 안해서 일어남
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 중복 오류 방지 equals, hashcode
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) return false;

        Person p = (Person)obj;
        return this.name.equals(p.name) && this.age == p.age;
    }

    @Override
    public String toString() {
        return name + ":" + age;
    }
}
