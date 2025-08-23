package javaStudy.ch11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Ex11_1 {
    public static void main(String[] args) {
        // 기본 길이(용량, capacity)가 10인 ArrayList를 생성
        ArrayList list1 = new ArrayList(10);
        // ArrayList에는 객체만 저장가능 -> 원래는 안되는데 autoboxing에 의해 기본형이 참조형으로 자동변환
        System.out.println(list1); // [] 처음 빈 배열 출력
        list1.add(5);
        list1.add(4);
        list1.add(2);
        list1.add(0);
        list1.add(1);
        list1.add(3);
        System.out.println(list1); // [5, 4, 2, 0, 1, 3]
        System.out.println();

        // subList(시작, 마지막-1) -> 읽기 전용으로 사용 ArrayList(Collection c)이 해당
        ArrayList list2 = new ArrayList(list1.subList(1, 4));
        print(list1, list2);
        System.out.println(list2); // [4, 2, 0]
        System.out.println();

        // 정렬 Collection은 인터페이스, Collections는 유틸 클래스
        Collections.sort(list1); //[0, 1, 2, 3, 4, 5]
        Collections.sort(list2); // [0, 2, 4]
        System.out.println();
        // 모든 요소 포함 검사 -> containsAll()
        // 반환: true or false
        System.out.println("list1.containsAll(list2) " + list1.containsAll(list2));
        list2.add("B");
        list2.add("C");
        list2.add(3, "A");
        System.out.println(list2);
        System.out.println();

        // set 변경 -> 해당 요소 값을 변경해라
        list2.set(3, "AA");
        System.out.println(list2);
        System.out.println();

        // indexOf()는 지정된 객체의 위치(인덱스)를 알려준다
        // ""로 조건을 넣으면 0번째 부터 순차적으로 확인해서 ""이 가까운곳을 반환
        // 숫자로 하면 0번쨰 부터 시작 순차적으로 확앤서 해당 숫자 있는곳을 반환
        list1.add(0, "1"); // [1, 0, 1, 2, 3, 4, 5]
        System.out.println(list1.indexOf(1));

        // remove 해당 위치 값 삭제 후 배열로 반환
        list1.remove(1); // [1, 1, 2, 3, 4, 5] 인덱스가 1인 객체를 삭제
        System.out.println(list1);

        // retainAll -> 리스트들의 겹치는 부분을 남기고 나머지 삭제 -> 교집합
        System.out.println(list1.retainAll(list2)); // [2,4]

        // contains 리스트들의 포함된 객체들을 삭제한다.
        for (int i =  list2.size() - 1; i >= 0; i--) {
            if (list1.contains(list2)) {
                list2.remove(i);
            }
        }
        System.out.println(list2);
    }

    private static void print(ArrayList list1, ArrayList list2) {
        System.out.println(list1);
        System.out.println(list2);
        System.out.println();
    }
}
