package javaStudy.ch07;

import java.util.Scanner;

public class Ex7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("저자, 책번호, 제목, 가격을 입력해주세요.");

        String author = sc.nextLine();
        int num = sc.nextInt();
        sc.nextLine();
        String title= sc.nextLine();
        int price = sc.nextInt();
        sc.nextLine();

        Library l1 = new Library(author, num, title, price);
        System.out.println("저자: " + l1.author);
        System.out.println("책 번호: " + l1.num);
        System.out.println("책 제목: " + l1.title);
        System.out.println("책 가격: " + l1.price + "원");
    }
}

class Book {
    int num;
    String title;
    int price;

    Book(int num, String title, int price) {
        this.num = num;
        this.title = title;
        this.price = price;
    }
}

class Library extends Book {
    String author;

    Library(String author, int num, String title, int price) {
        super(num, title, price);
        this.author = author;
    }
}