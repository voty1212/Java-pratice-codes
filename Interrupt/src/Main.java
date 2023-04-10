public class Main {
    public static void main(String[] args) {
        Interupted t1=new Interupted();
        t1.start();
        try
        {
            t1.interrupt();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}