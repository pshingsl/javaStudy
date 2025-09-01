package javareview;

public class Employee {
    private String name;
    private String department;

    public Employee() {
        System.out.println("Employee() 생서자 호출");
    }

    public Employee(String name) {
        this.name = name;
    }
    public Employee(String name, String department) {
        this(name);
        this.department = department;
    }

    public static void main(String[] args) {
        // new 연산자로 이용한 객체 인스턴스화
        Employee employee = new Employee();
    }
}
