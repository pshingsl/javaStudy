package javaStudy.ch08;

import java.io.File;

import static java.nio.file.Files.createFile;

public class Ex8_3 {
    public static void main(String[] args) {
        try {
            File f= createFile("파일 실습.txt");
            System.out.println(f.getName() + "파일을 성공적으로 생성되었습니다.");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    static File createFile(String fileName) throws Exception{
        // 파일 생성 조건
        if(fileName == null || fileName.equals("")){
            throw new Exception("파일이름이 유효하지 않습니다.");
        }
        File f = new File(fileName);
        f.createNewFile();
        return f;
    }
}
