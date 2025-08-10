package study.ch06;

public class Ex6_3 {
    public static void main(String[] args) {
        Book[] b = new Book[3]; // 처음에 null로 초기화

        for (int i = 0; i < b.length; i++) {
            b[i] = new Book();
            b[i].num = i + 10;
            b[i].bookNum();
        }
    }
}

class Book {
    String title;
    String author;
    int num;

    void title() {
        System.out.println(title);
    }

    void setAuthor() {
        System.out.println(author);
    }

    void bookNum() {
        System.out.println(num);
    }
}
