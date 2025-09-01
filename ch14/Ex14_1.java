package javaStudy.ch14;

import java.util.Comparator;
import java.util.stream.Stream;

public class Ex14_1 {
    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(
                new Student("ch1", 3, 300),
                new Student("ch2", 3, 300),
                new Student("ch3", 3, 300),
                new Student("ch4", 3, 300),
                new Student("ch5", 3, 300),
                new Student("ch6", 3, 300)
        );

        studentStream.sorted(Comparator.comparing(Student::getBan) // 반별 정렬
                .thenComparing(Comparator.naturalOrder())) // 기본 정렬
                .forEach(System.out::println);
    }
}

class Student implements Comparable<Student> {
    private String name;
    private int ban;
    private int totalScore;

    public Student(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBan() {
        return ban;
    }

    public void setBan(int ban) {
        this.ban = ban;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ban=" + ban +
                ", totalScore=" + totalScore +
                '}';
    }

    @Override
    public int compareTo(Student s) {
        return s.totalScore - this.totalScore;
    }
}
