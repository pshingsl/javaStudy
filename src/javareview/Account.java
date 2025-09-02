package javareview;

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double withdraw(double amont) {
        if(balance < amont){
            System.out.println("잔액 부족");
        } else{
            balance -= amont;
        }
        return balance;
    }
}
