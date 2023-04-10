public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private long customerNumber;
    public Account(){
        this("12313",2.50,"Default","Default",00000);
        System.out.println("Constructor is called");
    }
    public Account(String number,double balance,String customerName,String customerEmail,long customerNumber)
    {
        System.out.println("Account constructor called");
        this.number=number;
        this.balance=balance;
        this.customerEmail=customerEmail;
        this.customerName=customerName;
        this.customerNumber=customerNumber;
    }
    public void depositFunds(double depositAmount)
    {
        balance+=depositAmount;
        System.out.println("Deposit of Rs"+depositAmount+" makes total amount "+balance);
    }
    public void withdrawMoney(double withdrawalAmount)
    {
        if(balance-withdrawalAmount<0)
            System.out.println("Insufficient funds");
        else{
            balance-=withdrawalAmount;
            System.out.println("Remaining balance is "+balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public long getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(long customerNumber) {
        this.customerNumber = customerNumber;
    }
}
