package javaStudy.ch05;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex5_9 {
    public static void main(String[] args) {
        // 배열의 비교와 출력 및 메서드
        int[] arr = {0, 1, 2, 3, 4};
        int[][] arr2D = {{1, 2}, {3, 4}};

        // Arrays.toString: 일반 배열출력 할때 사용

        System.out.println(Arrays.toString(arr));       // [0, 1, 2, 3, 4]

        // Arrays.deepToString: 2차원 이상 배열 다룰 때 사용
        System.out.println(Arrays.deepToString(arr2D)); // [[1, 2], [3, 4]]
        System.out.println();

        System.out.println("=== 배열의 복사 ===");
        // 배열의 복사

        // Arrays.copyOf(arr, arr.length); 해당 배열의 길이 만큼 복사
        int arr2[] = Arrays.copyOf(arr, arr.length);          // arr2 = [0, 1, 2, 3, 4]

        // Arrays.copyOf(arr, 3); 0~2까지 배열의 길이 복사
        int arr3[] = Arrays.copyOf(arr, 3);

        //  Arrays.copyOf(arr, 7); 0~4까지 배열의 길이 복사 나머지는 0으로 채움
        int arr4[] = Arrays.copyOf(arr, 7);        //  arr4 = [0, 1, 2, 3, 4, 0, 0]

        // 인덱스 2부터 해당 인덱스(4)-1 까지 복사
        int arr5[] = Arrays.copyOfRange(arr, 2, 4); //  arr3 = [2, 3]

        // 인덱스 0부터 해당인덱스(7)-1까지 복사 배열의 길이를 넘기면 0으로 채움
        int arr6[] = Arrays.copyOfRange(arr, 0, 7); //  arr3 = [0, 1, 2, 3, 4, ]

        int ar2[] = {2, 3, 1, 2, 5};
        // int re = Arrays.sort(ar2); 에러발생
        // 이유:  Arrays.sort()는 리턴값이 없어서 새로운 변수에 담을 수 없다.
        // 따라서 void여서 타입 에러발생!
        Arrays.sort(ar2);
        System.out.println("정렬: " + Arrays.toString(ar2));

    }
}
