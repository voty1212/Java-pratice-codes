public class NumberChecker {
    public static void main(String[] args) {
        int a=6;
        int b=10;
        int c=12;
        System.out.println(a+" is perfect or not:"+isPerfect(a));
        System.out.println(c+" is perfect or not:"+isPerfect(c));
        System.out.println(b+" is deficiate or not:"+isdeficiate(b));

    }
    public static boolean isPerfect(int a){
        int sum=0;
        for(int i=1;i<a;i++)
        {
            if(a%i==0){
                sum+=i;
            }
        }
    return sum==a;}
    public static boolean isdeficiate(int a){
        int sum=0;
        for(int i=1;i<a;i++)
        {
            if(a%i==0){
                sum+=i;
            }
    }
        return sum<a;
}}
