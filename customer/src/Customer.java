public class Customer {
    public String getName() {
        return Name;
    }

    public long getCredit_limit() {
        return credit_limit;
    }

    public String getEmail() {
        return email;
    }

    private String Name;
    private long credit_limit;
    private String email;
   public Customer(String Name,long credit_limit,String email){
       this.Name=Name;
       this.credit_limit=credit_limit;
       this.email=email;

   }
   public Customer(){
       this("Default", (long) 12173173l,"default");
   }
   public Customer(String Name,String email)
   {
     this("Srinivasan",100,"Srinivasan@gmail.com");
   }
}
