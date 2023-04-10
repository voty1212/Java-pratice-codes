public class Main {
    public static void main(String[] args) {
   Bank bank=new Bank(10000.00,"123-456");
 /*  Thread t1=new Thread(){
       public void run(){
           bank.deposit(100);
           bank.withdraw(10);
       }

   };
   Thread t2=new Thread(){
       public void run(){
           bank.deposit(100000);
           bank.withdraw(34);
       }
   };*/

Thread t1=new Thread(new Runnable() {
    @Override
    public void run() {
        bank.deposit(100);
        bank.withdraw(10);
    }
});
Thread t2=new Thread(new Runnable() {
    @Override
    public void run() {
        bank.deposit(100000);
        bank.withdraw(34);
    }
});
    t1.start();
    t2.start();}
}