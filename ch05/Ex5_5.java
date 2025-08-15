package study.ch05;

public class Ex5_5 {
    public static void main(String[] args) {
        // String 배열
        // 문자열 배열 선언
        String arr[] = new String[3];

// 문자열 배열 선언 및 초기화
        String arr2[] = {"test1", "test2", "test3"};

        String[] arr3 = {"Java", "Java"};
        System.out.println(arr3[0] == arr3[1]); // true (같은 리터럴은 같은 객체)

        for(int i=0; i<arr2.length; i++){
            // arr2[i] = i;
            // 에러 발생 정수를 문자열 배열에 그대로 넣으려 해서 타입이 맞지 않아 생긴 오류
            System.out.println("arr2: " + arr2[i]);
        }

        // 랜덤 배열
        // 배열 생성
        String arr4[] = {"t1", "t2", "t3", "t4" };
        System.out.println();
        //랜덤 메소드 사용
        for(int i=0; i<arr4.length; i++) {
            int r = (int) (Math.random() * arr4.length);
            System.out.println(r); // 0~3 중 하나만 랜덤출력
            System.out.println();

            String tmp = arr4[i];
            System.out.print("tmp: " +tmp + " ");  // 현재 위치(i)의 값을 임시 변수에 저장


            arr4[i] = arr4[r];
           System.out.println(arr4[i]);  // 현재 위치의 값을 r번째 값으로 교체 (임시 교환 시도)

            arr4[i] = tmp;
            System.out.println("12: "+tmp); // 교체했던 값을 다시 원래 값으로 복구 → 실제 배열은 변하지 않음
        }

    }
}
