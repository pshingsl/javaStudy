package javaStudy.ch03;

public class Ex3_2 {
    public static void main(String[] args) {
        // 후위형
        int i  = 3, j  = 1;
        j =i;
        i++;
        System.out.println("j = i++ 실행 후, i =" + i +", j=" +j);

        i=3;       // 결과 비교를 위해 원래의 값으로 다시 변경
        j=1;;

        // 전위형
        ++i;
        j = i;
        System.out.println("j = ++i 실행 후, i =" + i +", j=" +j);

        i = +i;
        System.out.println("부호 연산자+ :" + i); // -10

        i = -i;;
        System.out.println("부호 연산자-: "+i); // 10
    }
}
