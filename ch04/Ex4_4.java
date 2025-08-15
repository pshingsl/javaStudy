package study.ch04;

import java.util.Scanner;

public class Ex4_4 {
    public static void main(String[] args) {
        // switch + scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("현재 월을 입력해주세요.");

        int month = sc.nextInt();

        // 마지막 case나 default는 break이 없어도 된다.
        switch (month){
            case 3, 4, 5:
                System.out.println("지금은 계절은 봄입니다.");
                break;
            case 6, 7, 8:
                System.out.println("지금은 계절은  여름입니다.");
                break;
            case 9, 10, 11:
                System.out.println("지금은 계절은 가을입니다.");
                break;
            case 12, 1, 2:
                System.out.println("지금은 계절은 겨울입니다.");
                break;
            default:
                System.out.println("달력에 맞게 월을 입력해주세요.");
        }
    }
}
