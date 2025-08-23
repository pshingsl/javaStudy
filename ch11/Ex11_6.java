package javaStudy.ch11;

import java.util.Arrays;

public class Ex11_6 {
    public static void main(String[] args) {
        // Arrays 실습
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("arr="+ Arrays.toString(arr));       // arr=[1, 2, 3, 4, 5, 6, 7]
        System.out.println("arr="+ Arrays.toString(arr2));      // 주소값 출력
        System.out.println("arr="+ Arrays.deepToString(arr2));  // arr=[[1, 2, 3], [4, 5, 6]]

        // 배열 복사
        int[] ar = Arrays.copyOf(arr, arr.length);           // 주소값
        int[] ar2 = Arrays.copyOf(arr,3);          // [1,2,3]
        int[] ar3 = Arrays.copyOf(arr, 8);         // [1, 2, 3, 4, 5, 6, 7, 0]
        int[] ar4 = Arrays.copyOfRange(arr, 2,4);   // [3,4]
        int[] ar5 = Arrays.copyOfRange(arr, 0, 7);  // [1, 2, 3, 4, 5, 6, 7]
        System.out.println();

        // 배열 채우기
        int[] arr3 = new int[5];    // [0,0,0,0,0]
        Arrays.fill(arr3, 9);  // [9, 9, 9, 9, 9] -> 해당 배열값 전부 지정한 숫자로 채우기
        System.out.println(Arrays.toString(arr3));

        Arrays.setAll(arr3, i -> (int)(Math.random()*6)+1); // 랜덤 배열 출력

        for(int i: arr3) {
            char[] g = new char[i];
            Arrays.fill(g, '*');
            System.out.println(new String(g)+1);
        }

        // 배열탐색/정렬
        char[] cArr= {'A', 'C', 'E', 'F', 'B'};
        System.out.println(Arrays.toString(cArr));
        Arrays.sort(cArr);
        // 정렬 후 binarySearch해야 정상으로 작동한다 0번째 요소부터 오른쪽으로 탐색
        System.out.println("serch " + Arrays.binarySearch(cArr, 'C'));

    }
}
