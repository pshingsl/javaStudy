package javaStudy.ch03;

public class Ex3_7 {
    public static void main(String[] args) {
        // 조건(삼항) 연산자, 대입 연산자
        int a = 5, b= 10;

        // 조건(삼항) 연산자
        String v1 = a > 3 ? "정답": "틀림";
        System.out.println(v1);

        // a가b 보다 크면 a에 저장 그렇지 않으면 b에 저장
        int v2 = a > b ? a:b;
        System.out.println(v2);

        // 대입 연산자
        a += 2;
        System.out.println(a);
        a -= 2;
        System.out.println(a);
        a *= 2;
        System.out.println(a);
        a /= 2;
        System.out.println(a);
        a %= 2;
        System.out.println(a);
        // 대입 연산자의 좌변에서 형변환을 해서 오류남
        // 형변환 하려면 오른쪽에서 해야한다
        //double v3 = (double) a /= 2;
        //System.out.println(v3);
        
        double v3 = a /= (double) 2;
        System.out.println(v3); // 위의 나머지 대입 연산해서 0으로 나옴
    }
}
