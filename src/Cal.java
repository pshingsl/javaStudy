import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        // 입력을 받는데 문자열로 받아옴
        Scanner sc = new Scanner(System.in);

        Calc c = new Calc();
        while (true) {
            System.out.println("두 숫자를 입력해주세요.");
            int a = sc.nextInt();
            int b = sc.nextInt();

            char opt = sc.next().charAt(0); // 입력 받아야함 next() 문자열을 반환
            // charAt는 문자로 추출하는 과정 우리는 기호만 받아올거니까 이걸 사용함
            switch (opt) {
                case '+':
                    System.out.println(c.add(a, b));
                    break;
                case '-':
                    System.out.println(c.minus(a, b));
                    break;
                case '*':
                    System.out.println(c.multi(a, b));
                    break;
                case '/':
                    System.out.println(c.divide(a, b));
                    break;
                default:
                    System.out.println("잘못된 기호 입니다. +, - ,*, / 중 골라주세요!");
            }
        }
    }
}

class Calc {
    int a;
    int b;

    //  this로 초기화하면 메서드와 클래스의 매개변수가 달라서 리턴할때 0으로 됨
    
    public int add(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int multi(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (a == 0 && b == 0) {
            System.out.println("0을 대입해서 나눌 수 없습니다.");
        }
        return (double) a / b;
    }
}
