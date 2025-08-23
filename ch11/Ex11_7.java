package javaStudy.ch11;

import java.util.Arrays;
import java.util.Comparator;

public class Ex11_7 {
    public static void main(String[] args) {
        String[] arr = {"cat", "dog", "lion", "Tiger"};

        Arrays.sort(arr);
        System.out.println("arr: " + Arrays.toString(arr));

        Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER);
        System.out.println("arr: " + Arrays.toString(arr));

        Arrays.sort(arr, new Descending()); // 역순정렬
        System.out.println("arr: " + Arrays.toString(arr));
    }
}
    class Descending implements Comparator {
        public int compare(Object o1, Object o2) {
            if (o1 instanceof Comparable && o2 instanceof Comparable) {
                Comparable c1 = (Comparable) o1;
                Comparable c2 = (Comparable) o2;
                return c1.compareTo(c2) * -1;  // -1을 곱해야 기본 정렬방식의 역으로
            }
            return -1;
        }
    }

