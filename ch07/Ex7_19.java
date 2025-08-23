package javaStudy.ch07;

class Ex7_19 {
    class Instance {
    }

    static class Static {
    }

    Instance i = new Instance();    // 인스턴스 멤버끼리는 직접 접근 가능
    Static s = new Static();        // static 멤버끼리는 직접 접근 가능

    static void staticMethod() {
        // Instance i = new Instance(); static멤버는 인스턴스 멤버에 직접접근 불가능
        Static s = new Static();

        Ex7_19 outer = new Ex7_19(); // 인스턴스클래스는 외부 클래스를 먼저 생성해야 생성 가능
        Instance obj = outer.new Instance();
    }

    void instanceMethod(){ // 인스턴스메서드에서는 인스턴스멤버와 statia멤버 모두 접근 가능
        Static obj2 = new Static();
        // Local obj3 = new Local(); 지역 내부 클래스는 외부에서 접근 할 수 없다.
    }

    void method() {
        class Local{}
        Local obj3 = new Local();
    }

    public static void main(String[] args) {

    }
}

