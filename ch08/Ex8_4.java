package javaStudy.ch08;

public class Ex8_4 {
    public static void main(String[] args) {
        try{
            int[] arr = new int[3];
            arr[5] = 100;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열의 요소의 범위 오류");
        } catch (Exception e){
            System.out.println("알 수 없는 오류 발생");
        } finally {
            System.out.println("종료");
        }
    }
}
