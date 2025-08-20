package javaStudy.ch12;

import java.util.ArrayList;

public class Ex12_1 {
    public static void main(String[] args) {
        CustomList list = new CustomList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        System.out.println("list: " + list.toString()); // [1, 2, 3, 4]
        // 추가
        System.out.println("list 조회: "+ list.get(1));

        // 삭제
        list.remove("2");
        System.out.println("list 수정: "+ list.toString());
        System.out.println();

        System.out.println("Generic 실습");
        Genere<String> list2 = new Genere<>();
        list2.add("초콜릿");
        list2.add("사탕");
        list2.add("과자");
        list2.add("젤리");
        System.out.println("list2: " + list2.toString()); // [초콜릿, 사탕, 과자, 젤리]

        // 조회
        System.out.println("Generic list 조회: " + list2.get(2)); // 과자

        // 삭제
        list2.remove("1");
        System.out.println("Generic list 수정 후 조회: " + list2.toString());

    }
}

class CustomList {
    ArrayList<String> list = new ArrayList<>();
    // 증가
    public void add(String element) {
        list.add(element);
    }

    // 삭제
    public void remove(String element) {
        list.remove(element);
    }

    // 요소확인
    public String get(int i){
        return list.get(i); // 조회
    }

    @Override
    public String toString() {
        return "CustomList " + list;
    }
}

class Genere<T> {
    ArrayList<T> list = new ArrayList<>();

    public void add(T element){
        list.add(element);
    }

    public void remove(T element){
        list.remove(element);
    }

    public T get(int i){
       return  list.get(i);
    }

    @Override
    public String toString() {
        return "Generic"+list;
    }
}