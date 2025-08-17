package javaStudy.ch09;

public class Ex9_1 {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        System.out.println(v1 == v2);       // false
        System.out.println(v1.equals(v2));  // false
    }
}

class Value {
    int value;

    Value(int value) {
        this.value = value;
    }

    // Object의 equals()를 오버라이딩해서 주소가 아닌 value를 비교
    public boolean equals(Object obj) {
        // return this = obj; 주소 비교. 서로 다른 객체는 항상 거짓 -> 형변환 원래는 이렇게 됨

        if(!(obj instanceof Value)) return false;

        Value v= (Value)obj; //obj에는 value가 없어서 형변환 해야함
        return this.value == v.value;
    }
}
