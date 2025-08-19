package javaStudy.ch11;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex11_5 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        list1.add("5");

        Iterator iterator = list1.iterator();

        // [1,2,3,4,5] 검사
        while (iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }

        // 실행 안됨 -> iterator는 일회성이다. 밑에 문장을 수행하기 위해 새로운  iteratotr를 가져와야함
        while (iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }
}
