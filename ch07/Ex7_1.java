package study.ch07;

public class Ex7_1 {
    public static void main(String[] args) {
        Library l1 = new Library("이치조 미사키", 1087, "이별하는 방법을 알려줘", 19000);
        System.out.println("저자: " + l1.author);
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