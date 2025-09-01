package javaStudy.ch14;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_2 {
    public static void main(String[] args) {
        String[] arr = {
                "Inheritance", "java", "lamde", "stream",
                "Optional", "IntStream", "Count", "sum"
        };

        Stream.of(arr).forEachOrdered(System.out::println); // arr 값 출력

        // 검사
        boolean noEmptyStr = Stream.of(arr).noneMatch(s -> s.length()==0);
        Optional<String> word = Stream.of(arr).filter(s->s.charAt(0)=='s').findFirst();

        System.out.println("noEmptyStr: " + noEmptyStr);
        System.out.println("word: " + word);

        // Stream<String[]> -> IntStream 변환
        IntStream intStream1 = Stream.of(arr).mapToInt(String::length);
        IntStream intStream2 = Stream.of(arr).mapToInt(String::length);

        int sum = intStream1.reduce(0, (a,b) -> a+b);
        int multi = intStream2.reduce(0, (a,b) -> a*b);


        System.out.println("sum " + sum);
        System.out.println("multi " + multi);


    }
}
