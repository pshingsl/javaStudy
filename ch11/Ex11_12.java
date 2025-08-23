package javaStudy.ch11;

import java.util.HashMap;
import java.util.Scanner;

public class Ex11_12 {
    public static void main(String[] args) {
        // HashMap
        HashMap hashMap = new HashMap();

        // 데이터 추가
        hashMap.put("ID", "123");
        hashMap.put("ID1", "123");
        System.out.println(hashMap); // {ID1=123, ID=123}

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("아이디와 비밀번호를 입력해주세요");
            System.out.print("아이디: ");
            String id = sc.nextLine().trim();

            System.out.print("비밀번호: ");
            String password = sc.nextLine().trim();
            System.out.println();

            if (!hashMap.containsKey(id)) {
                System.out.println("입력하신 아이디는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            }
        }
    }
}
