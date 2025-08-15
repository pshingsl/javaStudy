package javaStudy.ch05;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex5_4 {
    public static void main(String[] args) {
        // 배열 총합과 평균
        int[] arr = new int[5];
        int sum = 0;

        // 실수로 선언한 이유는 똑같이 나누어 떨이진다는 보장이 없다.
        // 그리고 소숫점 생기시에 실수형으로 처리를 안하면 소숫점 숫자가 날라감
        float avg = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0 * i + 10;
            sum += arr[i]; // sum = sum+arr[i];
            avg = sum / (float) arr.length;
        }
        System.out.println("총합: " + sum);
        System.out.println("평균: " + avg);

        // 최대값과 최소값
        int age[] = {10, 20, 30, 40, 50};
        int max = age[0];
        int min = age[0];
        for (int i = 0; i < age.length; i++) {
            if (age[i] > max) {
                max = age[i];
                // else로 초기화 하면 무조건 최소값이라고 해서 나중에 문제 생김 그래서 else if로 처리해야함
            } else if (age[i] < min) {
                min = age[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

        // 배열 찾기
        int arr2[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("arr2"+Arrays.toString(arr2));

        for(int i=0; i < arr2.length; i++){
            int n = (int)(Math.random()* arr2.length);
            int tmp = arr2[i]; // arr2[0]=0
            arr2[i] = arr2[n];
            arr2[n] = tmp;
        }
        System.out.println("arr2"+Arrays.toString(arr2));
    }
}
