package study.ch05;

public class Ex5_8 {
    public static void main(String[] args) {
        // 2차원 배열
        int score[][] = {
                {70, 60, 40, 100},
                {20, 40, 30, 90},
                {80, 90, 70, 80},
        };
        int sum = 0;

        // score.lenth = 0 1 2
        for (int i = 0; i < score.length; i++) {
            // j=0 score[0] = 70 score[1] = 60 score[2] = 40
            // 이제 연산이 끝나니 위에 반복문 실행하고 다시 여기 실행
            for (int j = 0; j < score[i].length; j++) {
                // printf부분에 score[i][j]로 처리하지 않으면 런타임 에러 나옴
                System.out.printf("score[%d][%d] = %d%n", i, j, score[i][j]);

                sum += score[i][j];
            }
        }
        System.out.println("sum=" + sum);
    }
}
