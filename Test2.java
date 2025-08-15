package study;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("과목의 개수를 입력해주세요");

        try {
            int a = sc.nextInt();
            int[] arr = new int[a];
            int sum = 0;
            float avg = 0;

            if (a <= 0) {
                throw new NegativeArraySizeException();
            }

            System.out.println(a + "개의 점수를 입력해주세요");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
                avg = (float) sum / arr.length;
            }
            System.out.println("평균:" + avg);
        } catch (InputMismatchException e) {
            System.out.println("숫자로 입력해주세요. " + e.getMessage());
        } catch (NegativeArraySizeException e) {
            System.out.println("양의 정수로 입력해주세요. " + e.getMessage());
        } finally {
            System.out.println("프로그램 종료");
            sc.close();
        }
    }
}
