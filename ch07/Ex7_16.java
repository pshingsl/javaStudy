package javaStudy.ch07;

public class Ex7_16 {
    public static void main(String[] args) {
        // Fighter는 상속/인터페이스를 사용해서 모든 멤버사용 가능
        Fighter f = new Fighter();
        System.out.println();
//      Unit2 f = new Fighter(); Unit2에는 attack()이 없어서 호출 불가
        f.move(2, 5);
        f.attack(new Fighter());
        f.stop();
        System.out.println();
        /*Fighter f2 = new Figthtable();
        f2.attack(f2)

        Fightable f3 = new Fighter();
        f3.attack(f3);
        10~14 코드는 8코드와 같은 코드이다.
         */

        // abstract class Unit2에 정의된거만 사용 가능 -> 인터페이스에 정의된거만 사용 가능
        System.out.println("추상 클래스 Unit2");
        Unit2 u = new Fighter();
        u.move(2, 5);
        u.stop();
        System.out.println();
        // u.attack(); 오류 -> Unit2에는 attack();이 없어서이다.

        // interface Figthtable 메소드만 사용가능 -> 인터페이스에 정의된거만 사용 가능
        System.out.println("Fightable 인터페이스");
        Figthtable f2 = new Fighter();
        f2.move(2, 3);
        f2.attack(f2);
        // f2.stop(); -> Figthtable 인터페이스에는 stop이 없어서 안됨

        // 인터페이스 메소드 리턴 반환
        Figthtable f3 =  f.getFightable(); // Figthtable반환 타입어서 앞에 Figthtable 맞춰야한다.
    }
}

/*
 * abstract 클래스에서 메소드 정으시
 * abstract void move(int x,int y); abstract 붙일 시 ;로 끝나야함
 * abstract 생략시 메소드 안에{ ; } 로 끝나야한다.
 * */

abstract class Unit2 {
    int x, y;

    abstract void move(int x, int y);

    void stop() {
        System.out.println("멈춘다.");
    }
}

interface Figthtable {
    void move(int x, int y);    // public abstract 생략가능

    void attack(Figthtable f);  // public abstract 생략가능
}

class Fighter extends Unit2 implements Figthtable {
    // 오버라이딩 규칙: 조상(public)보다 접근제한자가 좁으면 안된다.
    public void move(int x, int y) {
        System.out.println("[" + x + "," + y + "]로 이동");
    }

    public void attack(Figthtable f) {
        System.out.println(f + "를 공격");
    }

    // 인터페이스 메소드 리턴
    Figthtable getFightable() {
        Fighter f = new Fighter();
        return f; // f앞에 (Fightable) 생략
    }
}

