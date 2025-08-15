package javaStudy.ch05;

public class Ex5_7 {
    public static void main(String[] args) {
        System.out.println("매개변수:" + args); // 터미널에 이상한 글자로 나온다.
        System.out.println("매개변수의 개수:" + args.length); // 0
        for(int i=0; i<args.length; i++){
            System.out.println("args[" + i + "] = \""+ args+"\"");
        }
    }
}
