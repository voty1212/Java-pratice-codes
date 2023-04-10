public class Printer {
   private int tonerLevel=0;
   int pages=0;
   boolean duplex=false;
   public Printer(int tonerLevel,boolean duplex)
   {
       this.tonerLevel=tonerLevel;
       this.duplex=duplex;
   }
    public int addToner(int tonerAmount)
    {
        tonerLevel=tonerLevel;
        if(tonerLevel>100)
    {
        tonerLevel=100;
    }
        else if(tonerLevel<0) {
            tonerLevel=0;
        } else {
            tonerLevel+=tonerAmount;
        }
        return tonerLevel;
    }



}
