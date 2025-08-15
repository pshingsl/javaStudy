package javaStudy.ch05;

import java.util.Arrays;

public class Ex5_3 {
    // 배열의 반복문 2
    public static void main(String[] args) {
        // 정수 배열
        int[] arr1 = {100, 40, 30, 10};
        System.out.println("arr1: " + arr1); // 이상한 문자열 나옴

        // 이걸 해결하기 위해 반복문을 처리
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
            // arr[0] = 100, arr[1] =  40, arr[2] = 30, arr[3] =10;
        }
        System.out.println();
        // 향상된 for문
        for(int v1: arr1){
            System.out.println(v1+ " ");
        }
        // 다른 방법 Arrays.toString
        // 배열 형태로 [100, 40, 30, 10]으로 나온다.
        System.out.println(Arrays.toString(arr1));


        // 문자배열
        char[] c1 = {'A', 'B', 'C'};
        System.out.println(c1);
    }
}
