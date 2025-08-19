package javaStudy.ch11;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EX11_11 {
    public static void main(String[] args) {
        Set set = new TreeSet(new TestCom()); // 범위 검색, 정렬. 정렬 필요없음
    //    Set set1 = new HashSet(); // 정렬 필요에 사용

        for (int i = 0; i < set.size(); i++) {
            int n = (int) (Math.random() * 45) + 1;
            set.add(new Test());
        }

        System.out.println(set);
    }
}

class Test {

}

class TestCom implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
