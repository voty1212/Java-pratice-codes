public class Main {
    public static void main(String[] args) {
       int m=37;
       System.out.println(sod(m));
    }
    public static int sod(int d)
    {

        int j=d;
        int sum=0;
        while(j!=0)
        {
            int rem=j%10;
            sum+=rem;
            j /= 10;
        }
        return sum;
    }
    public static int checkData(int current_year,String dob)
    {
        int date=Integer.parseInt(dob);
        int minimum_year=current_year-125;
        if((date<minimum_year)||(date>current_year))
        {
            return -1;
        }
    }
}