public class Main {
    public static void main(String[] args) {
        int j=15;
        //Wrapper class
     Integer boxedInt=Integer.valueOf(j);
     Integer depricatedBoxing=new Integer(15);
     int unboxedInt=boxedInt.intValue();

     //Autoboxing
        Integer a=j;
        System.out.println(a.getClass().getName());
        //Unboxing
        int l=a;
    }
}