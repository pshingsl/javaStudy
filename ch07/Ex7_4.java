package javaStudy.ch07;

public class Ex7_4 {
    public static void main(String[] args) {
        Porty pt = new Porty(10,2,5);
        System.out.println(pt.x);
        System.out.println(pt.y);
        System.out.println(pt.z);
    }
}

class Point4{
    int x;
    int y;

    Point4(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Porty extends Point4{
    int z;
    Porty(int x, int y, int z){
        super(x, y);
        this.z =z;
    }
}