package javaStudy.ch11;

import java.util.*;

public class Ex11_8 {
    public static void main(String[] args) {
        // set은 순서 보장하지 않는다. 중복을 허용하지 않는다.
        Object[] objArr = {"1", "2", "2", "2", "3", "3", "4", "4", "4"};
        Set set = new HashSet();

        for (int i = 0; i < objArr.length; i++) {
            set.add(objArr[i]);
        }
        // HashSet에 저장된 요소들을 출력
        System.out.println(set); // 중복 삭제 [1, 2, 3, 4]

        //  HashSet에 저장된 요소 출력(Iterator)
        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            // 지금은 순서대로 할당 했지만 순서 보장을 할 수 없다.
            System.out.println(iterator.next()); // 1 2 3 4 줄 바꿈으로 출력
        }

        Set set1 = new HashSet();
        for (int i = 0; i < set1.size(); i++) {
            int num = (int) (Math.random() * 45) + 1; // 45개의 숫자 랜덤 사용
            set1.add(num);
        }

        List list = new ArrayList(set1);
        Collections.sort(list);
        System.out.println(list);
    }
}
