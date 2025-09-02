package javareview;

public class StaticEx {
    private static String Staticmessage = "static message";
    private String instanceMesage;
   public StaticEx() {
       this.instanceMesage = "Instance Message";
   }

   // 인스턴스 메소드
   public void showInstanceMesage() {
       System.out.println(instanceMesage); // 인스턴스
       System.out.println(Staticmessage); // static 필드 접근
       StaticEx.showStaticMessage(); // static 메소드 접근
   }

   // static 메소드
    public static void showStaticMessage() {
        System.out.println(Staticmessage);
       // System.out.println(instanceMesage); static 메소드에서 인스턴스 접근 불가능
    }
}
