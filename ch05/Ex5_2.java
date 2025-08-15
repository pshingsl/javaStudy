package javaStudy.ch05;

public class Ex5_2 {
    public static void main(String[] args) {
        // 배열 반복문 활용
        System.out.println("== 배열의 길이 ==");
        int arr[] = new int[6]; // 길이가 6인 배열 생성
        System.out.println(arr.length);

        int[] arr2 = new int[6];
        for (int i = 0; i < arr2.length; i++) {
            // 배열을 총 개수를 담을 변수 선언
            arr2[i] = i * 10 + 10;
            System.out.println(arr2[i]);
        }
    }
}
