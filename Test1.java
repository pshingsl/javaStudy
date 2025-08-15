package study;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        try {
            for (int i = 0; i < 5; i++) {
                arr[i] = i + 1;
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException err){
            System.out.println("인덱스가 범위를 벗었났습니다.");
        }
    }
}
