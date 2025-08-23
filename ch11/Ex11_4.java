package javaStudy.ch11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex11_4 {
    static Queue q = new LinkedList();
    static final int MAX_SIZE = 5; // 최대 5개까지 저장하는 상수 선언

    public static void main(String[] args) {
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

        while (true){
            System.out.println(">>");
            try {
                Scanner sc = new Scanner(System.in);
                String in = sc.nextLine().trim();

                // 입력을 받는게 없으면 계속해서 실횅
                if("".equals(in)) continue;

                // 대소문자 상관없이 해당 글자이면 종료
                if(in.equalsIgnoreCase("q")){
                    System.exit(0);
                } else if(in.equalsIgnoreCase("help")){
                    System.out.println("help - 도움말 보여주기");
                    System.out.println(" q또는 Q - 프로그램 닫기");
                    System.out.println("history - 최근에 입력한 명령어" + MAX_SIZE + "개보여주기");
                }else if(in.equalsIgnoreCase("history")){
                    save(in);
                }
            }catch (Exception e){
                System.out.println("입력오류");
            }
        }
    }

    private static void save(String in) {
        if(!"".equals(in)){
            q.offer(in);
        }

        if(q.size() > MAX_SIZE){
            q.remove();
        }
    }
}
