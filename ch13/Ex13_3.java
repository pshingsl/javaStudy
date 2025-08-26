package javaStudy.ch13;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex13_3 {
    public static void main(String[] args) {
        // 콜렉션
        List<String> list = Arrays.asList("abc", "aaa", "ddd", "eee", "eee");
        System.out.println(list);

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        //익명객체 람다식으로 표현
        List<String> list2 = Arrays.asList("abc", "aaa", "ddd", "eee", "eee");
        Collections.sort(list2, (o1, o2) -> o2.compareTo(o1));
    }
}
