import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("배열의 크기를 입력하세요. : ");
        try {
            int a = sc.nextInt();

            if (a <= 0)
                throw new IllegalArgumentException();

            int[] arr = new int[a];
            System.out.println(a + " 개의 정수를 입력해주세요: ");

            for (int i = 0; i < arr.length; i++) {
                System.out.print("정수 " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
                list.add(arr[i]);
            }
            for (int i = 0; i < list.size(); i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(i).equals(list.get(j))) { // 이 부분이 조건문
                        System.out.println("중복 발견: " + list.get(i));
                    }
                }
            }
    } catch(
    InputMismatchException e)

    {
        System.out.println("숫자로 입력해주세요. " + e.getMessage());
    }
}
}