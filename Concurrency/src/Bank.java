public class Bank {
    private double balance;
    private String accountNumber;

    public Bank(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    public void deposit(double amount){
        synchronized (this){
        balance+=amount;}
    }
    public void withdraw(double amount){
        synchronized (this){
        balance-=amount;}
    }
}
